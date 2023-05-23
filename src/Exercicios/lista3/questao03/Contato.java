package Exercicios.lista3.questao03;

public class Contato {
    private String telefone;
    private String email;
    private String descricao;
    private Endereco endereco;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "telefone: " + this.telefone + ", email: " + this.email + ", descrição: " + descricao + ", endereço: " + this.endereco;
    }
}
