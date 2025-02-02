package nelio_alves.poo.constructor;

public class ConstructorParameters
{
    int modelVersion;
    String modelName;

    public ConstructorParameters(int version, String name)
    {
        modelVersion = version; // or this.modelVersion = version
        modelName = name; // or this.modelName = name;
    }

    public static void main(String[] args) {
        ConstructorParameters myCel = new ConstructorParameters(14, "Galaxy");
        System.out.printf("%s A%d 5G", myCel.modelName, myCel.modelVersion);
    }
}
