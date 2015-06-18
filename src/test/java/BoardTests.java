import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by cbiggs on 6/18/15.
 */
public class BoardTests {

    private Board board;
    private PrintStream printStream;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldPrintBoardWhenPrintBoardMethodIsCalled() {
        board = new Board(printStream);
        board.printBoard();
        verify(printStream, times(3)).println("   |   |");
        verify(printStream, times(2)).println("-----------");
    }

    @Test
    public void shouldContainXInCorrectPositionWhenPlayerMakesMove() {

    }
}
