import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by cbiggs on 6/18/15.
 */
public class GameBufferedReader {

    private BufferedReader bufferedReader;

    public GameBufferedReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String readLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeIOException(e);
        }
    }
}
