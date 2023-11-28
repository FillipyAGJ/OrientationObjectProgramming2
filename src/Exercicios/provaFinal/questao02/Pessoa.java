package Exercicios.provaFinal.questao02;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String sexo;

    public double IMC() {
        double imc = this.peso / Math.pow(this.altura, 2);

        if(imc <= 18.5) {
            System.out.println("Abaixo do peso normal e seu imc é = " + imc);
        } else if (imc > 18.5 && imc <= 25 ) {
            System.out.println("Peso Normal e seu imc é = " + imc);
        } else if (imc > 25 && imc <= 30 ) {
            System.out.println("Acima do peso normal e seu imc é = " + imc);
        } else {
            System.out.println("Obesidade e seu imc é = " + imc);
        }
        return imc;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + IMC();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
