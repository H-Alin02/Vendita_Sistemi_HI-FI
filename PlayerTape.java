import javax.sound.midi.Soundbank;

public class PlayerTape implements AbstractPlayer{
    public PlayerTape(){
        this.play();
    }
    @Override
    public void play(){
        System.out.println("Ascolti il record sulla piattaforma tape!!");
    }
}
