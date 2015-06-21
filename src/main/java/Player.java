import java.io.PrintStream;

/**
 * Created by cbiggs on 6/18/15.
 */
public class Player {

    private char symbol;
    private GameBufferedReader gameBufferedReader;
    private PrintStream printStream;
    private String playerName;
    private String name;

    public Player(String playerName, char symbol, GameBufferedReader gameBufferedReader, PrintStream printStream) {
        this.playerName = playerName;
        this.symbol = symbol;
        this.gameBufferedReader = gameBufferedReader;
        this.printStream = printStream;
    }

    public int getNextMove() {
        int boardPosition = 0;

        do {
            printStream.printf("Enter position between 1 and 9 to make your next move.\n" +
                                "Player %s: ", playerName);

            try {
                boardPosition = Integer.parseInt(gameBufferedReader.readLine());
            } catch (NumberFormatException e) {}

            if (boardPosition < 1 || boardPosition > 9) {
                printStream.println("Value must be between 1 and 9.");
            }

        } while (boardPosition < 1 || boardPosition > 9);

        return boardPosition;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
