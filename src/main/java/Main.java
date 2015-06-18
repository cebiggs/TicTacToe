import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by cbiggs on 6/18/15.
 */
public class Main {

    public static void main(String[] args) {
        GameBufferedReader gameBufferedReader = new GameBufferedReader(new InputStreamReader(System.in));
        Board board = new Board(new ArrayList<String>(9), System.out);
        TicTacToe ticTacToe = new TicTacToe(board, gameBufferedReader, System.out);
        ticTacToe.playGame();
    }
}
