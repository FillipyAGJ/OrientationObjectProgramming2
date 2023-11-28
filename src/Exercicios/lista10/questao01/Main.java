package Exercicios.lista10.questao01;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();

        elevador.setCapacidade(2);
        elevador.setTotalAndares(2);
        elevador.subir();
        System.out.println(elevador.getAndarAtual());
        elevador.subir();
        System.out.println(elevador.getAndarAtual());
        elevador.subir();
        System.out.println(elevador.getAndarAtual());
        elevador.descer();
        System.out.println(elevador.getAndarAtual());
        elevador.descer();
        System.out.println(elevador.getAndarAtual());
        elevador.descer();
        System.out.println(elevador.getAndarAtual());
        elevador.entrar();
        System.out.println(elevador.getPessoasPresentes());
        elevador.entrar();
        System.out.println(elevador.getPessoasPresentes());
        elevador.entrar();
        System.out.println(elevador.getPessoasPresentes());
        elevador.sair();
        System.out.println(elevador.getPessoasPresentes());
        elevador.sair();
        System.out.println(elevador.getPessoasPresentes());
        elevador.sair();
        System.out.println(elevador.getPessoasPresentes());

    }
}
