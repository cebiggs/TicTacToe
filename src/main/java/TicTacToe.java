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

    public TicTacToe(Board board, Player player1, Player player2, GameBufferedReader gameBufferedReader, PrintStream printStream) {
        this.gameBufferedReader = gameBufferedReader;
        this.printStream = printStream;
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        board.printBoard();
        board.updateBoard(player1.getNextMove(), player1.getSymbol());
        board.printBoard();
        board.updateBoard(player2.getNextMove(), player2.getSymbol());
        board.printBoard();
    }

}
