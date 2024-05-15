package exercicio2;
public class Circulo extends Shape {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public String getName() {
        return "Círculo";
    }

    @Override
    public double calculateArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * raio;
    }
}
