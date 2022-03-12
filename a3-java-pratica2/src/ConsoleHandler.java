import services.PersonServices;
import services.RaceServices;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

public class ConsoleHandler {

    private Scanner console;
    private RaceServices raceServices = new RaceServices();
    private PersonServices personServices = new PersonServices();

    public ConsoleHandler(Scanner console) {
        this.console = console;
    }

    public void execute() {

        out.println("Utilize uma das funções a seguir:");
        out.println("1) Listar participantes");
        out.println("2) Nova inscrição");
        out.println("3) Cancelar inscrição");
        out.println("0) SAIR");

        int response = this.getUserResponseInt();

        switch (response) {
            case 1:
                this.listarParticipantes();
                break;
            case 2:
                this.novaInscricao();
                break;
            case 3:
                this.cancelarInscricao();
                break;
            case 0:
                this.console.close();
                break;
            default:
                out.println("Opção inválida. Reiniciando sistema");
                this.execute();
        }
    }

    public void listarParticipantes() {
        out.println("-------------------------------------------------------------------------");
        out.println("1) Circuito pequeno");
        out.println("2) Circuito médio");
        out.println("3) Circuito grande");

        int response = this.getUserResponseInt();
        if (response > 3 || response < 1) this.execute();

        ArrayList<Integer> participants = raceServices.getParticipants(response);
        participants.forEach(personServices::listPerson);

    }

    public void novaInscricao() {
        out.println("-------------------------------------------------------------------------");
        out.println("Insira o primeiro nome do participante:");
        String nome = this.getUserResponseString();
        out.println("Insira sua idade:");
        int idade = this.getUserResponseInt();
        out.println("Qual corrida você deseja participar?");
        out.println("1) Circuito pequeno");
        out.println("2) Circuito médio");
        out.println("3) Circuito grande");
        int corrida = this.getUserResponseInt();


//        int personId = personServices.createPerson(nome, idade);
//        raceServices.insertParticipant(personId, corrida);

        // TODO RETORNAR VALOR DA INSCRIÇÃO

        out.println("Cadastro concluído com sucesso");
    }

    public void cancelarInscricao() {

    }


    public int getUserResponseInt() {
        int i = this.console.nextInt();
        this.console.nextLine();

        return i;
    }

    public String getUserResponseString() {
        return this.console.nextLine();
    }

}
