import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by cbiggs on 6/18/15.
 */
public class PlayerTests {

    PrintStream printStream;
    GameBufferedReader gameBufferedReader;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        gameBufferedReader = mock(GameBufferedReader.class);
    }

    @Test
    public void shouldPromptPlayerForGuess() {
        Player player = new Player("X", gameBufferedReader, printStream);
        player.getNextMove();
        verify(printStream).print("Enter position between 1 and 9 to make your next move: ");
    }

    @Test
    public void shouldGetPositionForNextMoveFromConsole() {
        when(gameBufferedReader.readLine()).thenReturn("1");
        Player player = new Player("X", gameBufferedReader, printStream);
        assertThat(player.getNextMove(), is(1));
    }
}
