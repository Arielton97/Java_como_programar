package java_como_programar.chapter6;

import java.security.SecureRandom;

public class RandomIntegers {

    public static void main(String[] args) {
        // s objeto randomNumbers produzirá números aletórios seguros
        SecureRandom randomNumbers = new SecureRandom();

        // faz o loop 20 vezes
        for (int i = 0; i <= 20; i++) {
            // seleciona o inteiro aleatorio entre 1 a 6
            int face = randomNumbers.nextInt(2);

            System.out.printf("%d ", face); // exibe o valor gerado

            // se o gerado for divisível por  5, inicia uma nova linha de saída
            if (i % 5 == 0)
                System.out.println();
        }
    }
} // fim da classe RandomIntegers
