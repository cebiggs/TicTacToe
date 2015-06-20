import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

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
    private Player player;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        gameBufferedReader = mock(GameBufferedReader.class);
        player = new Player('X', gameBufferedReader, printStream);
    }

    @Test
    public void shouldPromptPlayerForGuess() {
        when(gameBufferedReader.readLine()).thenReturn("1");
        player.getNextMove();
        verify(printStream).print("Enter position between 1 and 9 to make your next move: ");
    }

    @Test
    public void shouldGetPositionForNextMoveFromConsole() {
        when(gameBufferedReader.readLine()).thenReturn("1");
        assertThat(player.getNextMove(), is(1));
    }

    @Test
    public void shouldPromptAgainIfNumberEnteredIsNot1Through9() {
        when(gameBufferedReader.readLine()).thenReturn("0", "1");
        player.getNextMove();
        verify(printStream).println("Value must be between 1 and 9.");
    }

    @Test
    public void shouldPromptAgainIfStringEnteredIsNotAnInt() {
        when(gameBufferedReader.readLine()).thenReturn("null", "1");
        player.getNextMove();
        verify(printStream).println("Value must be between 1 and 9.");
    }
}
