import model.Pessoa;

public class Main {
    public static void main (String[] args) {
        //    xercício 4 Na classe Main que acabamos de criar, dentro do método main() pedimos para você criar um objeto do tipo
        //    Pessoa para cada construtor que definimos na classe, lembre-se de colocar um nome significativo para as variáveis
        //    para atribuir cada objeto. A seguir, vamos criar outro objeto do tipo Pessoa e vamos construí-lo passando apenas
        //    um valor para o nome e outro para a idade no construtor.
        System.out.println("Criando pessoa1:");
        Pessoa pessoa1 = new Pessoa();
        System.out.println(pessoa1.toString());
        System.out.println("_________________________________");


        System.out.println("Criando pessoa2:");
        Pessoa pessoa2 = new Pessoa("Alan Siqueira", 32, "ABCDEFG");
        System.out.println(pessoa2.toString());
        System.out.println("_________________________________");

        System.out.println("Criando pessoa3:");
        Pessoa pessoa3 = new Pessoa("Jaq Viviana", 23, "AAABD", 50.0, 1.72);
        System.out.println(pessoa3.toString());
        System.out.println("_________________________________");

        System.out.println("Criando pessoa4:");
        Pessoa pessoa4 = new Pessoa("Nico Tacano", 10, "ACD", 10.0, 1.00);
        System.out.println(pessoa3.toString());
        System.out.println("_________________________________");

        pessoa4.validatePerson();
        pessoa3.validatePerson();

    }


}
