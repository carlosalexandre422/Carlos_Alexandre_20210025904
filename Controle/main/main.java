package main;

import classes.ControleRemoto;
import classes.Televisao;

//Carlos Alexandre Silva dos Santos(20210025904)
//Questão 3 letra b

public class main {
    public static void main(String[] args) {
        Televisao t = new Televisao();
        ControleRemoto c = new ControleRemoto(t);

        c.consultar();

        c.aumentarCanal();
        c.consultar();

        c.aumentarVolume();
        c.consultar();

        c.diminuirCanal();
        c.consultar();

        c.diminuirVolume();
        c.consultar();

        c.trocarCanalIndicado(-15);
        c.consultar();

        c.trocarCanalIndicado(15);
        c.consultar();
    }
}
