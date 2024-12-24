package udemy.condicional;

import javax.swing.*;
import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2, diff;

        System.out.println("----- Diferença entre dois números -----");
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        if (number1 > number2) {
            diff = number1 - number2;
            System.out.println("\n----- Diferença entre os número -----");
            System.out.printf("Número 1: %d\n", number1);
            System.out.printf("Número 2: %d\n", number2);
            System.out.printf("Diferença: %d - %d = %d", number1, number2, diff);
        } else {
            diff = number2 - number1;
            System.out.println("\n----- Diferença entre os número -----");
            System.out.printf("Número 1: %d\n", number1);
            System.out.printf("Número 2: %d\n", number2);
            System.out.printf("Diferença: %d + %d = %d", number1, number2, diff);
        }
        sc.close();
    }
}
