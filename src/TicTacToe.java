import java.util.Scanner;
public class TicTacToe {
    private String a1 = "";
    private String a2 = "";
    private String a3 = "";
    private String b1 = "";
    private String b2 = "";
    private String b3 = "";
    private String c1 = "";
    private String c2 = "";
    private String c3 = "";
    private String startingPlayer = "";
    private String currentPlayer;
    private Player player1;
    private Player player2;
    private boolean gameOver = false;
    private final Scanner scan = new Scanner(System.in);
    private String a="";
    private String b="";

    public TicTacToe() {
        currentPlayer = null;
    }

    public TicTacToe(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    public void setGameOver(boolean x ) {
        gameOver=x;
    }

    public void Symbols() {
        System.out.print("Enter your symbol "+player1.getName()+": ");
        a=scan.nextLine();
        System.out.print("Enter your symbol "+player2.getName()+": ");
        b=scan.nextLine();
    }

    public void start() {
        while (!gameOver) {
            System.out.println();
            placeMove();
            switchPlayers();
            System.out.println(currentPlayer + "'s turn");
            System.out.println(grid());
            checkIfWin();
        }
    }

    public void placeMove() {
        System.out.print("Place your move on the grid e.g. c3, a1: ");
        String move = scan.nextLine();
        if (a1.isEmpty() && currentPlayer.equals(player1.getName()) && move.equals("a1")) {
            a1 = a;
        } else if (a2.isEmpty() && currentPlayer.equals(player1.getName()) && move.equals("a2")) {
            a2 = a;
        } else if (a3.isEmpty() && currentPlayer.equals(player1.getName()) && move.equals("a3")) {
            a3 = a;
        } else if (b1.isEmpty() && currentPlayer.equals(player1.getName()) && move.equals("b1")) {
            b1 = a;
        } else if (b2.isEmpty() && currentPlayer.equals(player1.getName()) && move.equals("b2")) {
            b2 = a;
        } else if (b3.isEmpty() && currentPlayer.equals(player1.getName()) && move.equals("b3")) {
            b3 = a;
        } else if (c1.isEmpty() && currentPlayer.equals(player1.getName())  && move.equals("c1")) {
            c1 = a;
        } else if (c2.isEmpty() && currentPlayer.equals(player1.getName()) && move.equals("c2")) {
            c2 = a;
        } else if (c3.isEmpty() && currentPlayer.equals(player1.getName()) && move.equals("c3")) {
            c3 = a;
        }
        // player 2
        else if (a1.isEmpty() && currentPlayer.equals(player2.getName()) && move.equals("a1")) {
            a1 = b;
        } else if (a2.isEmpty() && currentPlayer.equals(player2.getName())  && move.equals("a2")) {
            a2 = b;
        } else if (a3.isEmpty() && currentPlayer.equals(player2.getName())  && move.equals("a3")) {
            a3 = b;
        } else if (b1.isEmpty() && currentPlayer.equals(player2.getName())  && move.equals("b1")) {
            b1 = b;
        } else if (b2.isEmpty() && currentPlayer.equals(player2.getName()) && move.equals("b2")) {
            b2 = b;
        } else if (b3.isEmpty() && currentPlayer.equals(player2.getName())  && move.equals("b3")) {
            b3 = b;
        } else if (c1.isEmpty() && currentPlayer.equals(player2.getName()) && move.equals("c1")) {
            c1 = b;
        } else if (c2.isEmpty() && currentPlayer.equals(player2.getName())  && move.equals("c2")) {
            c2 = b;
        } else if (c3.isEmpty() && currentPlayer.equals(player2.getName()) && move.equals("c3")) {
            c3 = b;
        } else {
            System.out.println("invalid move");
            placeMove();
        }
    }

    public void checkIfWin() {
        //vertical patterns
        if (a1.equals(a) && a2.equals(a) && a3.equals(a)) {
            player1.win();
            System.out.println(player1.getName() + " wins with a win streak of "+ player1.getWinningStreak());
            gameOver = true;
            player2.resetStreak();
        } else if (b1.equals(a) && b2.equals(a) && b3.equals(a)) {
            player1.win();
            System.out.println(player1.getName() + " wins with a win streak of "+ player1.getWinningStreak());
            gameOver = true;
            player2.resetStreak();
        } else if (c1.equals(a) && c2.equals(a) && c3.equals(a)) {
            player1.win();
            System.out.println(player1.getName() + " wins with a win streak of "+ player1.getWinningStreak());
            gameOver = true;
            player2.resetStreak();
        }
        // horizontal patterns
        else if (a1.equals(a) && b1.equals(a) && c1.equals(a)) {
            player1.win();
            System.out.println(player1.getName() + " wins with a win streak of "+ player1.getWinningStreak());
            gameOver = true;
            player2.resetStreak();
        } else if (a2.equals(a) && b2.equals(a) && c2.equals(a)) {
            player1.win();
            System.out.println(player1.getName() + " wins with a win streak of "+ player1.getWinningStreak());
            gameOver = true;
            player2.resetStreak();
        } else if (a3.equals(a) && b3.equals(a) && c3.equals(a)) {
            player1.win();
            System.out.println(player1.getName() + " wins with a win streak of "+ player1.getWinningStreak());
            gameOver = true;
            player2.resetStreak();
        }
        //diagonal patterns
        else if (a1.equals(a) && b2.equals(a) && c3.equals(a)) {
            player1.win();
            System.out.println(player1.getName() + " wins with a win streak of "+ player1.getWinningStreak());
            gameOver = true;
            player2.resetStreak();
        } else if (c1.equals(a) && b2.equals(a) && a3.equals(a)) {
            player1.win();
            System.out.println(player1.getName() + " wins with a win streak of "+ player1.getWinningStreak());
            gameOver = true;
            player2.resetStreak();

            //player 2
            //vertical patterns
        }else if (a1.equals(b) && a2.equals(b) && a3.equals(b)) {
            player2.win();
            System.out.println(player2.getName() + " wins with a win streak of "+ player2.getWinningStreak());
            gameOver = true;
            player1.resetStreak();
        } else if (b1.equals(b) && b2.equals(b) && b3.equals(b)) {
            player2.win();
            System.out.println(player2.getName() + " wins with a win streak of "+ player2.getWinningStreak());
            gameOver = true;
            player1.resetStreak();
        } else if (c1.equals(b) && c2.equals(b) && c3.equals(b)) {
            player2.win();
            System.out.println(player2.getName() + " wins with a win streak of "+ player2.getWinningStreak());
            gameOver = true;
            player1.resetStreak();
        }
        // horizontal patterns
        else if (a1.equals(b) && b1.equals(b) && c1.equals(b)) {
            player2.win();
            System.out.println(player2.getName() + " wins with a win streak of "+ player2.getWinningStreak());
            gameOver = true;
            player1.resetStreak();
        } else if (a2.equals(b) && b2.equals(b) && c2.equals(b)) {
            player2.win();
            System.out.println(player2.getName() + " wins with a win streak of "+ player2.getWinningStreak());
            gameOver = true;
            player1.resetStreak();
        } else if (a3.equals(b) && b3.equals(b) && c3.equals(b)) {
            player2.win();
            System.out.println(player2.getName() + " wins with a win streak of "+ player2.getWinningStreak());
            gameOver = true;
            player1.resetStreak();
        }
        //diagonal patterns
        else if (a1.equals(b) && b2.equals(b) && c3.equals(b)) {
            player2.win();
            System.out.println(player2.getName() + " wins with a win streak of "+ player2.getWinningStreak());
            gameOver = true;
            player1.resetStreak();
        } else if (c1.equals(b) && b2.equals(b) && a3.equals(b)) {
            player2.win();
            System.out.println(player2.getName() + " wins with a win streak of "+ player2.getWinningStreak());
            gameOver = true;
            player1.resetStreak();
            //tie
        } else if (!a1.isEmpty() && !a2.isEmpty() && !a3.isEmpty() && !b1.isEmpty() && !b2.isEmpty() && !b3.isEmpty() && !c1.isEmpty() && !c2.isEmpty() && !c3.isEmpty()) {
            System.out.println("TIE");
            gameOver=true;
            player1.resetStreak();
            player2.resetStreak();
        }
    }

    public void reset() {
        a1 = "";
        a2 = "";
        a3 = "";
        b1 = "";
        b2 = "";
        b3 = "";
        c1 = "";
        c2 = "";
        c3 = "";
        gameOver = false;
    }
    public String grid() {
        return "    A      B     C    " + "\n" + "1   " + a1 + "   |   " + b1 + "   |   " + c1 + "\n" + " ---------------------- " + "\n" + "2   " + a2 + "   |   " + b2 + "   |   " + c2 + "\n" + " ---------------------- " + "\n" + "3   " + a3 + "   |   " + b3 + "   |   " + c3;
    }
    public void startingPlayer() {
        int random = (int) (Math.random() * 2) + 1;
        if (random == 1) {
            currentPlayer = player1.getName();
        } else {
            currentPlayer = player2.getName();
        }
        startingPlayer = currentPlayer;
    }

    public String getNameOfStartingPlayer() {
        return startingPlayer;
    }

    public void switchPlayers() {
        if (currentPlayer.equals(player1.getName())) {
            currentPlayer = player2.getName();
        } else if (currentPlayer.equals(player2.getName())) {
            currentPlayer = player1.getName();
        }
    }
}