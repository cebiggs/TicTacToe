/**
 * Created by cbiggs on 6/18/15.
 */
public class Player {

    private String symbol;
    private GameBufferedReader gameBufferedReader;

    public Player(String symbol, GameBufferedReader gameBufferedReader) {
        this.symbol = symbol;
        this.gameBufferedReader = gameBufferedReader;
    }

    public int getNextMove() {

        return Integer.parseInt(gameBufferedReader.readLine());
    }

    public String getSymbol() {
        return symbol;
    }
}
