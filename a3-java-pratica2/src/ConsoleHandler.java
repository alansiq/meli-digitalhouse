import services.PersonServices;
import services.RaceServices;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleHandler {

    private Scanner console = new Scanner(System.in);
    private RaceServices raceServices = new RaceServices();
    private PersonServices personServices = new PersonServices();

    public void execute() {

        System.out.println("Utilize uma das funções a seguir:");
        System.out.println("1) Listar participantes");
        System.out.println("2) Nova inscrição");
        System.out.println("3) Cancelar inscrição");
        System.out.println("0) SAIR");

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
                System.out.println("Opção inválida. Reiniciando sistema");
                this.execute();
        }
    }

    public void listarParticipantes() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("1) Circuito pequeno");
        System.out.println("2) Circuito médio");
        System.out.println("3) Circuito grande");

        int response = this.getUserResponseInt();
        if (response > 3 || response < 1) this.execute();

        ArrayList<Integer> participants = raceServices.getParticipants(response);
        participants.forEach(personServices::listPerson);

    }

    public void novaInscricao() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Insira o primeiro nome do participante:");
        String nome = this.getUserResponseString();
        System.out.println("Insira sua idade:");
        int idade = this.getUserResponseInt();
        System.out.println("Qual corrida você deseja participar?");
        System.out.println("1) Circuito pequeno");
        System.out.println("2) Circuito médio");
        System.out.println("3) Circuito grande");
        int corrida = this.getUserResponseInt();


        int personId = personServices.createPerson(nome, idade);
        raceServices.insertParticipant(personId, corrida);

        // TODO RETORNAR VALOR DA INSCRIÇÃO

        System.out.println("Cadastro concluído com sucesso");
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
