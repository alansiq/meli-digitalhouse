package model.cliente;

import model.transactions.ConsultaSaldo;
import model.transactions.Deposito;
import model.transactions.PagamentoServicos;
import model.transactions.Saque;

public class Basico {
    ConsultaSaldo consultaSaldo = new ConsultaSaldo();
    Deposito deposito = new Deposito();
    PagamentoServicos pagamentoServicos = new PagamentoServicos();
    Saque saque = new Saque();


    public void consultarSaldo(boolean valido) {
        this.consultaSaldo.consultarSaldo(valido);
    }

    public void sacar(boolean valido) {
        this.saque.sacar(valido);
    }

    public void depositar(boolean valido) {
        this.deposito.depositar(valido);
    }

    public void pagar(boolean valido) {
        this.pagamentoServicos.pagar(valido);
    }

}
