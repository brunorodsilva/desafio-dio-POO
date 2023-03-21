import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}
