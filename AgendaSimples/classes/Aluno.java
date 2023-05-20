package classes;


public class Aluno extends Pessoa {
    private String tipo;
    private String matricula;

    public Aluno(String nome, String email, int telefone, String tipo, String matricula) {
        super(nome, email, telefone);
        this.matricula = matricula;
        this.tipo = "ALUNO";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno->" + super.toString() +
                ", matricula: " + matricula;
    }

    public static boolean isInteger(String s) {
        if (s == null) {
            return false;
        }
        int length = s.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (s.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
