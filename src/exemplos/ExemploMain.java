package exemplos;

public class ExemploMain {
    public static void main(String[] args) {

        Endereco end = new Endereco();

        end.setRua("SGAN 610");
        end.setCep("70.741-500");

        System.out.println(end.getRua());
        System.out.println(end.getCep());
    }
}
