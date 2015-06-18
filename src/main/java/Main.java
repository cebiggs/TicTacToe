import java.io.InputStreamReader;

/**
 * Created by cbiggs on 6/18/15.
 */
public class Main {

    public static void main(String[] args) {
        GameBufferedReader gameBufferedReader = new GameBufferedReader(new InputStreamReader(System.in));
        TicTacToe ticTacToe = new TicTacToe(new Board(System.out), gameBufferedReader, System.out);
        ticTacToe.playGame();
    }
}
