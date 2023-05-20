package classes;

public class Transferencia implements Pagamento{
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento por transferência.");
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Recibo da transferência.");
    }
}
