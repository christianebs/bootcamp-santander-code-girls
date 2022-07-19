package santandercodegirls.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex1_Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        int contador = 0;
        while (true) {
            if (contador == 6) break;

            System.out.println("Digite a temperatura: ");
            double temperatura = scan.nextDouble();
            temperaturas.add(temperatura);
            contador++;
        }

        System.out.println("\nTemperatura nos últimos 6 meses: ");
        System.out.println(temperaturas);

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        double media = soma / temperaturas.size();
        System.out.println("\nTemperatura média semestral: " + media);

        System.out.println("\nTemperaturas acima da média: ");
        for (Double temp: temperaturas) {
            if (temp > media){
                System.out.println(temp);
            }
        }

        System.out.println("\nMeses com temperatura acima da média: ");
        Iterator<Double> iteratorTemp = temperaturas.iterator();
        contador = 0;
        while (iteratorTemp.hasNext()) {
            double temp = iteratorTemp.next();
            if (temp > media) {
                switch (contador) {
                    case (0):
                        System.out.println("1 - Janeiro - " + temp);
                        break;
                    case (1):
                        System.out.println("2 - Fevereiro - " + temp);
                        break;
                    case (2):
                        System.out.println("3 - Março - " + temp);
                        break;
                    case (3):
                        System.out.println("4 - Abril - " + temp);
                        break;
                    case (4):
                        System.out.println("5 - Junho - " + temp);
                        break;
                    case (5):
                        System.out.println("6 - Julho - " + temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média");
                }
            }
            contador++;
        }
    }
}
