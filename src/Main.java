import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso01 = new Curso();
        curso01.setDescricao("curso java");
        curso01.setTitulo("descrição curso java");
        curso01.setCargaHoraria(5);

        Curso curso02 = new Curso();
        curso02.setDescricao("curso javascript");
        curso02.setTitulo("descrição curso javascript");
        curso02.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria javascript");
        mentoria.setData(LocalDate.now());
        
        System.out.println(curso01);
        System.out.println(curso02);
        System.out.println(mentoria);
    }
}
