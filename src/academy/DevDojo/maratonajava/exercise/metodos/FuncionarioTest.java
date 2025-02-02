package academy.DevDojo.maratonajava.exercise.metodos;

public class FuncionarioTest {
    public static void main (String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Cristiano Ronaldo";
        funcionario.idade = 30;
        funcionario.salarios = new double[] {12000, 987.32, 2000};

        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}
