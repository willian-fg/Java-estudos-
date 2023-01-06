public class Tv {
    boolean ligada=false;
    int canal=1;
    int volume=1;
    
    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;

    }
}