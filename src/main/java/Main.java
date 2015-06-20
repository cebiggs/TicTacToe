import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by cbiggs on 6/18/15.
 */
public class Main {

    public static void main(String[] args) {
        GameBufferedReader gameBufferedReader = new GameBufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        PrintStream printStream = new PrintStream(System.out);
        Board board = new Board(new char[10], System.out);
        Player player1 = new Player('X', gameBufferedReader, printStream);
        Player player2 = new Player('O', gameBufferedReader, printStream);
        TicTacToe ticTacToe = new TicTacToe(board, player1, player2, printStream);
        ticTacToe.playGame();
    }
}
