import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by cbiggs on 6/18/15.
 */
public class TicTacToeTests {
    @Test
    public void shouldPrintBoardWhenGameStarts() {
        Board board = mock(Board.class);
        PrintStream printStream = mock(PrintStream.class);
        TicTacToe ticTacToe = new TicTacToe(printStream, board);

        ticTacToe.playGame();

        verify(board).printBoard();
    }
}
