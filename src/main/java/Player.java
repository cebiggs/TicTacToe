import java.io.PrintStream;

/**
 * Created by cbiggs on 6/18/15.
 */
public class Player {

    private String symbol;
    private GameBufferedReader gameBufferedReader;
    private PrintStream printStream;

    public Player(String symbol, GameBufferedReader gameBufferedReader, PrintStream printStream) {
        this.symbol = symbol;
        this.gameBufferedReader = gameBufferedReader;
        this.printStream = printStream;
    }

    public int getNextMove() {
        printStream.print("Enter position between 1 and 9 to make your next move: ");

        return 1;
    }

    public String getSymbol() {
        return symbol;
    }
}
