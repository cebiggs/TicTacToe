import java.io.PrintStream;

/**
 * Created by cbiggs on 6/18/15.
 */
public class TicTacToe {

    private PrintStream printStream;
    private Board board;

    public TicTacToe(PrintStream printStream, Board board) {
        this.printStream = printStream;
        this.board = board;
    }

    public void playGame() {
        board.printBoard();
    }
}
