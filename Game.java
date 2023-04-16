package SimpleJavaGame;

import SimpleJavaGame.Players.Player;
import SimpleJavaGame.Statistics.NullStatistics;
import SimpleJavaGame.Statistics.Statistics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {
    //Klasa zawierająca logikę gry
    private Random rand = new Random();
    private List<Player> playerList = new ArrayList<>();
    private Statistics statistics;
    
    public Game(){
        this(null);
    }

    public Game(Statistics statistics) {
        if(statistics != null)
            this.statistics = statistics; 
        else
            this.statistics = new NullStatistics();
    }
    
    public void addPlayer(Player player) {
        if(!nameExists(player.getName()))
            playerList.add(player);
        else{
            player.setName(player.getName() + rand.nextInt(10));
            addPlayer(player);
        }
    }
    
    public void removePlayer(String player) {
        if (nameExists(player)) {
            for (Iterator<Player> it = playerList.iterator(); it.hasNext();) {
                if (it.next().getName().equals(player)) {
                    it.remove();
                    break;
                }
            }
        } else {
            System.out.println("Gracz nie istnieje");
        }
    }

    public void printStatistics(){
        statistics.print();
    }

    public void clearStatistics(){ statistics.clear(); }

    private boolean nameExists(String name){
        for (Player player2 : playerList) {
            if(player2.getName().equals(name))
                return true;
        }
        return false;
    }

    public void printPlayers(){
        if(!playerList.isEmpty()){
            System.out.println("Lista graczy: ");
            for (Player player : playerList) {
                System.out.println(player.getName());
            }
        } else{
            System.out.println("Brak graczy");
        }
    }

    public void play() {
        boolean repeat = true;
        do {
            System.out.println("---------------------");
            int number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            for (Player player : playerList) {
                int guess = player.guess(); // odgadywanie zlecamy obiektowi klasy Player
                System.out.println("Gracz " + player.getName() + ": " + guess);
                if (guess == number) {
                    System.out.println("BRAWO!");
                    statistics.winner(player);
                    repeat = false;
                } else {
                    System.out.println("PUDLO!");
                }
            }
        } while (repeat);
    }
}
