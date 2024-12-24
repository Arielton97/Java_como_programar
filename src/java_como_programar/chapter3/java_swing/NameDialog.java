// obtendo a entrada de usuário a partir de um diálogo
package java_como_programar.chapter3.java_swing;

import javax.swing.JOptionPane;

public class NameDialog
{
    public static void main(String[] args)
    {
        // pede para o usuário unserir seu nome
        String name = JOptionPane.showInputDialog("What is your name?");

        // cria a mensagem
        String message =
                String.format("Welcome, %s, to Java Programaing!", name);

        // exibe a mensagem para cumprimentar o usupario pelo nome
        JOptionPane.showMessageDialog(null, message);
    } // fim de main
} // termina NameDialog
