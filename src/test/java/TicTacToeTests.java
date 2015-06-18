import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
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
        when(gameBufferedReader.readLine()).thenReturn("1");
        ticTacToe.playGame();
        verify(board).printBoard();
    }

//    @Test
//    public void shouldGetFirstPlayFromPlayerWhenGameStarts() {
//        when(gameBufferedReader.readLine()).thenReturn("1");
//        ticTacToe.playGame();
//        assertThat(player.getNextMove(), is(1));
//    }
}
