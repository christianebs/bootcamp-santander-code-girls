package primeiroprogramadio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextDouble();

        Double somar = somar(a, b);
        Double subtracao = subtracao(a, b);
        Double multiplicacao = multiplicacao(a, b);
        Double divisao = divisao(a, b);

        System.out.println("Sama: " + somar);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }

    public static Double somar (Double a, Double b) {
        return a + b;
    }
    public static Double subtracao (Double a, Double b) {
        return a - b;
    }
    public static Double multiplicacao (Double a, Double b) {
        return a * b;
    }
    public static Double divisao (Double a, Double b) {
        return a / b;
    }
}
