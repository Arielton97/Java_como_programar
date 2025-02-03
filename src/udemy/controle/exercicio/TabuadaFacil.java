package udemy.controle.exercicio;

public class TabuadaFacil {
    public void tabuada(int numero) {
        for (int i = 0; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        TabuadaFacil tabuada = new TabuadaFacil();
        tabuada.tabuada(5);
    }
}
