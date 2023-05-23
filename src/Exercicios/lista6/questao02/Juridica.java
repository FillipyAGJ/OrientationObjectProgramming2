package Exercicios.lista6.questao02;

public class Juridica extends Pessoa {
    private String cnpj;

    private static final int[] MULTIPLICADOR_DIGITO1 = { 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 };
    private static final int[] MULTIPLICADOR_DIGITO2 = { 6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 };
    public Juridica() {}
    public Juridica(String nome, String cnpj) {
        super(nome);
        if(validarCnpj(cnpj)) {
            this.cnpj = cnpj;
        }
    }

    public boolean validarCnpj(String cnpj) {
        try {
            String[] cnpjArray = cnpj.split("");
            if (cnpjArray.length != 14) {
                System.out.println("CNPJ deve conter 14 dígitos!");
                return false;
            }
            int[] cnpjDigitos = converteArrayStringParaArrayInt(cnpjArray);
            if (!IsDigitoUmValida(cnpjDigitos) || !IsDigitoDoisValida(cnpjDigitos)) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static int[] converteArrayStringParaArrayInt(String[] stringArray) {

        int[] intArray = new int[14];
        for (int i = 0; i < 14; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    private static boolean IsDigitoUmValida(int[] cnpjDigitos) {

        int soma = 0;
        for (int i = 0; i < 12; i++) {
            soma += cnpjDigitos[i] * MULTIPLICADOR_DIGITO1[i];
        }
        int resto = soma % 11;
        int digitoUm = resto < 2 ? 0 : 11 - resto;
        return cnpjDigitos[12] == digitoUm;
    }

    private static boolean IsDigitoDoisValida(int[] cnpjDigitos) {
        int soma = 0;
        for (int i = 0; i < 13; i++) {
            soma += cnpjDigitos[i] * MULTIPLICADOR_DIGITO2[i];
        }
        int resto = soma % 11;
        int digitoDois = resto < 2 ? 0 : 11 - resto;
        return cnpjDigitos[13] == digitoDois;
    }

    public void setCnpj(String cnpj) {
        if(validarCnpj(cnpj)) {
            this.cnpj = cnpj;
        } else {
            System.out.println("Digite um cnpj valido.");
        }
    }

    public String getCnpj() {
        return cnpj;
    }

}
