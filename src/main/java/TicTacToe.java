/**
 * Created by cbiggs on 6/18/15.
 */
public class TicTacToe {

    private Board board;
    private Player player1;
    private Player player2;

    public TicTacToe(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        board.printBoard();
        updateBoardWithPlayerMove(player1);
        board.printBoard();
        updateBoardWithPlayerMove(player2);
        board.printBoard();
    }

    private void updateBoardWithPlayerMove(Player player) {
        board.updateBoard(player.getNextMove(), player.getSymbol());
    }

}
