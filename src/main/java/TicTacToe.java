import java.io.PrintStream;

/**
 * Created by cbiggs on 6/18/15.
 */
public class TicTacToe {

    private Board board;
    private Player player1;
    private Player player2;
    private PrintStream printStream;
    private boolean gameOver;

    public TicTacToe(Board board, Player player1, Player player2, PrintStream printStream) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.printStream = printStream;
        gameOver = false;
    }

    public void playGame() {
        while (!gameOver) {
            board.printBoard();
            updateBoardWithPlayerMove(player1);

            if (gameOver) {
                break;
            }
            board.printBoard();
            updateBoardWithPlayerMove(player2);
        }
    }

    public void updateBoardWithPlayerMove(Player player) {
        if (board.isFull()) {
            gameOver(null);
            return;
        }

        boolean boardUpdatedSuccessfully = board.updateBoard(player.getNextMove(), player.getSymbol());

        while (!boardUpdatedSuccessfully) {
            printStream.println("Location already taken.");
            boardUpdatedSuccessfully = board.updateBoard(player.getNextMove(), player.getSymbol());
        }

        if (board.isThreeInARow(player.getSymbol())) {
            gameOver(player1);
        }
    }

    private void gameOver(Player winningPlayer) {
        gameOver = true;
        board.printBoard();

        if (winningPlayer == null) {
            printStream.println("Game is a draw");
        }

        else {
            printStream.printf("Player %c wins!\n", winningPlayer.getSymbol());
        }
    }
}
