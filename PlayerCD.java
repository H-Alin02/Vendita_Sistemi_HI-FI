public class PlayerCD implements AbstractPlayer{
    public PlayerCD(){
        this.play();
    }
    @Override
    public void play(){
        System.out.println("Ascolti il record sulla piattaforma CD!");
    }
}
