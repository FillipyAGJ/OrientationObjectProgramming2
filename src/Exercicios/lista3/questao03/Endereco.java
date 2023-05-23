package Exercicios.lista3.questao03;

public class Endereco {
    private String logradouro;
    private String cep;
    private int numero;
    private String complemento;
    private String cidade;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "logradouro: " + this.logradouro + ", cep: " + this.cep + ", numero: " + this.numero + ", complemento: " + this.complemento + ", cidade: " + this.cidade;
    }
}
