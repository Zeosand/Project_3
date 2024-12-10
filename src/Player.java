public class Player {
    private int winningStreak;
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public Player() {
        name = "Unknown";
    }

    public String getName() {
        return name;
    }

    public void win() {
        winningStreak++;
    }

    public void win(int x) {
        winningStreak+=x;
    }

    public void resetStreak() {
        winningStreak = 0;
    }

    public int getWinningStreak() {
        return winningStreak;
    }
}
