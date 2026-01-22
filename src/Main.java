import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.setTituto("Java");
        c1.setDescricao("Java Básico");
        c1.setCargaHoraria(30);

        Curso c2 = new Curso();
        c2.setTituto("Spring Boot");
        c2.setDescricao("Spring Básico");
        c2.setCargaHoraria(20);

        Mentoria mentoria= new Mentoria();
        mentoria.setTituto("Mentoria José");
        mentoria.setDescricao("Mentoria sobre strems");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Curso de Java");
        bootcamp.getConteudos().add(c1);
        bootcamp.getConteudos().add(c2);
        bootcamp.getConteudos().add(mentoria);

        Dev jackson = new Dev();
        jackson.setNome("Jackson");
        jackson.inscreverBootcamp(bootcamp);

        Dev jack = new Dev();
        jack.setNome("Jack");
        jack.inscreverBootcamp(bootcamp);

        System.out.println(jackson.getConteudoInscritos());
        System.out.println(jack.getConteudoInscritos());

    }
}