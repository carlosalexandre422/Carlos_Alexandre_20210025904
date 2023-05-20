package classes;

import classes.Pessoa;

public class Responsavel extends Pessoa {
    private String tipo;

    public Responsavel(String nome, String email, int telefone,  String tipo) {
        super(nome, email, telefone);
        this.tipo = "RESPONSAVEL";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Responsavel-> " + super.toString();
    }
}
