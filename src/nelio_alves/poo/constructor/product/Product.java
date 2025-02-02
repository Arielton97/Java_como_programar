package nelio_alves.poo.constructor.product;

public class Product
{
    private String name;
    private double weight;
    private int age;

    public Product(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        System.out.printf("%s%n%.2f%n%d%n", name, weight, age);
        return "";
    }

    public static void main(String[] args) {
        Product product = new Product("Arielto", 100.00, 27);
        product.toString();
    }
}
