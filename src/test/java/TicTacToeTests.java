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
    private Player player1;
    private Player player2;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        gameBufferedReader = mock(GameBufferedReader.class);
        board = mock(Board.class);
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        ticTacToe = new TicTacToe(board, player1, player2, gameBufferedReader, printStream);
    }

    @Test
    public void shouldPrintBoardWhenGameStarts() {
        when(gameBufferedReader.readLine()).thenReturn("1");
        ticTacToe.playGame();
        verify(board).printBoard();
    }

    @Test
    public void shouldPromptPlayerAndUpdateBoard() {
        when(player1.getNextMove()).thenReturn(1);
        when(player1.getSymbol()).thenReturn('X');
        ticTacToe.playGame();
        verify(board).updateBoard(player1.getNextMove(), player1.getSymbol());
    }
}
