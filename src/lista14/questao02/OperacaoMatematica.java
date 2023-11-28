package lista14.questao02;

// a interface serve como um contrato com "regras a serem seguidas"
// No caso abaixo, a classe que implementar esta interface, vai ser obrigada
// a colocar o método calcula com 2 parâmetros nela.
// Agora o que esté metodo vai fazer não importa.
public interface OperacaoMatematica {
    public int calcula(int a, int b);
}
