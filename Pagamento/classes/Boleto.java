package classes;

public class Boleto implements Pagamento{
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento por boleto.");
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Recibo do pagamento por boleto.");
    }
}
