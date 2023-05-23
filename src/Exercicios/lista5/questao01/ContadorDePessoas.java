package Exercicios.lista5.questao01;

public class ContadorDePessoas {
    private int limitePessoas;
    private int qtdPresentes;
    private int qtdTotal;

    public ContadorDePessoas (int limite) {
        this.limitePessoas = limite;
    }

    public void registraEntrada(int quantidade) {
        if((qtdPresentes + quantidade ) <= limitePessoas ) {
            this.qtdPresentes += quantidade;
            this.qtdTotal += quantidade;
        } else {
            System.out.println("Não foi possível entrar mais pessoas");
        }
    }

    public void registraSaida(int quantidade) {
        if (qtdPresentes > 0 && (qtdPresentes - quantidade >= 0)) {
            this.qtdPresentes -= quantidade;
        } else {
            System.out.println("Não foi possível realizar operação");
        }
    }

    public void mostrarRelatorio() {
        System.out.println("Quantidade presente: " + this.qtdPresentes + "\nQuantidade total: " + this.qtdTotal);
    }

}
