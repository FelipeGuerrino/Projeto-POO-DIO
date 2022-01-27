import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java", "descrição curso java", 8);

        Curso curso2 = new Curso("curso js", "descrição curso js", 4);

        Mentoria mentoria = new Mentoria("mentoria de java", "descrição mentoria java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("GFT Start 3", "O melhor bootcamp de 2022");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev("Felipe");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Felipe:" + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Felipe:" + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Felipe:" + dev.getConteudosConcluidos());
        System.out.println("XP:" + dev.calcularTotalXp());

        System.out.println("-------");

    }

}
