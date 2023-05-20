package classes;

import java.util.ArrayList;

public class Listagem {
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static ArrayList<Pai> pais = new ArrayList<>();
    private static ArrayList<Responsavel> responsaveis = new ArrayList<>();

    private static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public static ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public static void setAlunos(ArrayList<Aluno> alunos) {
        Listagem.alunos = alunos;
    }

    public static ArrayList<Pai> getPais() {
        return pais;
    }

    public static void setPais(ArrayList<Pai> pais) {
        Listagem.pais = pais;
    }

    public static ArrayList<Responsavel> getResponsaveis() {
        return responsaveis;
    }

    public static void setResponsaveis(ArrayList<Responsavel> responsaveis) {
        Listagem.responsaveis = responsaveis;
    }

    public static void adicionar(Aluno a){
        alunos.add(a);
    }
    public static void adicionar(Pai p){
        pais.add(p);
    }
    public static void adicionar(Responsavel r){
        responsaveis.add(r);
    }
    public static void adicionar2(Pessoa p){
        pessoas.add(p);
    }

    static public String listar(){
        String saida = "";
        int i = 1;
        for(Pessoa p : pessoas){
            saida += "\n======classes.Pessoa cadastrada " + i++ + "======\n";
            saida+=p.toString();
        }
//        for(classes.Aluno a : alunos){
//            saida += "\n======classes.Pessoa cadastrada " + i++ + "======\n";
//            saida+=a.toString();
//        }
//        for(classes.Pai p : pais){
//            saida += "\n======classes.Pessoa cadastrada " + i++ + "======\n";
//            saida+=p.toString();
//        }
//        for(classes.Responsavel r : responsaveis){
//            saida += "\n======classes.Pessoa cadastrada " + i++ + "======\n";
//            saida+=r.toString();
//        }
        return  saida;
    }

    static public String listarPorTipo(String tipo){
        String saida = "";
        int i = 1;
        if(tipo.equals("ALUNO")){
            for(Aluno a : alunos){
                saida += "\n======classes.Pessoa cadastrada======\n";
                saida+=a.toString();
            }
        }else if(tipo.equals("PAI")){
            for(Pai p : pais){
                saida += "\n======classes.Pessoa cadastrada======\n";
                saida+=p.toString();
            }
        }else if(tipo.equals("RESPONSAVEL")){
            for(Responsavel r : responsaveis){
                saida += "\n======classes.Pessoa cadastrada " + i + "======\n" ;
                saida+=r.toString();
            }
        }
        return  saida;
    }
    static public int BuscarPorNome(String nome){
        int cont = 0;
        for(Pessoa p : pessoas) {
            if(p.getNome().equalsIgnoreCase(nome)) {
                System.out.println("\n\n=========PESSOA ENCONTRADA=======" + "\n" + p);
                cont++;
            }
        }
        return cont;
    }

    static public int BuscarPorIndice(int indice){
        int cont = 0;
        for(Pessoa p : pessoas) {
            if(pessoas.indexOf(p)==indice) {
                System.out.println("\n\n=========PESSOA ENCONTRADA=======" + "\n" + p);
                cont++;
            }
        }
        return cont;
    }

}
