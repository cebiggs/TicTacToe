import java.io.PrintStream;

/**
 * Created by cbiggs on 6/18/15.
 */
public class TicTacToe {

    private Board board;
    private Player player1;
    private Player player2;
    private PrintStream printStream;

    public TicTacToe(Board board, Player player1, Player player2, PrintStream printStream) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.printStream = printStream;
    }

    public void playGame() {
        board.printBoard();
        updateBoardWithPlayerMove(player1);
        board.printBoard();
        updateBoardWithPlayerMove(player2);
        board.printBoard();
    }

    private void updateBoardWithPlayerMove(Player player) {
        boolean boardUpdatedSuccessfully = board.updateBoard(player.getNextMove(), player.getSymbol());

        while (!boardUpdatedSuccessfully) {
            printStream.println("Location already taken.");
            boardUpdatedSuccessfully = board.updateBoard(player.getNextMove(), player.getSymbol());
        }
    }

}
