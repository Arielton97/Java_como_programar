package account;// account.AccountTest.java
// Usando o construtor de Account para inicializar a instância name
// variável no momento em que cada objeto Account é criado.

public class AccountTest
{
    public static void main(String[] args)
    {
        // cria um objeto Scanner para obter entrada a partir da janela de comando
        Account account1 = new Account("Jane Gren");
        Account account2 = new Account("John Blue");

        // exibe o valor inicial de nome para cada Account
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
    }
} // fim da classe AccountTest
// alteração