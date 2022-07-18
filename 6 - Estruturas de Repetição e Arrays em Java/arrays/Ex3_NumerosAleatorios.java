package santandercodegirls.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random radom = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = radom.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero);

        }

        System.out.println("Sucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + 1);

        }

        System.out.println("Antecessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero - 1);

        }
    }
}
