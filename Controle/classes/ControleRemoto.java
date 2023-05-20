package classes;

public class ControleRemoto {

    private Televisao t;

    public ControleRemoto(Televisao t) {
        this.t = t;
    }

    public Televisao getT() {
        return t;
    }

    public void setT(Televisao t) {
        this.t = t;
    }

    public void aumentarVolume(){
        this.t.setVolume(this.t.getVolume()+1);
    }
    public void diminuirVolume(){
        this.t.setVolume(this.t.getVolume()-1);
    }
    public void aumentarCanal(){
        this.t.setCanal(this.t.getCanal()+1);
    }
    public void diminuirCanal(){
        this.t.setCanal(this.t.getCanal()-1);
    }

    public void trocarCanalIndicado(int canalAtual){
        if(canalAtual>=0){
            this.t.setCanal(canalAtual);
        }else{
            System.out.println("valores negativos não são permitidos!");
        }
    }

    public void consultar(){
        System.out.println(t.toString());
    }
}
