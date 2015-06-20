import org.junit.Before;
import org.junit.Test;

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
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        board = mock(Board.class);
        ticTacToe = new TicTacToe(board, player1, player2, printStream);
    }

    @Test
    public void shouldPrintBoardWhenGameStarts() {
        when(gameBufferedReader.readLine()).thenReturn("1");
        ticTacToe.playGame();
        verify(board, atLeastOnce()).printBoard();
    }

    @Test
    public void shouldPromptPlayer1AndUpdateBoard() {
        when(player1.getNextMove()).thenReturn(1);
        when(player1.getSymbol()).thenReturn('X');
        when(player2.getNextMove()).thenReturn(2);
        when(player2.getSymbol()).thenReturn('O');
        when(board.updateBoard(1, 'X')).thenReturn(true);
        when(board.updateBoard(2, 'O')).thenReturn(true);
        ticTacToe.playGame();
        verify(board, atLeastOnce()).updateBoard(player1.getNextMove(), player1.getSymbol());
        verify(board, atLeast(2)).printBoard();
    }

    @Test
    public void shouldPromptPlayer2AndUpdateBoard() {
        when(player1.getNextMove()).thenReturn(1);
        when(player1.getSymbol()).thenReturn('X');
        when(player2.getNextMove()).thenReturn(2);
        when(player2.getSymbol()).thenReturn('O');
        when(board.updateBoard(1, 'X')).thenReturn(true);
        when(board.updateBoard(2, 'O')).thenReturn(true);
        ticTacToe.playGame();
        verify(board, atLeastOnce()).updateBoard(player2.getNextMove(), player2.getSymbol());
        verify(board, atLeast(2)).printBoard();
    }

    @Test
    public void shouldRepromptPlayerIfLocationAlreadyTaken() {
        board = new Board(new char[10], printStream);
        ticTacToe = new TicTacToe(board, player1, player2, printStream);
        when(player1.getNextMove()).thenReturn(1);
        when(player1.getSymbol()).thenReturn('X');
        when(player2.getNextMove()).thenReturn(1, 2);
        when(player2.getSymbol()).thenReturn('O', 'O');
        ticTacToe.playGame();
        verify(printStream).println("Location already taken.");
    }
}
