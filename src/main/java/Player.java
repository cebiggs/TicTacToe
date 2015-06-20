import java.io.PrintStream;
import java.text.NumberFormat;

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
        int boardPosition = 0;

        do {

            printStream.print("Enter position between 1 and 9 to make your next move: ");

            try {
                boardPosition = Integer.parseInt(gameBufferedReader.readLine());
            } catch (NumberFormatException e) {}

            if (boardPosition < 1 || boardPosition > 9) {
                printStream.println("Value must be between 1 and 9.");
            }

        } while (boardPosition < 1 || boardPosition > 9);

        return boardPosition;
    }

    public String getSymbol() {
        return symbol;
    }
}
