package exemplos;

public class Endereco {
    public Endereco() {}
    public Endereco(String rua, String cep) {
        this.cep = cep;
        this.rua = rua;
    }
    private String rua;
    private String cep;

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
