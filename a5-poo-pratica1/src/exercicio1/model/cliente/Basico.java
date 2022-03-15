package exercicio1.model.cliente;

import exercicio1.model.transactions.ConsultaSaldo;
import exercicio1.model.transactions.Deposito;
import exercicio1.model.transactions.PagamentoServicos;
import exercicio1.model.transactions.Saque;

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
