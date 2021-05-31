package principles.lsp.ejemplorectangulocuadradoSolution;

public class AppPrueba {

    public static void mostrarArea(Rectangulo rectangulo) {
        System.out.println("Area: " + rectangulo.calcularArea());
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10, 20);
        System.out.println("Altura: " + rectangulo.altura);
        System.out.println("Ancho: " + rectangulo.ancho);
        mostrarArea(rectangulo);
        Cuadrado cuadrado = new Cuadrado(15);
        System.out.println("Altura: " + cuadrado.altura);
        System.out.println("Ancho: " + cuadrado.ancho);
        mostrarArea(cuadrado);
    }
}
