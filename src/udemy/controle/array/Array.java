package udemy.controle.array;

public class Array {
    public void arrayExemplo1() {

        int n1; int n2; int n3; int n4; int n5;

        n1 = 10;
        n2 = 18;
        n3 = 31;
        n4 = 42;
        n5 = 53;

        System.out.println("Exemplo com variáveis");
        System.out.printf("Numero 1: %d\n", n1);
        System.out.printf("Numero 2: %d\n", n2);
        System.out.printf("Numero 3: %d\n", n3);
        System.out.printf("Numero 4: %d\n", n4);
        System.out.printf("Numero 5: %d\n", n5);

    }

    /**
     *  Array é semelhante a criação de várias variáveis,
     *  ele faz a mesma coisa / função
     *
     *  [] -> significa que estou criando um Array
     *  new -> siginifica que vou instanciar uma classe
     */

    public void exemploComArrayDeNumeros() {

        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 18;
        numeros[2] = 31;
        numeros[3] = 42;
        numeros[4] = 53;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Número %d está na posição %d\n", numeros[i], i);
        }
    }

    public void exemploComArrayDeStrings() {

        // Criando um array de letras e preenchendo os itens direto de dentro do array
        String[] letras = {"A", "B", "C", "D", "E"};

        System.out.println("\nImprimindo array de letras");
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Posição " + i + ": " + letras[i]);
        }
    }

    public void exemploComArrayDeAnimais() {

        String[] animais = {"Ave", "Macaco", "Girafa", "Cachorro"};

        for (int i = 0; i < animais.length; i++) {
            System.out.printf("O animal %s está na posição %d\n", animais[i], i);
        }
    }

    public static void main(String[] args) {
        Array array = new Array();
        //array.arrayExemplo1();
        //array.exemploComArrayDeNumeros();
        //array.exemploComArrayDeStrings();
        array.exemploComArrayDeAnimais();
    }
}
