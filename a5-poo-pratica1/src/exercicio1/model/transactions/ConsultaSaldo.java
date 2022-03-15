package exercicio1.model.transactions;

public class ConsultaSaldo implements Transaction{


    public void consultarSaldo(boolean valido) {
        if (valido) {
            this.transactionOk();
            return;
        }

        this.transactionNotOk();
        return;
    }

    public void transactionOk() {
        System.out.println("Seu saldo é de R$1000,00");
    }

    public void transactionNotOk() {
        System.out.println("Não foi possível consultar seu saldo");
    }
}
