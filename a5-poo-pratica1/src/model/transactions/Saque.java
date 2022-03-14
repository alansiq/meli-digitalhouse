package model.transactions;

public class Saque implements Transaction {

    public void sacar(boolean valido) {
        if(valido) {
            transactionOk();
            return;
        }

        transactionNotOk();
    }

    public void transactionOk() {
        System.out.println("Saque concluído com sucesso");
    }

    public void transactionNotOk() {
        System.out.println("Não foi possível concluir saque");
    }
}
