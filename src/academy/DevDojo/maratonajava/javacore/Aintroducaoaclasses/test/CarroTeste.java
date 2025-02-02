package academy.DevDojo.maratonajava.javacore.Aintroducaoaclasses.test;

import academy.DevDojo.maratonajava.javacore.Aintroducaoaclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Peogeot";
        carro1.modelo = "208";
        carro1.ano = 2002;

        carro2.nome = "Chevrolet";
        carro2.modelo = "Voyage";
        carro2.ano = 2012;

        //carro1 = carro2;
        //carro2 = carro1;
        // referência a objetos

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
