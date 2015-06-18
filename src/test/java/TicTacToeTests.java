import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by cbiggs on 6/18/15.
 */
public class TicTacToeTests {
    @Test
    public void shouldPrintBoardWhenPrintBoardMethodIsCalled() {
        PrintStream printStream = mock(PrintStream.class);
        TicTacToe ticTacToe = new TicTacToe(printStream);
        ticTacToe.printBoard();
        verify(printStream, times(3)).println("   |   |");
        verify(printStream, times(2)).println("-----------");
    }
}
