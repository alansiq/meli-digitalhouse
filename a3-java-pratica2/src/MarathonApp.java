import java.util.Scanner;

public class MarathonApp {

    public static void main(String[] args) {
        ConsoleHandler app = new ConsoleHandler(new Scanner(System.in));
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("BEM VINDO A CORRIDA NA SELVA");

        while(true) {
            app.execute();
        }
    }
}
