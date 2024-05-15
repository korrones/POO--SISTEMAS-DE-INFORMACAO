package exercicio2;
public class Final {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5.0, 3.0);
        System.out.println("Nome da figura: " + retangulo.getName());
        System.out.println("Área do retângulo: " + retangulo.calculateArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calculatePerimeter());

        System.out.println();

        Circulo circulo = new Circulo(4.0);
        System.out.println("Nome da figura: " + circulo.getName());
        System.out.println("Área do círculo: " + circulo.calculateArea());
        System.out.println("Perímetro do círculo: " + circulo.calculatePerimeter());
    }
}
