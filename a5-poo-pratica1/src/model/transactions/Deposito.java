package model.transactions;

public class Deposito implements Transaction {

    public void depositar(boolean valido) {
        if (valido) {
            transactionOk();
            return;
        }
        transactionNotOk();
    }

    public void transactionOk() {
        System.out.println("Deposito concluído com sucesso");
    }

    public void transactionNotOk() {
        System.out.println("Não foi possível concluir o depósito");
    }
}
