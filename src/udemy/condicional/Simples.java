package udemy.condicional;

public class Simples {
// Desvio condicional simples
    public static void main(String[] args) {
        String nome = "Rbianna";
        int peso = 100; // muito grande filho!!!

        if (nome != "Rbianna" && peso != 100){
            System.out.println("Dados inválidos");
        }
        else
            System.out.printf("%s tem %d Kg.", nome, peso);
    }

}
