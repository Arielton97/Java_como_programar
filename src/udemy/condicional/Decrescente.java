package udemy.condicional;

import javax.swing.*;

public class Decrescente {
    public static void main(String[] args) {
        int number1, number2;

        System.out.println("---------- Decrescente ----------");
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro número"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo número"));

        if (number1 > number2) {
            System.out.printf("%d\n%d", number1, number2);
        } else {
            System.out.printf("%d\n%d", number2, number1);
        }
    }
}
