package Resumao;

import java.util.Scanner;

public class questao31 {
    public static void main(String[] args) {
        int codigoCorreto = 1234, codigo, senhaCorreta = 9999, senha;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do usuário: ");
        codigo = scanner.nextInt();

        if (codigoCorreto == codigo) {
            System.out.println("Digite sua senha: ");
            senha = scanner.nextInt();

            if (senhaCorreta == senha) {
                System.out.println("Acesso permitido.");
            } else {
                System.out.println("Senha incorreta.");
            }
        } else {
            System.out.println("Usuário inválido!");
        }
    }
}
