package academy.DevDojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao06 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 17000;
        double valorParcela = 1000;
        if (valorParcela >= 1000) {
            double nValor = valorParcela;
            System.out.println("pode parcelar");
        }
    }
}
