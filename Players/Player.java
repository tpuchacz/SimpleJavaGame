package SimpleJavaGame.Players;

public abstract class Player {
    //Klasa abstrakcyjna opisująca Gracza
    private String name = "Domyslny";
    public Player() {}

    public Player(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z0-9.]{3,}$")) { //Od a-z, duże litery, cyfry, min. 3 znaki, kropka
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nieprawidłowe imię.");
        }
    }
    public abstract int guess();
}