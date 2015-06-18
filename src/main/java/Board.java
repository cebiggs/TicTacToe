import java.io.PrintStream;

/**
 * Created by cbiggs on 6/18/15.
 */
public class Board {

    private PrintStream printStream;

    public Board(PrintStream printStream) {

        this.printStream = printStream;
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
