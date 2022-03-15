package exercicio2;

import exercicio2.interfaces.Printable;
import exercicio2.model.Curriculo;
import exercicio2.model.Livro;
import exercicio2.model.Report;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> skillset = new ArrayList<String>();

        skillset.add("Java");
        skillset.add("Spring");

        Curriculo curriculo = new Curriculo("Alan Siqueira", 26,
                "Osasco", skillset);

        Livro livro = new Livro("Uncle Bob", "Clean Code",
                "Programming"
                , 10);

        Report report = new Report("Kenyo", "Conteúdo do report",
                10, "Mauri");


        print(curriculo);
        print(livro);
        print(report);

    }

    public static void print(Printable printable) {
        printable.print();
    }
}
