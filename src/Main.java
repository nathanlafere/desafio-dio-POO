import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso01 = new Curso();
        curso01.setDescricao("curso java");
        curso01.setTitulo("descrição curso java");
        curso01.setCargaHoraria(8);

        Curso curso02 = new Curso();
        curso02.setDescricao("curso javascript");
        curso02.setTitulo("descrição curso javascript");
        curso02.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria javascript");
        mentoria.setData(LocalDate.now());
        
        /* 
        System.out.println(curso01);
        System.out.println(curso02);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrição("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso01);
        bootcamp.getConteudos().add(curso02);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos "+devCamila.getNome()+": "+ devCamila.getConteudosInscritos());
        
        devCamila.progredir();
        System.out.println("-=".repeat(48));
        System.out.println("Conteúdos inscritos "+devCamila.getNome()+": "+ devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos "+devCamila.getNome()+": "+ devCamila.getConteudosConcluidos());
        System.out.println("XP: "+ devCamila.calcularTotalXp());

        System.out.println("==".repeat(48));

        Dev devNathan = new Dev();
        devNathan.setNome("Nathan");
        devNathan.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos "+devNathan.getNome()+": "+ devNathan.getConteudosInscritos());
        
        devNathan.progredir();
        devNathan.progredir();
        devNathan.progredir();
        System.out.println("-=".repeat(48));
        System.out.println("Conteúdos inscritos "+devNathan.getNome()+": "+ devNathan.getConteudosInscritos());
        System.out.println("Conteúdos concluídos "+devNathan.getNome()+": "+ devNathan.getConteudosConcluidos());
        System.out.println("XP: "+ devNathan.calcularTotalXp());
    }
}
