import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by cbiggs on 6/18/15.
 */
public class BoardTests {

    private Board board;
    private PrintStream printStream;
    private ArrayList<String> mockList;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        mockList = mock(ArrayList.class);
        board = new Board(mockList, printStream);
    }

    @Test
    public void shouldPrintBoardWhenPrintBoardMethodIsCalled() {
        board.printBoard();
        verify(printStream).println("" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   ");
    }

    @Test
    public void positionShouldNotBeAvailableAfterMarkingPosition() {
        board.updateBoard(1, "X");
        assertThat(board.isPositionAvailable(1), is(false));
    }
}
