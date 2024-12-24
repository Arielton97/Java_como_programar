package udemy.condicional;

import java.util.Objects;
import java.util.Scanner;

public class LoginESenha_professor {
    /*
        Crie um algoritmo que solicite ao usuário o nome e a senha
        e na sequência, verifique se o nome é Roger e se a senha é 123
        e se for, exiba a mensagem Logado com sucesso.
     */

    // Correção do professor

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Autenticação -----");
        System.out.print("Nome de usuário: ");
        String userName = sc.nextLine();

        System.out.print("Senha: ");
        String userPass = sc.nextLine();

        if (userName.equals("exemplo") && userPass.equals("1233")) {
            System.out.println("Acesso concedido!!");
            System.out.printf("Bem vindo %s.", userName);
        } else
            System.out.println("Usuário ou senha inválidos!");

        sc.close();
    }
}
