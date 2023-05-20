package classes;

public class CartaoDeCredito implements Pagamento{
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento por cartão de crádito.");
    }

    @Override
    public void gerarRecibo() {
        System.out.println("recibo do pagamento por cartão de crédito.");
    }
}
