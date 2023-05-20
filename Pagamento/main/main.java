package main;

import classes.Boleto;
import classes.CartaoDeCredito;
import classes.Transferencia;

//Carlos Alexandre Silva dos Santos(20210025904)
//Questão 2 letra b

public class main {
    public static void main(String[] args) {
        Boleto b = new Boleto();
        CartaoDeCredito c = new CartaoDeCredito();
        Transferencia t = new Transferencia();

        //testando o pagamento por boleto
        b.realizarPagamento();
        b.gerarRecibo();

        System.out.println("\n");

        //testando o pagamento por cartão
        c.realizarPagamento();
        c.gerarRecibo();

        System.out.println("\n");

        //testado o pagamento por transferância
        t.realizarPagamento();
        t.gerarRecibo();


    }
}
