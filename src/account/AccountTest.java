package account;// account.AccountTest.java
// Cria e manipula um objeto account.Account

public class AccountTest
{
    public static void main(String[] args)
    {
        // cria um objeto Scanner para obter entrada a partir da janela de comando
        java.util.Scanner input = new java.util.Scanner(System.in);

        // cria um objeto account.Account e o atribui a myAccount
        //Account myAccount = new Account();
        Account account1 = new Account("Jane Green");

        // exibe o valor inicial do nome (null)
        System.out.printf("Initial name is: %s%n%n", account1.getName());

        // solicita e lê o nome
        System.out.println("Please enter the name: ");
        String theName = input.nextLine(); // lê uma linha de texto
        account1.setName(theName); // insere theName em myAccount
        System.out.println(); // gera a saída de uma linha em branco

        // exibe o nome armazenado no objeto myAccount
        System.out.printf("Name in object myAccount is:%n%s%n",
                account1.getName());

        input.close();
    }
} // fim da classe account.AccountTest