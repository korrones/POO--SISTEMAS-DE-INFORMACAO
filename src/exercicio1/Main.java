package exercicio1;

import java.util.Scanner;
public class Main {
    public static double calcularSalario(double valorHora, double horasTrabalhadas, String cargo) {
        double salarioBase = valorHora * horasTrabalhadas;

        if (cargo.equalsIgnoreCase("lider")) {
            salarioBase *= 1.02; // Incrementa em 2% para líderes
        } else if (cargo.equalsIgnoreCase("gerente")) {
            salarioBase *= 1.05; // Incrementa em 5% para gerentes
        }
        return salarioBase;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o cargo (lider/gerente/outro): ");
        String cargo = scanner.next();
        double salarioTotal = calcularSalario(valorHora, horasTrabalhadas, cargo);

        System.out.printf("O salário total do funcionário é: R$ %.2f%n", salarioTotal);
        scanner.close(); // Fecha o scanner
    }
}
