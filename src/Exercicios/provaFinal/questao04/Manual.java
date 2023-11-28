package Exercicios.provaFinal.questao04;

public class Manual extends Automovel{
    public boolean embreagem;
    public Manual() {};
    public void pisarNaEmbreagem() {
        this.embreagem = true;
    };

    public void soltarEmbreagem() {
        this.embreagem = false;
    };

    public void acelerar(int rpm) {
        System.out.println("Acelerou: " + rpm);
    };
}
