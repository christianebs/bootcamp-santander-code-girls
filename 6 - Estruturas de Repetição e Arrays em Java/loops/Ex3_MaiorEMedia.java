package santandercodegirls.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;

        int soma = 0;

        int contador = 0;

        do {

            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            contador = contador + 1;

        } while (contador < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + soma/5);

    }
}
