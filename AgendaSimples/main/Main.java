package main;

import classes.Aluno;
import classes.Listagem;
import classes.Pai;
import classes.Responsavel;

import javax.swing.JOptionPane;

//Carlos Alexandre Silva dos Santos(20210025904)
//Questão 1 letra b

public class Main {
    public static void main(String[] args) {
        while (true) {

            //CRIANDO A INTERFACE DO USUÁRIO
            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa cadastrada");
            String email = JOptionPane.showInputDialog("Digite o email da pessoa cadastrada");
            int telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone") );
            String[] valores = {"ALUNO", "PAI", "RESPONSAVEL"};
            String seletor = (String) (JOptionPane.showInputDialog(null, "Deseja cadastrar um aluno, pai ou responsavel?", "Tipo",
                    JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]));
            Aluno obecAluno;
            Pai obecPai;
            Responsavel obecResponsavel;

            //CHECANDO SE A MATRICULA É COOMPOSTA APENAS POR INTEIROS E SE TEM APENAS 5 CARACTERES
            if(seletor.equals("ALUNO")){
                String matricula;
                    do{
                        matricula = JOptionPane.showInputDialog("Digite a matricula");
                    }while(!Aluno.isInteger(matricula)||matricula.length()!=5);

                obecAluno = new Aluno(nome, email, telefone, seletor, matricula);
                //ADICIONANDO O NOVO ALUNO AO AO RESPECTIVO ARRAYLIST
                Listagem.adicionar(obecAluno);
                Listagem.adicionar2(obecAluno);

            }else if(seletor.equals("PAI")){
                obecPai = new Pai(nome, email, telefone, seletor);
                Listagem.adicionar(obecPai);
                Listagem.adicionar2(obecPai);
            }else if(seletor.equals("RESPONSAVEL")){
                obecResponsavel = new Responsavel(nome, email, telefone, seletor);
                Listagem.adicionar(obecResponsavel);
                Listagem.adicionar2(obecResponsavel);
            }

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais Pessoas?");
            if (escolha == 1) {
                break;
            }

        }

        //LISTANDO TODAS AS PESSOAS CADASTRADAS
        System.out.println(Listagem.listar());

        //CHAMANDO O MÉTODO PARA LISTA POR TIPO DE PESSOA
        int buscar = JOptionPane.showConfirmDialog(null, "Listar por tipo de possoa?");
        if (buscar == 0) {
            String[] valores2 = {"ALUNO", "PAI", "RESPONSAVEL"};
            String seletor2 = (String) JOptionPane.showInputDialog(null, "Escolha um tipo de pessoa: ", "Tipo",
                    JOptionPane.QUESTION_MESSAGE, null, valores2, valores2[0]);
            Listagem quant = new Listagem();

            //LISTANDO POR TIPO DE PESSOA
            if(seletor2.equals("ALUNO")){
                System.out.println("\n\n"+Listagem.listarPorTipo(valores2[0]));
            }else if(seletor2.equals("PAI")){
                System.out.println("\n\n"+Listagem.listarPorTipo(valores2[1]));
            }else if(seletor2.equals("RESPONSAVEL")){
                System.out.println("\n\n"+Listagem.listarPorTipo(valores2[2]));
            }
        }

        //MÉTODO PARA PROCURAR PESSOA POR NOME OU INDICE
        int escolha = JOptionPane.showConfirmDialog(null, "Procurar pessoa por nome ou index ?");
        if(escolha == 0){
            String[] valores3 = {"NOME", "INDICE"};
            String escolha1 = (String) JOptionPane.showInputDialog(null, "Nome ou indice? ", "Tipo",
                    JOptionPane.QUESTION_MESSAGE, null, valores3, valores3[0]);

            //PROCURANDO PESSOA PELO NOME
            if(escolha1.equals("NOME")){
                    String seletor3 = JOptionPane.showInputDialog(null, "Insira o nome da pessoa: ");
                    System.out.println(
                            "\nQuantidade de pessoas com esse nome: " + Listagem.BuscarPorNome(seletor3));
                }

            //PROCURANDO PESSOA PELO INDICE
            if(escolha1.equals("INDICE")){
                    int seletor4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o índice da pessoa: ")) ;
                    System.out.println(
                            "\nQuantidade de pessoas com esse indice: " + Listagem.BuscarPorIndice(seletor4));
                }

        }

    }
}
