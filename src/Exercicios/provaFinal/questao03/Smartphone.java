package Exercicios.provaFinal.questao03;

public class Smartphone extends Computador{
    private String tamanhoDeTela;
    private String densidadePixels;
    private String operadora;

    public Smartphone(
            String fabricante, String processador,
            String memoriaPrincipal, String memoriaSecundaria,
            String tamanhoDeTela, String densidade,
            String operadora
    ) {
        super(fabricante, processador, memoriaPrincipal, memoriaSecundaria);
        this.densidadePixels = densidade;
        this.tamanhoDeTela = tamanhoDeTela;
        this.operadora = operadora;
    }

    public void trocarOperadora(String operadora) {
        this.operadora = operadora;
    }
}
