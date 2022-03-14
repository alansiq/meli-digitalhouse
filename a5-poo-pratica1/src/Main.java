import model.cliente.Basico;
import model.cliente.Cobrador;
import model.cliente.Executivo;

public class Main {
    public static void main(String[] args) {
        Basico basico = new Basico();
        Cobrador cobrador = new Cobrador();
        Executivo executivo = new Executivo();

        System.out.println("-----------------------------------");
        System.out.println("Testing BASICO");

        basico.depositar(true);
        basico.sacar(false);
        basico.consultarSaldo(true);
        basico.pagar(false);

        System.out.println("-----------------------------------");


        System.out.println("-----------------------------------");
        System.out.println("Testing COBRADOR");
        cobrador.consultarSaldo(true);
        cobrador.sacar(false);
        System.out.println("-----------------------------------");


        System.out.println("-----------------------------------");
        System.out.println("Testing EXECUTIVO");

        executivo.depositar(true);
        executivo.transferir(false);
        System.out.println("-----------------------------------");

        System.out.println("Programa concluído com sucesso");

    }
}
