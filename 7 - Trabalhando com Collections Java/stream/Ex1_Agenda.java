package santandercodegirls.collections;

import java.util.*;
import java.util.function.Function;

public class Ex1_Agenda {
    public static void main(String[] args) {

        System.out.println("\n--\tOrdem aleatória\t--");

        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Maria", 11111));
            put(4, new Contato("João", 22222));
            put(3, new Contato("Helena", 44444));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem Inserção\t--");
        Map<Integer, Contato> agendaInsercao = new LinkedHashMap<>() {{
            put(1, new Contato("Maria", 11111));
            put(4, new Contato("João", 22222));
            put(3, new Contato("Helena", 44444));
        }};
        System.out.println(agendaInsercao);
        for (Map.Entry<Integer, Contato> entry: agendaInsercao.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem id\t--");
        Map<Integer, Contato> agendaId = new TreeMap<>(agenda);
        System.out.println(agendaId);
        for (Map.Entry<Integer, Contato> entry: agendaId.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem número telefone - 1a forma | Classe anônima\t--");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });

        System.out.println("\n--\tOrdem número telefone - 2a forma | Function Interface\t--");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));

        System.out.println("\n--\tOrdem número telefone - 3a forma | Lambda\t--");
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));
        set2.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set2) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem nome contato | Lambda\t--");
        Set<Map.Entry<Integer, Contato>> set3 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNome()));
        set3.addAll(agenda.entrySet());
        set3.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue().getNome()));
    }
}

class Contato{
    private String nome;
    private Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return nome.equals(contato.nome) && numero.equals(contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }
}