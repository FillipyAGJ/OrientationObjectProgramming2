package Exercicios.lista09.questao01;

public class BimestreTesteMain {
    public static void main(String[] args) {
        Prova prova = new Prova("Fillipy", 7.5, 35.5, 20, false);
        Seminario seminario = new Seminario("Fillipy", 8.1, 6, "Qual a diferenças entre SQL e NOSQL");
        EstudoDirigido estudoDirigido = new EstudoDirigido("Fillipy", 9.0, 5, "teste prático");

        Bimestre bimestre = new Bimestre();
        bimestre.setIdBimestre("2");
        bimestre.setAv1(prova);
        bimestre.setAv2(seminario);
        bimestre.setAv3(estudoDirigido);

        bimestre.imprimirAvaliacoes();
    }
}
