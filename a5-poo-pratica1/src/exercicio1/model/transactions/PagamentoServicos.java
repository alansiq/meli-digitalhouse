package exercicio1.model.transactions;

public class PagamentoServicos implements Transaction{

    public void pagar(boolean valido) {
        if (valido) {
            transactionOk();
            return;
        }

        transactionNotOk();
    }

    @Override
    public void transactionNotOk() {
        System.out.println("Pagamento concluido com sucesso");
    }

    @Override
    public void transactionOk() {
        System.out.println("Não foi possível concluir o pagamento");
    }
}
