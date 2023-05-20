package classes;

public class Televisao {
    private int volume;
    private int canal;


    public Televisao() {
        this.canal = 0;
        this.volume = 0;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "===============\n" +
                "volume: " + volume +
                "\ncanal: " + canal
                + "\n===============";
    }
}
