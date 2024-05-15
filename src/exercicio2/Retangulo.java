package exercicio2;
public class Retangulo extends Shape {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    @Override
    public String getName() {
        return "Retângulo";
    }

    @Override
    public double calculateArea() {
        return comprimento * largura;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (comprimento + largura);
    }
}
