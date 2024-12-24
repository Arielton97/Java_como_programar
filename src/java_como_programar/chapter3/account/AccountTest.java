package java_como_programar.chapter3.account;// java_como_programar.chapter3.account.AccountTest.java
// Usando o construtor de Account para inicializar a instância name
// variável no momento em que cada objeto Account é criado.
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args)
    {
        Account account1 = new Account("Jane Gren", 50.00);
        Account account2 = new Account("John Blue", -7.33);

        // exibe saldo inicial de cada objeto
        System.out.printf("%s balance: $%.2f %n",
                account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n",
                account2.getName(),account2.getBalance());

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtém a entrada do usuário
        System.out.printf("%nadding %.2f to account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount); // adiciona o saldo de account1

        // exibe os saldos
        System.out.printf("%s balance: $%.2f %n",
                account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n",
                account2.getName(),account2.getBalance());

        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtém a entrada do usuário
        System.out.printf("%nadding %.2f to account2 balance%n%n",
                depositAmount);
        account2.deposit(depositAmount); // adiciona ao saldo de acount2

        // exibe os saldos
        System.out.printf("%s balance: $%.2f %n",
                account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n",
                account2.getName(),account2.getBalance());
    } // fim de main
} // fim da classe AccountTest