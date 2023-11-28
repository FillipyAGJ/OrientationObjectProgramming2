package Exercicios.lista10.questao01;

public class Elevador {
    private final static int TERREO = 0;
    private int andarAtual = TERREO;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public void inicializar(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.andarAtual = andarAtual;
    }

    public void entrar() {
        if(pessoasPresentes < capacidade) {
            pessoasPresentes++;
        } else {
            System.out.println("Já está cheio.");
        }
    }

    public void sair() {
        if(pessoasPresentes > 0) {
            pessoasPresentes--;
        } else {
            System.out.println("Elevador já está vazio");
        }
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("Elevador já está no ultimo andar");
        }
    }

    public void descer() {
        if(andarAtual > TERREO) {
            andarAtual--;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
}
