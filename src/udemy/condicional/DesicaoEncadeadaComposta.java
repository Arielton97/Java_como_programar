package udemy.condicional;

import java.util.Scanner;

public class DesicaoEncadeadaComposta {
    // Desvio condicional simples
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeiro, segundo, terceiro;

        primeiro = sc.nextInt();
        segundo = sc.nextInt();
        terceiro = sc.nextInt();

        int maior = primeiro;

        if (segundo > primeiro){
            maior = terceiro;
            System.out.printf("Maior: %d", maior);
        } else if (terceiro > maior) {
            maior = terceiro;
            System.out.printf("Maior: %d", maior);
        } else {
            System.out.printf("Maior: %d", maior);
        }
    }
}