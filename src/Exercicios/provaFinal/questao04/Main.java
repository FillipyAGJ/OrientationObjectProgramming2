package Exercicios.provaFinal.questao04;

public class Main {
    public static void main(String[] args) {

        Manual manual = new Manual();
        manual.cambio = new Cambio();
        manual.cambio.setMarcha(1);

        System.out.println(manual.cambio.getMarcha());
        manual.acelerar(3500);
        manual.pisarNaEmbreagem();
        System.out.println(manual.embreagem);
        manual.aumentarMarcha();
        System.out.println(manual.cambio.getMarcha());
        manual.soltarEmbreagem();
        System.out.println(manual.embreagem);

        System.out.println(manual.cambio.getMarcha());
        manual.acelerar(3100);
        manual.pisarNaEmbreagem();
        System.out.println(manual.embreagem);
        manual.aumentarMarcha();
        System.out.println(manual.cambio.getMarcha());
        manual.soltarEmbreagem();
        System.out.println(manual.embreagem);
    }
}
