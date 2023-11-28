package Exercicios.lista10.questao04;

public class Onibus extends Veiculo{
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.print(", Assentos: " + assentos);
    }
}
