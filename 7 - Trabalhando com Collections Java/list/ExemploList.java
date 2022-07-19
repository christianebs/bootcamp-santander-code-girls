package santandercodegirls.collections;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Dada uma lista com 7 notas de um aluno");
        System.out.println("Notas: 7, 8.5, 9.3, 5, 7, 0, 3.6");

        System.out.println("\nCrie uma lista e adicione essas 7 notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println("\nExiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        System.out.println("\nExiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("\nExiba a média das notas: " + (soma / notas.size()));

        System.out.println("\nRemova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nRemova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("\nApague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());

        System.out.println("\nCrie uma lista chamada notas2: ");

        System.out.println("\nColoque todos os elementos da lista Arraylista nessa nova lista: ");

        System.out.println("\nMostre a primeira nota da nova lista sem removê-la: ");

        System.out.println("\nMostre a primeira nota da nova lista removendo-o: ");
    }
}
