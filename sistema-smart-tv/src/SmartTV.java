public class SmartTV {

    private boolean ligada = false;
    private int canal = 1;
    private int volume = 0;

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public void aumentarVolume() {
        this.volume += 1;
    }

    public void baixarVolume(){
        this.volume -= 1;
    }

    public void trocarCanalUP(){
        this.canal+=1;
    }
    public void trocarCanalDOWN(){
        this.canal-=1;
    }

    public void escolherCanal(int canal){
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getLigada(){
        return this.ligada;
    }

    @Override
    public String toString() {
        return "TV" + (this.ligada?"ligada":"desligada") + ", canal: " + this.canal + ", volume: " + this.volume;
    }
}
