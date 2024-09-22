package DominioBootcamp;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
 
    Curso curso1 = new Curso();
    curso1.setTitulo( " Java");
    curso1.setDescricao( " Programação");
    curso1.setCargaHoraria(  8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Python");
    curso2.setDescricao("Programação");
    curso2.setCargaHoraria(8);

    System.out.println(curso1);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo(" Mentoria Java");
    mentoria.setDescricao(" Resolução");
    mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("POO com Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devYanke = new Dev();
        devYanke.inscreverBootcamp(bootcamp);
        devYanke.setNome("Yanke");
        System.out.println("Conteúdos inscritos  " + devYanke.getConteudosInscritos());

    }
}
