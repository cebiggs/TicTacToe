import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by cbiggs on 6/18/15.
 */
public class GameTests {

    @Test
    public void shouldPrintBoardWhenGameStarts() {
        TicTacToe ticTacToe = mock(TicTacToe.class);
        GameController gameController = new GameController(ticTacToe);
        gameController.start();
        verify(ticTacToe).printBoard();
    }
}
