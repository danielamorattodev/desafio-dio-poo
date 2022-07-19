package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(); //primeiro objeto
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição - curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(); //primeiro objeto
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição - curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição - mentoria Java");
        mentoria1.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria1);

         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição - Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devDaniela = new Dev();
        devDaniela.setNome("Daniela");
        devDaniela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Daniela " + devDaniela.getConteudosInscritos());
        devDaniela.progredir();
        devDaniela.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Daniela " + devDaniela.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Daniela " + devDaniela.getConteudosConcluidos());
        System.out.println("XP: " + devDaniela.calcularTotalXp());

        System.out.println("--------------");

        Dev devJoão = new Dev();
        devJoão.setNome("João");
        devJoão.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João " + devJoão.getConteudosInscritos());
        devJoão.progredir();
        devJoão.progredir();
        devJoão.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João " + devJoão.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João " + devJoão.getConteudosConcluidos());
        System.out.println("XP: " + devJoão.calcularTotalXp());




    }
}