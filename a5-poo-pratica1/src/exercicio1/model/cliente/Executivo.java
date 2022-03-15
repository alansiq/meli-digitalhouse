package exercicio1.model.cliente;

import exercicio1.model.transactions.Deposito;
import exercicio1.model.transactions.Transferencia;

public class Executivo {
    Deposito deposito = new Deposito();
    Transferencia transferencia = new Transferencia();

    public void depositar(boolean valido) {
        this.deposito.depositar(valido);
    }

    public void transferir(boolean valido) {
        this.transferencia.transferir(valido);
    }
}
