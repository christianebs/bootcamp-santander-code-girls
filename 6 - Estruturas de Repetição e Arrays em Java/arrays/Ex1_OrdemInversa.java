package santandercodegirls.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {9, -2, 8, -25, 10, -42};

        System.out.println("Vetor: ");

        int count = 0;
        while (count < (vetor.length)) {

            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("Vetor inverso: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
}
