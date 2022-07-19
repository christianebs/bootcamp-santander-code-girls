package santandercodegirls.collections;

import java.util.*;

public class Ex2_Linguagem {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));

        System.out.println("\n---\tOrdem de Inserção\t---");
        Set<LinguagemFavorita> minhasLinguagensFavoritasInsercao = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
            add(new LinguagemFavorita("Python", 1991, "Pycharm"));
            add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
        }};
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritasInsercao) {
            System.out.println(linguagem.getNome() + " - " +
                    linguagem.getAnoDeCriação() + " - " +
                    linguagem.getIde());
        }

//        System.out.println("\n---\tOrdem Natural: nome\t---");
//        Set<LinguagemFavorita> minhasLinguagensFavoritasNatural = new TreeSet<>(minhasLinguagensFavoritas);
//        for (LinguagemFavorita linguagem : minhasLinguagensFavoritasNatural) {
//            System.out.println(linguagem.getNome() + " - " +
//                    linguagem.getAnoDeCriação() + " - " +
//                    linguagem.getIde());
//        }

        System.out.println("\n---\tOrdem de IDE\t---");
        Set<LinguagemFavorita> minhasLinguagensFavoritasIde = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        minhasLinguagensFavoritasIde.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritasIde) {
            System.out.println(linguagem.getNome() + " - " +
                    linguagem.getAnoDeCriação() + " - " +
                    linguagem.getIde());
        }

        System.out.println("\n---\tOrdem de ano de criação e nome\t---");
        Set<LinguagemFavorita> minhasLinguagensFavoritasAnoDeCriacaoENome = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensFavoritasAnoDeCriacaoENome.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritasAnoDeCriacaoENome) {
            System.out.println(linguagem.getNome() + " - " +
                    linguagem.getAnoDeCriação() + " - " +
                    linguagem.getIde());
        }

        System.out.println("\n---\tOrdem de nome, ano de criação e IDE\t---");
        Set<LinguagemFavorita> minhasLinguagensNomeAnoDeCriacaoIde = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagensNomeAnoDeCriacaoIde.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritasAnoDeCriacaoENome) {
            System.out.println(linguagem.getNome() + " - " +
                    linguagem.getAnoDeCriação() + " - " +
                    linguagem.getIde());
        }
    }
}

class LinguagemFavorita {
    private String nome;
    private Integer anoDeCriação;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriação, String ide) {
        this.nome = nome;
        this.anoDeCriação = anoDeCriação;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriação=" + anoDeCriação +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) && anoDeCriação.equals(that.anoDeCriação) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriação, ide);
    }

//    @Override
//    public int compareTo(LinguagemFavorita linguagemFavorita) {
//        return this.nome.compareTo(linguagemFavorita.nome);
//    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriação() {
        return anoDeCriação;
    }

    public String getIde() {
        return ide;
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriação(), lf2.getAnoDeCriação());
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.getNome().compareToIgnoreCase(lf2.getNome());
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.getNome().compareToIgnoreCase(lf2.getNome());
        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriação(), lf2.getAnoDeCriação());
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }
}