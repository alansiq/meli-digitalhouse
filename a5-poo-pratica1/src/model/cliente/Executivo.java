package model.cliente;

import model.transactions.Deposito;
import model.transactions.Transferencia;

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
