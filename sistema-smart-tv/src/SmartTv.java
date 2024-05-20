public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public int aumentar() {
        this.volume++;
        return this.volume;
    }

    public int abaixar() {
        this.volume--;
        return this.volume;
    }

    public void trocarCanal(){
        this.canal++;
        System.out.println("Canal atual: "+this.canal);
    }

    public void trocarCanal(int newCanal){
        this.canal = newCanal;
        System.out.println("Canal atual: "+this.canal);
    }




}

