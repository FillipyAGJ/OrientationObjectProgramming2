package Exercicios.provaFinal.questao03;

public class ComputadorDeMesa extends Computador {
    private String fabricanteGabinete;
    private String tipoGabinete;
    private String fonte;

    public ComputadorDeMesa(
            String fabricante, String processador,
            String memoriaPrincipal, String memoriaSecundaria,
            String fabricanteGabinete, String tipoGabinete,
            String fonte
    ) {
        super(fabricante, processador, memoriaPrincipal, memoriaSecundaria);
        this.fabricanteGabinete = fabricanteGabinete;
        this.tipoGabinete = tipoGabinete;
        this.fonte = fonte;
    }

    public void trocarFabricanteGabinete(String fabricanteGabinete) {
        this.fabricanteGabinete = fabricanteGabinete;
    }

    public void trocarTipoGabinete(String tipoGabinete) {
        this.tipoGabinete = tipoGabinete;
    }

    public void trocarFonte(String fonte) {
        this.fonte = fonte;
    }
}
