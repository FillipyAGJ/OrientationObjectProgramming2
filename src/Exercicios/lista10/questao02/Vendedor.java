package Exercicios.lista10.questao02;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, String matricula, double salario_base, double comissao) {
        super(nome, matricula, salario_base);
        setSalario_base(salario_base + comissao);
    }
}
