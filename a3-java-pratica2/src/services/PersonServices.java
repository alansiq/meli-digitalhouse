package services;


public class PersonServices {

    public void createPerson() {
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
}
