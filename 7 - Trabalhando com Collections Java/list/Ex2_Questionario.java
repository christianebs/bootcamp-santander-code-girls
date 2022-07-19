package santandercodegirls.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex2_Questionario {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String resposta;

        System.out.println("--\tPerguntas\t--");
        System.out.print("\nTelefonou para vítima? ");
        resposta = scanner.nextLine();
        respostas.add(resposta);

        System.out.print("Esteve no local do crime? ");
        resposta = scanner.nextLine();
        respostas.add(resposta);

        System.out.print("Mora perto da vítima? ");
        resposta = scanner.nextLine();
        respostas.add(resposta);

        System.out.print("Devia para vítima? ");
        resposta = scanner.nextLine();
        respostas.add(resposta);

        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.nextLine();
        respostas.add(resposta);

        System.out.println("\nRespostas: ");
        System.out.println(respostas);

        System.out.println("\nResultado: ");

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while (contador.hasNext()) {
            String resp = contador.next();
            if (resp.contains("s")) {
                count++;
            }
        }
        switch (count) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplica");
                break;
            case 5:
                System.out.println("Asssassino");
                break;
            default:
                System.out.println("Inocente");
                break;
        }
    }
}
