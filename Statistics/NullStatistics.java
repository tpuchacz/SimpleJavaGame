package SimpleJavaGame.Statistics;

import SimpleJavaGame.Players.Player;

public class NullStatistics implements Statistics{
    //Klasa dla gier, w których nie trzeba liczyć statystyk
    public void winner(Player player) {}
    public void print() {}
    public void clear() {}
}
