import model.Pessoa;

public class Main {
    public static void main (String[] args) {
        //    xercício 4 Na classe Main que acabamos de criar, dentro do método main() pedimos para você criar um objeto do tipo
        //    Pessoa para cada construtor que definimos na classe, lembre-se de colocar um nome significativo para as variáveis
        //    para atribuir cada objeto. A seguir, vamos criar outro objeto do tipo Pessoa e vamos construí-lo passando apenas
        //    um valor para o nome e outro para a idade no construtor.

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Alan Siqueira", 32, "ABCDEFG");
        Pessoa pessoa3 = new Pessoa("Jaq Viviana", 23, "AAABD", 50.0, 1.72);


    }
}
