package udemy.controle.exercicio;

import javax.swing.JOptionPane;

public class Tabuada {
    int numero;

    public void tabuada() {

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número positivo: ", "Tabuada", JOptionPane.QUESTION_MESSAGE));

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);

        }
    }

    public static void main(String[] args) {
        Tabuada tabuada = new Tabuada();
        tabuada.tabuada();
    }
}
