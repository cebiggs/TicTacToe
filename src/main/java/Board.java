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
        for(int i = 1; i <= 5; i++) {
            if (i%2 == 1) {
                printStream.println("   |   |");
            }
            else {
                printStream.println("-----------");
            }
        }
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
