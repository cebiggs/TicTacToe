import java.io.PrintStream;

/**
 * Created by cbiggs on 6/18/15.
 */
public class TicTacToe {

    private GameBufferedReader gameBufferedReader;
    private PrintStream printStream;
    private Board board;

    public TicTacToe(Board board, GameBufferedReader gameBufferedReader, PrintStream printStream) {
        this.gameBufferedReader = gameBufferedReader;
        this.printStream = printStream;
        this.board = board;
    }

    public void playGame() {
        board.printBoard();
    }

}
