import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * Created by cbiggs on 6/18/15.
 */
public class TicTacToeTests {

    private TicTacToe ticTacToe;
    private PrintStream printStream;
    private GameBufferedReader gameBufferedReader;
    private Board board;
    private Player player;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        gameBufferedReader = mock(GameBufferedReader.class);
        board = mock(Board.class);
        player = mock(Player.class);
        ticTacToe = new TicTacToe(board, gameBufferedReader, printStream);
    }

    @Test
    public void shouldPrintBoardWhenGameStarts() {
        ticTacToe.playGame();
        verify(board).printBoard();
    }
}
