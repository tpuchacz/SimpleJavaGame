package SimpleJavaGame.Players;

import java.util.Scanner;

public class PlayerHuman extends Player {
    private Scanner cin = new Scanner(System.in);

    public PlayerHuman() {}

    public PlayerHuman(String name) {
        super(name);
    }

    @Override //Przeciążenie abstrakcyjnej metody guess klasy player (gracz wybiera liczby)
    public int guess() {
        System.out.print("Wpisz liczbę (1-6): ");
        return cin.nextInt();
    }

}