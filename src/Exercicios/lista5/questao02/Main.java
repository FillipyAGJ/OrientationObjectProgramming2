package Exercicios.lista5.questao02;

public class Main {
    public static void main(String[] args) {

        Equipe[] equipes = new Equipe[3];

        Equipe equipe = new Equipe();
        equipe.setNome("Cangaceiros do axe");
        equipe.adicionarPontos(20);

        Equipe equipe2 = new Equipe();
        equipe2.setNome("Os apaixonados do sertão");
        equipe2.adicionarPontos(35);

        Equipe equipe3 = new Equipe();
        equipe3.setNome("Cavaleiros do forro");
        equipe3.adicionarPontos(23);

        equipes[0] = equipe;
        equipes[1] = equipe2;
        equipes[2] = equipe3;

        Gincana gincana = new Gincana();
        gincana.setEquipes(equipes);

        gincana.finalizarGincana();
    }
}
