import java.io.PrintStream;

/**
 * Created by cbiggs on 6/18/15.
 */
public class TicTacToe {

    private GameBufferedReader gameBufferedReader;
    private PrintStream printStream;
    private Board board;
    private Player player1;
    private Player player2;

    public TicTacToe(Board board, GameBufferedReader gameBufferedReader, PrintStream printStream) {
        this.gameBufferedReader = gameBufferedReader;
        this.printStream = printStream;
        this.board = board;

        initializePlayers();
    }

    public void playGame() {
        board.printBoard();

        printStream.println("Enter a number between 1 and 9.");
        printStream.print("Player 1: ");



        board.updateBoard(player1.getNextMove(), player1.getSymbol());
    }

    private void initializePlayers() {
        player1 = new Player("X", gameBufferedReader);
        player2 = new Player("O", gameBufferedReader);
    }

}
