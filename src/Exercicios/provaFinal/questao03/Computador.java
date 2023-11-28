package Exercicios.provaFinal.questao03;

public class Computador {
    private String fabricante;
    private String processador;
    private String memoriaPrincipal;
    private String memoriaSecundaria;

    public Computador(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria) {
        this.fabricante = fabricante;
        this.processador = processador;
        this.memoriaPrincipal = memoriaPrincipal;
        this.memoriaSecundaria = memoriaSecundaria;
    }

    public void trocarProcessador(String processador) {
        this.processador = processador;
    }

    public void trocarMemoriaPrincipal(String memoria) {
        this.memoriaPrincipal = memoria;
    }

    public void trocarMemoriaSecundaria(String memoria) {
        this.memoriaSecundaria = memoria;
    }
}
