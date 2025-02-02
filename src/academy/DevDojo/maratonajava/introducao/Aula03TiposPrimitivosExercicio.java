package academy.DevDojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    /*
    Prática

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>,
    confirmo que recebi o salário de <salário>, na data <data>
     */

    public static void main(String[] args) {
        String nome = "Naruto Uzumaki";
        String endereço = "Avenida Hugo Lobo";
        double salario = 900.00;
        String data = "15 de Janeiro de 2025";

        System.out.printf("Eu %s, morando no endereço %s, " +
                        "confirmo que recebi o salário de R$ %.2f, na data %s",
                nome, endereço, salario, data);
    }
}
