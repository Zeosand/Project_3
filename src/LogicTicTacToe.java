import java.util.Scanner;
public class LogicTicTacToe {
    private java.util.Scanner Scanner;
    private int amountOfGames=0;
    private boolean cont=false;
    TicTacToe game;
    Scanner scan=new Scanner(System.in);

    public LogicTicTacToe(){}

    public LogicTicTacToe (int amountOfGames) {
        this.amountOfGames=amountOfGames;
    }

    public void run() {
        names();
        if (amountOfGames == 0) {
            while (!cont)  {
                play();
                again();
            }
        } else{
            for (int i=0; i<amountOfGames; i++) {
                play();
                game.reset();
            }
            game.setGameOver(true);
            System.out.println("GAME OVER TY FOR PLAYING");
        }
    }

    public void names(String name, String name2) {
        Player p1 = new Player(name);
        Player p2 = new Player(name2);
        game = new TicTacToe(p1, p2);
        game.Symbols();
    }

    private void names() {
        // get player names
        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.print("Enter player 1's name: ");
        String p1Name = scan.nextLine();
        System.out.print("Enter player 2's name: ");
        String p2Name = scan.nextLine();
        // initialize Player objects and MathGame object
        Player p1 = new Player(p1Name);
        Player p2 = new Player(p2Name);
        game = new TicTacToe(p1, p2);
        game.Symbols();
    }
    private void play() {
        // get player names
        game.startingPlayer();
        System.out.println(game.getNameOfStartingPlayer()+" starts the game");
        System.out.println(game.grid());
        game.start();
        // present menu
    }
    public void again() {
        game.reset();
        System.out.print("Do you want to play again? y/n: ");
        String answer=scan.nextLine();
        System.out.println();
        if (answer.equals("y")) {
            play();
        } else{
            cont=true;
            System.out.println("Thank you for playing!");
        }
    }
}


