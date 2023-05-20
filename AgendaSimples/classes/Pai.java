package classes;

import classes.Pessoa;

public class Pai extends Pessoa {
    private String tipo;

    public Pai(String nome, String email, int telefone, String tipo) {
        super(nome, email, telefone);
        this.tipo = "PAI";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pai->" + super.toString();
    }
}
