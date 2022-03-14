import model.NaoPerecivel;
import model.Perecivel;
import model.Produto;

import java.util.ArrayList;

public class Distribuidora {
    private static ArrayList<Produto> produtos =
            new ArrayList<Produto>();

    public static double execute () {
        createDefaultProducts();
        return produtos.stream().mapToDouble(produto -> produto.calcular(1)).sum();
    }

    private static void createDefaultProducts() {
        System.out.println("Initializing product list");
        Perecivel perecivel1 = new Perecivel("Banana", 10, 3);
        produtos.add(perecivel1);

        Perecivel perecivel2 = new Perecivel("Carne", 100, 1);
        produtos.add(perecivel2);

        Perecivel perecivel3 = new Perecivel("Pão", 80, 10);
        produtos.add(perecivel3);

        Perecivel perecivel4 = new Perecivel("Pessego", 10, 2);
        produtos.add(perecivel4);

        Perecivel perecivel5 = new Perecivel("Mamão", 8, 8);
        produtos.add(perecivel5);

        NaoPerecivel produto1 = new NaoPerecivel("Copo", 10,
                "Cozinha");
        produtos.add(produto1);

        NaoPerecivel produto2 = new NaoPerecivel("Prato", 8,
                "Cozinha");
        produtos.add(produto2);


        NaoPerecivel produto3 = new NaoPerecivel("Mouse", 100,
                "Escritório");
        produtos.add(produto3);

        NaoPerecivel produto4 = new NaoPerecivel("Teclado", 380,
                "Escritório");
        produtos.add(produto4);

        NaoPerecivel produto5 = new NaoPerecivel("Talher", 8,
                "Cozinha");
        produtos.add(produto5);

        System.out.println("Finished creating products...");
        System.out.println("_____________________________");
    }
}
