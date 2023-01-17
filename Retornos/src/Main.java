public class Main {
    public static void main(String[] args) throws Exception {
        //retornos
        System.out.println("\nRETORNOS");

        double areaQuadrado = Quadrilateros.area(5);
        System.out.println("Área do quadrado = " + areaQuadrado);

        double areaRetangulo = Quadrilateros.area(5, 5);
        System.out.println("Área do retangulo = " + areaRetangulo);

        double areaTrapezio = Quadrilateros.area(7, 8, 9);
        System.out.println("Área do trapézio = " + areaTrapezio);

        System.out.println();
    }
}
