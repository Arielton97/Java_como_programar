package udemy.lacos_repeticao;

public class RepeticaoFor {
    /*
        Só usamos o for quando soubermos quantas vezes usar esse comando
        do 1 até o 10.

        int counter = 1 -> configura a variável para servir o contador
        counter <= 10 -> é a condição para continuar a execução
        counter++ -> é o incremento até o contador atingir até atingir o resultado esperado
        Inicialização / Controle / Incremento
     */
    public static void main(String[] args) {
        // for - Para
        for (int counter = 1; counter <= 10; counter++)
            System.out.printf("%d ", counter);

        System.out.println("");

        for (int counter = 10; counter >= 1; counter--)
            System.out.printf("%d ", counter);
    }
}
