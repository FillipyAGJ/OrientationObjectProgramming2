package Exercicios.provaFinal.questao08;


public class Papagaio extends Ave {
    private String vocabulario;

    public void setVocabulario(String vocabulario) {
        this.vocabulario = vocabulario;
    }

    @Override
    public void falar() {
        System.out.println(vocabulario);
    }
}
