package santandercodegirls.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;

        int quantidadePares = 0, quantidadeImpares = 0;

        System.out.println("Digite a quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int contador = 0;
        do {

            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            contador++;
        } while (contador < quantidadeNumeros);

        System.out.println("Quantidade Par: " + quantidadePares);
        System.out.println("Quantidade Ímpar: " + quantidadeImpares);
    }
}
