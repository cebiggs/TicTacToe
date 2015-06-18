/**
 * Created by cbiggs on 6/18/15.
 */
public class GameController {

    private TicTacToe ticTacToe;

    public GameController(TicTacToe ticTacToe) {
        this.ticTacToe = ticTacToe;
    }

    public void start() {
        ticTacToe.playGame();
    }

    public static void main(String[] args) {
        new GameController(new TicTacToe(System.out, new Board(System.out))).start();
    }
}
