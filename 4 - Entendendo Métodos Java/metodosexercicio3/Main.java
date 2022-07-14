package metodosexercicio3;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nExercício Retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Áreando quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Áreando retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(5,6,7);
        System.out.println("Áreando trapézio: " + areaTrapezio);
    }
}
