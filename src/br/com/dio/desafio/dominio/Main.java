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


        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria1);


    }
}