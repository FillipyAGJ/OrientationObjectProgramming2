package Exercicios.lista10.questao04;

public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo() {}
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void exibirDados() {
        System.out.println("Placa: " + placa + ", Ano: " + ano);
    }
}
