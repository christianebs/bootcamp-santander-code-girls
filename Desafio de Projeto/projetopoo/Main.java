package santandercodegirls.projetopoo;

import santandercodegirls.projetopoo.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- DESAFIO POO ---\n");

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devChris = new Dev();
        devChris.setNome("Chris");
        devChris.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos | Chris: " + devChris.getConteudosInscritos());
        devChris.progredir();
        devChris.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos | Chris: " + devChris.getConteudosInscritos());
        System.out.println("Conteúdos concluídos | Chris: " + devChris.getConteudosConcluidos());
        System.out.println("XP: " + devChris.calcularTotalXp());

        System.out.println("\n-----------------------\n");

        Dev devPhil = new Dev();
        devPhil.setNome("Plilipe");
        devPhil.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos | Philipe: " + devPhil.getConteudosInscritos());
        devPhil.progredir();
        devPhil.progredir();
        devPhil.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos | Philipe: " + devPhil.getConteudosInscritos());
        System.out.println("Conteúdos concluídos | Philipe: " + devPhil.getConteudosConcluidos());
        System.out.println("XP: " + devPhil.calcularTotalXp());

    }
}
