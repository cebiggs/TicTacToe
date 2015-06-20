import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbiggs on 6/18/15.
 */
public class Board {

    private List<String> board;
    private PrintStream printStream;

    public Board( List<String> board, PrintStream printStream ) {
        this.board = board;
        this.printStream = printStream;
        setUpBoard();
    }

    public void printBoard() {
        printStream.println("" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   ");
    }

    public void updateBoard(int index, String mark) {

    }

    public boolean isPositionAvailable( int index ) {
        if (board.get(index) == "null") {
            return true;
        }
        else {
            return false;
        }
    }

    private void setUpBoard() {

    }
}
