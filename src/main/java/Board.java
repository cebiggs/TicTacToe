import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbiggs on 6/18/15.
 */
public class Board {

    private List<String> board;
    private PrintStream printStream;

    public Board( PrintStream printStream ) {
        this.printStream = printStream;
        setUpBoard();
    }

    public void setUpBoard() {
        board = new ArrayList<>(9);
        board.add(0, "null");
    }

    public void printBoard() {
        for(int i = 1; i <= 5; i++) {
            if (i%2 == 1) {
                printStream.println("   |   |");
            }
            else {
                printStream.println("-----------");
            }
        }
    }
}
