import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso1.setTitulo("curso PHP");
        curso1.setDescricao("descrição curso PHP");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria typescript");
        mentoria.setDescricao("descrição typescrpt");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp java Developer");
        bootCamp.setDescricao("Descrição bootcamp java");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootCamp);
        System.out.println("Conteuddos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("-");
        System.out.println("Conteuddos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteuddos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("----------");
        Dev devMarcos = new Dev();
        devCamila.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootCamp);
        System.out.println("Conteuddos concluidos Marcos:" + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        System.out.println("-");
        System.out.println("-");
        System.out.println("Conteuddos concluidos Marcos:" + devMarcos.getConteudosInscritos());
        System.out.println("Conteuddos concluidos Marcos:" + devMarcos.getConteudosConcluidos());
        System.out.println("XP: " + devMarcos.calcularTotalXp());
    }
}
