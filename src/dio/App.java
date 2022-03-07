package dio;

import java.time.LocalDate;

import classes.Bootcamp;
import classes.Curso;
import classes.Dev;
import classes.Mentoria;

public class App {

	public static void main(String[] args) {
		Curso c1 = new Curso();
        c1.setTitle("Java");
        c1.setDescription("Curso abordando as principais pilares" 
        + " " + "da programação Java e da orientação à objetos.");
        c1.setHours(8);

        Curso c2 = new Curso();
        c2.setTitle("Javascript");
        c2.setDescription("Aprenda esta linguagem multi-paradigma" + " " +
        "que é um dos fundamentos essenciais do desenvolvimento web.");
        c2.setHours(8);
        
        Mentoria m1 = new Mentoria();
        m1.setTitle("Abstração e Orientação à Objetos na prática!");
        m1.setDescription("Esta mentoria se dedica a desmistificar os conceitos de orientação à objetos");
        m1.setData(LocalDate.now());

		/*
		 * System.out.println(c1.toString()); 
		 * System.out.println(c2.toString());
		 * System.out.println(m1.toString());
		 */
        System.out.println("==================================");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Cursos e Mentorias para alavancar sua carreira Java");
        bootcamp.getContent().add(c1);
        bootcamp.getContent().add(c2);
        bootcamp.getContent().add(m1);
        
        Dev dev1 = new Dev();
        dev1.setName("Pedro");
        dev1.subscribeBootcamp(bootcamp);
        System.out.println("\nConteudos inscritos dev1 :\n" + dev1.getConteudosInscritos());
        dev1.progress();
        dev1.progress();
        dev1.progress();
        System.out.println("Conteudos concluidos dev1 :\n" + dev1.getConteudosConcluidos());
        System.out.println("\nXP TOTAL:" + dev1.calcularTotalXP());
        
        System.out.println("==================================");

        
        Dev dev2 = new Dev();
        dev2.setName("Rafael");
        dev2.subscribeBootcamp(bootcamp);
        System.out.println("\nConteudos inscritos dev2 :\n" + dev2.getConteudosInscritos());
        dev2.progress();
        System.out.println("Conteudos concluidos dev2 :\n" + dev2.getConteudosConcluidos());
        System.out.println("\nXP TOTAL:" + dev2.calcularTotalXP());


	}	

}
