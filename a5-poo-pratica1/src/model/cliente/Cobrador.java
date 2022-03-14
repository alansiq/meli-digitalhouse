package model.cliente;

import model.transactions.ConsultaSaldo;
import model.transactions.Saque;

public class Cobrador {
    Saque saque = new Saque();
    ConsultaSaldo consultaSaldo = new ConsultaSaldo();

    public void sacar(boolean valido) {
        this.saque.sacar(valido);
    }

    public void consultarSaldo(boolean valido) {
        this.consultaSaldo.consultarSaldo(valido);
    }
}
