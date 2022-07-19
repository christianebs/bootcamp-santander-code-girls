package santandercodegirls.collections;

import java.util.*;

public class Ex2_Dados {
    public static void main(String[] args) {
        Integer quantidadeLancamentos = 100;

        List<Integer> valores = new ArrayList<>();
        Random girarDados = new Random();

        for (int i = 0; i < quantidadeLancamentos; i++){
            int numero = girarDados.nextInt(6) + 1;
            valores.add(numero);
        }

        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : valores) {
            if (lancamentos.containsKey(resultado))
                lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
            else lancamentos.put(resultado, 1);
        }

        System.out.println("\nValor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }

    }
}
