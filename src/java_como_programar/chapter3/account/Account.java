package java_como_programar.chapter3.account;// java_como_programar.chapter3.account.Account.java
// Classe java_como_programar.chapter3.account.Account que contém uma variável de instância name
// e métodos para configurar e obter o seu valor

public class Account
{
    private String name; // variável de instância
    private double balance; // variável de instância
    
    // o construtor de Account que recebe dois parâmetros
    public Account(String name, double balance)
    {
        this.name = name; // atribui name à variável de instância name

        // valida que o balance é maior que 0.0; se não for,
        // a variável de instância balance mantém seu valor inicial padrão de 0.0
        if (balance > 0.0) // se o saldo for válido
            this.balance = balance; // o atribui à variável de instância balance
    }

    // method que deposita (adiciona) apenas uma quantia válida no saldo
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) // se depositAmount for válido
            balance = balance + depositAmount; // o adiciona ao saldo
    }

    // method retorna o saldo da conta
    public double getBalance()
    {
        return balance;
    }

    // method que define o nome
    public void setName(String name)
    {
        this.name = name;
    }

    // method que retorna o nome
    public String getName()
    {
        return name; // a palavra-chave return retorna o valor de name
    } // fim do method chamador
} // fim da classe Account