package model.transactions;

public class Transferencia implements Transaction {

    public void transferir(boolean valido) {
        if (valido) {
            transactionOk();
            return;
        }

        transactionNotOk();
    }

    @Override
    public void transactionOk() {
        System.out.println("Transferência concluída com sucesso");
    }

    @Override
    public void transactionNotOk() {
        System.out.println("Transferência não pode ser concluída");
    }
}
