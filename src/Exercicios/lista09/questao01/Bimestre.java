package Exercicios.lista09.questao01;

public class Bimestre {
    private String idBimestre;
    private Avaliacao av1;
    private Avaliacao av2;
    private Avaliacao av3;

    public void imprimirAvaliacoes() {
        System.out.println("Avaliação 01: " + av1.getNota());
        System.out.println("Avaliação 02: " + av2.getNota());
        System.out.println("Avaliação 03: " + av3.getNota());
    };

    public String getIdBimestre() {
        return idBimestre;
    }

    public void setIdBimestre(String idBimestre) {
        this.idBimestre = idBimestre;
    }

    public Avaliacao getAv1() {
        return av1;
    }

    public void setAv1(Avaliacao av1) {
        this.av1 = av1;
    }

    public Avaliacao getAv2() {
        return av2;
    }

    public void setAv2(Avaliacao av2) {
        this.av2 = av2;
    }

    public Avaliacao getAv3() {
        return av3;
    }

    public void setAv3(Avaliacao av3) {
        this.av3 = av3;
    }
}
