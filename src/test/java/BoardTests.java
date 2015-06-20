import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

/**
 * Created by cbiggs on 6/18/15.
 */
public class BoardTests {

    private Board board;
    private PrintStream printStream;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = new Board(new char[10], printStream);
    }

    @Test
    public void shouldPrintEmptyBoardWhenBoardIsInitialized() {
        board.printBoard();
        verify(printStream).printf("" +
                " %c | %c | %c \n" +
                "-----------\n" +
                " %c | %c | %c \n" +
                "-----------\n" +
                " %c | %c | %c ", ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ');
    }

    @Test
    public void shouldPutMarkInCorrectPositionWhenPlayerChoosesPositionAtStart() {
        board.updateBoard(1, 'X');
        board.updateBoard(2, 'O');
        board.printBoard();
        verify(printStream).printf("" +
                " %c | %c | %c \n" +
                "-----------\n" +
                " %c | %c | %c \n" +
                "-----------\n" +
                " %c | %c | %c ", 'X', 'O', ' ', ' ', ' ', ' ', ' ', ' ', ' ');
    }
}
