import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        /*System.out.println(curso1);
        System.out.println(curso2);*/

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de JavaScript");
        mentoria2.setDescricao("Descição Mentoria JS");
        mentoria2.setData(LocalDate.now());

        /*System.out.println(mentoria1);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootecamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devGiovana = new Dev();
        devGiovana.setNome("Giovana");
        devGiovana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Giovana: " + devGiovana.getConteudosInscritos());
        devGiovana.progredir();
        devGiovana.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdos Inscritos Giovana: " + devGiovana.getConteudosInscritos());
        System.out.println("Conteúdos Conlcuidos Giovana: " + devGiovana.getConteudosConcluidos());
        System.out.println("XP: " + devGiovana.calcularTotalXp());

        System.out.println(" ------------------- ");
        Dev devRobson = new Dev();
        devRobson.setNome("Robson");
        devRobson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Robson: " + devRobson.getConteudosInscritos());
        devRobson.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdos Concluídos Robson: " + devRobson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Robson: " + devRobson.getConteudosConcluidos());
        System.out.println("XP: " + devRobson.calcularTotalXp());




    }
}