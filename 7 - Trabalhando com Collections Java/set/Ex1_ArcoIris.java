package santandercodegirls.collections;

import java.util.*;

public class Ex1_ArcoIris {
    public static void main(String[] args) {
        System.out.println("Crie as cores do arco-íris: ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("lilás");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);

        System.out.println("\nExiba uma cor em cada linha: ");
        for (String cor: coresArcoIris) {
            System.out.println(cor);
        }

        System.out.println("\nO arco-íris possui " + coresArcoIris.size() + " cores");

        System.out.println("\nExiba as cores em ordem alfabética: ");
        Set<String> coresArcoIrisOrdemAlfabetica = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIrisOrdemAlfabetica);

        System.out.println("\nExiba as cores na ordem inversa da qual foi informada: ");
        Set<String> coresArcoIrisOrdemInversa = new LinkedHashSet<>(
                Arrays.asList("lilas", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIrisOrdemInversa);
        List<String> coresArcoIrisLista = new ArrayList<>(coresArcoIrisOrdemInversa);
        Collections.reverse(coresArcoIrisLista);
        System.out.println(coresArcoIrisLista);

        System.out.println("\nExiba todas as cores que começam com a letra 'v': ");
        for (String cor: coresArcoIris) {
            if (cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("\nRemova todas as cores que não começam com a letra 'v': ");
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()){
            if (!iterator.next().startsWith("v")) iterator.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("\nLimpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("\nO conjunto está vazio? " + coresArcoIris.isEmpty());
    }
}
