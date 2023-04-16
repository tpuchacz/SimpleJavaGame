package SimpleJavaGame.Statistics;

import SimpleJavaGame.Players.Player;

import java.util.HashMap;
import java.util.Map;

public class WinsStatistics implements Statistics{
    //Klasa licząca liczbę wygranych gier dla każdego z graczy
    private Map<String, Integer> score = new HashMap<>();
    public void winner(Player player){//andTheWinnerIs()
        score.put(player.getName(), score.getOrDefault(player.getName(),0) + 1);
    }
    public void print(){
        System.out.println("-----------------");
        System.out.println("      Punkty     ");
        for (Map.Entry<String, Integer> entry : score.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public void clear(){
        score.clear();
    }
}
