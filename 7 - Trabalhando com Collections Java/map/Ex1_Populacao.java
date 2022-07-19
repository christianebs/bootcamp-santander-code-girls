package santandercodegirls.collections;

import java.util.*;

public class Ex1_Populacao {
    public static void main(String[] args) {
        System.out.println("\nCrie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populacaoEstados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstados);

        System.out.println("\nSubstitua a população do estado RN por : 3.534.165");
        populacaoEstados.put("RN", 3534165);
        System.out.println(populacaoEstados);

        System.out.println("\nConfira se o estado da Paraíba (PB) está no dicionário, caso não, adicione : PB - 4.039.277: " + populacaoEstados.containsKey("PB"));
        populacaoEstados.put("PB", 4039277);
        System.out.println("Adicionando: " + populacaoEstados);

        System.out.println("\nExiba a população do estado PE: " + populacaoEstados.get("PE"));

        System.out.println("\nExiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacaoEstadoOrdemAleatoria = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populacaoEstadoOrdemAleatoria.toString());

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacaoEstadosOrdemAlfabetica = new TreeMap<>(populacaoEstados);
        System.out.println(populacaoEstadosOrdemAlfabetica);

        Collection<Integer> populacao = populacaoEstados.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoEstados.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("\nExiba o estado com o menor população e seu respectivo valor: " + estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("\nExiba o estado com a maior população e seu respectivo valor: " + estadoMaiorPopulacao, Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = populacaoEstados.values().iterator();
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("\n\nExiba a soma da população desses estados: " + soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: " + (soma / populacaoEstados.size()));

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iteratorRemove = populacaoEstados.values().iterator();
        while (iteratorRemove.hasNext()) {
            if (iteratorRemove.next() <= 4000000) iteratorRemove.remove();
        }
        System.out.println(populacaoEstados);

        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        populacaoEstados.clear();

        System.out.println("\nConfira se a lista está vazia: " + populacaoEstados.isEmpty());
    }
}
