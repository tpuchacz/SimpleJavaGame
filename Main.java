package SimpleJavaGame;

import SimpleJavaGame.Players.PlayerComp;
import SimpleJavaGame.Statistics.NullStatistics;
import SimpleJavaGame.Statistics.Statistics;
import SimpleJavaGame.Statistics.WinsStatistics;

public class Main {
    public static void main(String[] args) {
        //Przykładowe użycie gry
        Game game = new Game(new WinsStatistics()); //Tworzenie gry liczącej statystyki
        game.addPlayer(new PlayerComp("Janusz"));
        game.addPlayer(new PlayerComp("Andrzej"));
        game.addPlayer(new PlayerComp("Andrzej"));
        for(int i =0; i<3; ++i)
            game.play();
        System.out.println("-----------------");
        game.printPlayers();
        game.printStatistics();
        game.clearStatistics();
   }
}
