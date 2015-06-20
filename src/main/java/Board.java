import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbiggs on 6/18/15.
 */
public class Board {

    private char[] board;
    private PrintStream printStream;

    public Board( char[] board, PrintStream printStream ) {
        this.board = board;
        this.printStream = printStream;
        initializeBoard();
    }

    public void printBoard() {
        printStream.printf("" +
                " %c | %c | %c \n" +
                "-----------\n" +
                " %c | %c | %c \n" +
                "-----------\n" +
                " %c | %c | %c \n", board[1], board[2], board[3], board[4], board[5], board[6], board[7], board[8], board[9]);
    }

    public void updateBoard(int index, char mark) {
        board[index] = mark;
    }

    private void initializeBoard() {
        for(int i = 1; i <= 9; i++) {
            board[i] = ' ';
        }
    }
}
