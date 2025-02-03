package udemy.controle.exercicio;

import javax.swing.*;
import java.util.Scanner;

public class NotasAlunos {
    /**
     *  Crie um algoritmo usando FOR que leia duas notas de três alunos, e para cada aluno,
     *  calcule a média e exiba na tela a situação APROVADO ou REPROVADO considerando a média como 6
     *  e no final calcule a média da turma e exiba a média da turma na tela.
     */

    public float nota1; public float nota2; public float media; public float somaMedia; public float mediaTurma;
    public String aluno;

    public void calcularMedia() {
        for (int i = 0; i < 2; i++) {
            aluno = JOptionPane.showInputDialog("Digite o nome do(a) aluno(a) " + (i + 1) + ":");
            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));

            media = (nota1 + nota2) / 2;
            somaMedia += media;

            System.out.println("Aluno(a): " + aluno);
            System.out.printf("Média: %.2f\n", media);

            if (media >= 6) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado!");
            }
        }

        mediaTurma = somaMedia / 3;
        System.out.printf("\nMédia da turma: %.2f\n", mediaTurma);
    }

    public static void main(String[] args) {
        NotasAlunos notasAlunos = new NotasAlunos();
        notasAlunos.calcularMedia();
    }
}
