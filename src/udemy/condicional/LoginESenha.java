package udemy.condicional;

import java.util.Objects;
import java.util.Scanner;

public class LoginESenha {
    /*
        Crie um algoritmo que solicite ao usuário o nome e a senha
        e na sequência, verifique se o nome é Roger e se a senha é 123
        e se for, exiba a mensagem Logado com sucesso.
     */

    public static void main(String[] args) {
        String nome = "exemplo";
        int senha = 1233;

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Autenticação -----");
        System.out.print("Nome de usuário: ");
        String userName = sc.next();

        System.out.print("Senha: ");
        int userPass = sc.nextInt();

        if (Objects.equals(userName, nome) && userPass == senha)
            System.out.println("Acesso concedido!!");
        else
            System.out.println("Usuário ou senha inválidos!");

        sc.close();
    }
}
