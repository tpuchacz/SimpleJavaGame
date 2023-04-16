package SimpleJavaGame.Players;
import java.util.Random;

public class PlayerComp extends Player {
    //Gracz jako komputer
    private Random brain = new Random();

    //Zmiana ciągu znaków name klasy Player
    public PlayerComp(String name) {
        super(name);
    }

    @Override //Przeciążenie abstrakcyjnej metody guess klasy player (losowanie liczby)
    public int guess() {
        return brain.nextInt(6) + 1;
    }

}