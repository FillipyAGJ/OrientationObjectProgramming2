package Exercicios.provaFinal.questao10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Partida implements Classificacao{
    private int fase = 1;
    private int rodada = 1;
    private Selecao home;
    private Selecao visitor;

    public void verificaFavoritismo(Selecao home, Selecao visitor) {
        home = this.home;
        visitor = this.visitor;

        if(home.isFavorita() && visitor.isFavorita()) {
            System.out.println("Ambas são favoritas");
        } else if (home.isFavorita() && !visitor.isFavorita()) {
            System.out.println("Time da casa é favorita");
        } else if(!home.isFavorita() && visitor.isFavorita()){
            System.out.println("Time visitante é favorito");
        }
    }

    public void jogarPartida() {
        System.out.println("Fase: " + getFase());
        setFase(getFase()+1);
        System.out.println("Rodada: " + getRodada());
    }

    @Override
    public void atualizaStatus(Grupo grupo) {
        grupo.setRodada(grupo.getRodada()+1);
    }

    @Override
    public void classificaSelecao() {
        if (rodada == 4 && home.getPontos() == 24) {
            System.out.println(home.getNome() + " está classificado(a)");
        } else if (rodada == 4 && visitor.getPontos() == 24) {
            System.out.println(visitor.getNome() + " está classificado(a)");
        }
    }
    @Override
    public void mostraTabela(Partida fase, Grupo grupo) {

        System.out.println("Tabela: ");
        System.out.println("fase: " + fase.fase);
        System.out.println("grupo: " + grupo.getNome());

        ArrayList<Selecao> ArrayOrdenado = this.getHome().getGrupo().getSelecoes();

        Collections.sort(ArrayOrdenado, Comparator.comparing(Selecao::getNome));

        for (Selecao selecao: ArrayOrdenado) {
            System.out.println("--------------------------------------------");
            System.out.println("nome: " + selecao.getNome());
            System.out.println("pontos: " + selecao.getPontos());
            System.out.println("partidas: " + selecao.getPartida());
            System.out.println("vitorias: " + selecao.getVitorias());
            System.out.println("empates: " + selecao.getEmpates());
            System.out.println("derrotas: " + selecao.getDerrotas());
            System.out.println("--------------------------------------------");
        }
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public Selecao getHome() {
        return home;
    }

    public void setHome(Selecao home) {
        this.home = home;
    }

    public Selecao getVisitor() {
        return visitor;
    }

    public void setVisitor(Selecao visitor) {
        this.visitor = visitor;
    }
}
