package udemy.condicional;

import java.util.Scanner;

public class DecisaoSequencial {
    public static void main(String[] args) {
        /*
        1. Definir a entrada de um valor numérico
        2. Verificar se N = 1, se for, apresentar a mensagem "você entrou o valor 1".
        3. Verificar se N = 2, se for, apresentar a mensagem "você entrou o valor 2".
        4. Verificar se N < 1, se for, apresentar a mensagem "você entrou o valor muito baixo".
        5. Verificar se N > 1, se for, apresentar a mensagem "você entrou o valor muito alto".
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1){
            System.out.print("você entrou o valor 1");
        } else if (n == 2) {
            System.out.print("voce entrou o valor 2");
        } else if (n < 1) {
            System.out.print("você entrou valor muito baixo");
        } else if (n > 2) {
            System.out.println("voce entrou o valor muito alto");
        }

        sc.close();
    }
}
