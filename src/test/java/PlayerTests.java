import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by cbiggs on 6/18/15.
 */
public class PlayerTests {

    @Test
    public void shouldPromptPlayerForGuess() {
        PrintStream printStream = mock(PrintStream.class);

        Player player = new Player("X", mock(GameBufferedReader.class), printStream);
        player.getNextMove();
        verify(printStream).print("Enter position between 1 and 9 to make your next move: ");
    }
}
