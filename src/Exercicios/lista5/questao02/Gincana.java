package Exercicios.lista5.questao02;

public class Gincana {
    private Equipe[] equipes;

    public void somar() {

        int soma = 0;
        for (Equipe equipe: this.equipes) {
            soma += equipe.getQtdDePontos();
        }
        System.out.println("Pontuação total: ");
        System.out.println(soma);
    }

    public void finalizarGincana() {
        int posicao = 3;

        somar();

        bubbleSort(this.equipes);

        System.out.println("Ranking: ");
        for(int i=0; i < equipes.length; i++){
            System.out.print( equipes[i].getNome() + " - " + posicao + "º lugar: "+ equipes[i].getQtdDePontos() + " pontos.\n");
            posicao--;
        }
        System.out.println("");
    }

    public void setEquipes (Equipe[] equipes) {
        this.equipes = equipes;
    }
    public Equipe[] getEquipes() {
        return equipes;
    }

    public static void bubbleSort(Equipe[] arr) {
        int n = arr.length;
        int temp = 0;
        String temp2 = "";
        for (int i =0; i < n ; i++) {
            for (int j=1; j < (n-i) ; j++) {
                if(arr[j-1].getQtdDePontos() > arr[j].getQtdDePontos()) {
                    temp = arr[j-1].getQtdDePontos();
                    temp2 = arr[j-1].getNome();
                    arr[j-1].setQtdDePontos(arr[j].getQtdDePontos());
                    arr[j-1].setNome(arr[j].getNome());
                    arr[j].setQtdDePontos(temp);
                    arr[j].setNome(temp2);
                }
            }
        }
    }
}
