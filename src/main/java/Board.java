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

    public boolean updateBoard(int index, char mark) {
        boolean wasSuccessful = false;
        if ( board[index] == ' ' ) {
            board[index] = mark;
            wasSuccessful = true;
        }
        return wasSuccessful;
    }

    public boolean isFull() {
        for(int i = 1; i <= 9; i++) {
            if( board[i] == ' ') {
                return false;
            }
        }
        return true;
    }

    private void initializeBoard() {
        for(int i = 1; i <= 9; i++) {
            board[i] = ' ';
        }
    }

    public boolean isThreeInARow(char mark) {
        boolean horizontal = isThreeInARowHorizontally(mark);
        boolean vertical = isThreeInARowVertically(mark);
        boolean diagonal = isThreeInARowDiagonally(mark);
        return horizontal || vertical || diagonal;
    }

    private boolean isThreeInARowHorizontally(char mark) {
        for(int i = 0; i < 3; i++) {
            if (board[1+i*3] == mark && board[2+i*3] == mark && board[3+i*3] == mark) {
                return true;
            }
        }
        return false;
    }

    private boolean isThreeInARowVertically(char mark) {
        for(int i = 1; i <= 3; i++) {
            if (board[i] == mark && board[i+3] == mark && board[i+6] == mark) {
                return true;
            }
        }
        return false;
    }

    private boolean isThreeInARowDiagonally(char mark) {
        if ((board[1] == mark && board[5] == mark && board[9] == mark) ||
                (board[3] == mark && board[5] == mark && board[9] == mark)) {
            return true;
        }
        return false;
    }
}
