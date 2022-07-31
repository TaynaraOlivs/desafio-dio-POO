import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[]args){
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTaynara = new Dev();
        devTaynara.setNome("Taynara");
        devTaynara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + devTaynara.getConteudosInscritos());

        devTaynara.progredir();
        devTaynara.progredir();
        devTaynara.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + devTaynara.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devTaynara.getConteudosConcluidos());
        System.out.println("XP:" + devTaynara.calcularTotalXp());

        System.out.println("----------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + devMaria.getConteudosInscritos());

        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());





    }
}
