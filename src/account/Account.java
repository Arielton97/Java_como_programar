package account;// account.Account.java
// Classe account.Account que contém uma variável de instância name
// e métodos para configurar e obter o seu valo

public class Account
{
    private String name; // variável de instância
    
    // o construtor inicializa name com nome do parâmetro
    public Account(String name) // o nome do construtor é o nome da classe
    {
        this.name = name;
    }

    // method para definir o nome do objeto
    public void setName(String name)
    {
        this.name = name; // armazena o nome
    }

    // method para recuperar o nome do objeto
    public String getName()
    {
        return name; // a palavra-chave return retorna o valor de name
                    // para o method chamador
    }
} // fim da classe Account