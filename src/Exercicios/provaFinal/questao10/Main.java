package Exercicios.provaFinal.questao10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        grupo.setNome("grupo A");
        grupo.setRodada(1);

        Selecao selecao = new Selecao();
        selecao.setNome("Brasil");
        selecao.setGrupo(grupo);
        selecao.setFavorita(true);

        Selecao selecao2 = new Selecao();
        selecao2.setNome("Argentina");
        selecao2.setGrupo(grupo);
        selecao2.setFavorita(true);

        Selecao selecao3 = new Selecao();
        selecao3.setNome("Chile");
        selecao3.setGrupo(grupo);
        selecao3.setFavorita(false);

        Selecao selecao4 = new Selecao();
        selecao4.setNome("Uruguai");
        selecao4.setGrupo(grupo);
        selecao4.setFavorita(false);

        ArrayList<Selecao> selecoes = new ArrayList<Selecao>();
        selecoes.add(selecao);
        selecoes.add(selecao2);
        selecoes.add(selecao3);
        selecoes.add(selecao4);

        grupo.setSelecoes(selecoes);

        Partida partida = new Partida();
        partida.setFase(1);
        partida.setHome(selecao);
        partida.setVisitor(selecao2);
        partida.setRodada(1);

        partida.jogarPartida();
        partida.verificaFavoritismo(selecao, selecao2);
        partida.getHome().ganharPartida(2, 0, 2);
        partida.getVisitor().perderPartida(0, 0, 0);
        partida.atualizaStatus(grupo);
        partida.classificaSelecao();
        partida.mostraTabela(partida, grupo);

    }
}
