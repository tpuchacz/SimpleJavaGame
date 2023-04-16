package SimpleJavaGame.Statistics;

import SimpleJavaGame.Players.Player;

public interface Statistics {
    //Interfejs do obsługi statystyk
    void winner(Player player);
    void print();
    void clear();
}
