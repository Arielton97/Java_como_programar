package java_como_programar.chapter7;

import java.util.ArrayList;
import java.util.SimpleTimeZone;

public class ArrayListas
{
    public static void main(String[] args) {
        // cria um novo ArrayList de strings com uma capacidade inicial de 10
        ArrayList<String> items = new ArrayList<>();

        items.add("red"); // anexa um item à lista
        items.add(0, "yellow"); // insere yellow no índice 0

        // cabeçalho
        System.out.println(
                "Display list contents with counter-controlled loop:"
        );

        // exibe as cores na lista
        for (int i = 0; i < items.size(); i++)
            System.out.printf(" %s", items.get(i));

        //exibe as cores usando for aprimorada no méthod display
        display(items,
                "\nDisplay list contents with enhanced for statement:");

        items.add("green"); // adiciona "green" ao fim da lista
        items.add("yellow"); // adiciona "yellow" ao final da lista

        items.remove("yellow"); // remove o primeiro yellow
        display(items, "Remove first instance of yellow:");

        items.remove(1); // remove o índice 1
        display(items, "Remove second list element (green):");

        // verifica se um valor está na list
        System.out.printf("Size: %s%n", items.size());
    }

    // exibe o número de elementos na list
    public static void display(ArrayList<String> items, String header)
    {
        System.out.println(header); // exibe o cabeçalho

        // exibe cada elemento em itens
        for (String item : items)
            System.out.printf(" %s", item);

        System.out.println();
    } // fim da classe ArrayListCollection
}
