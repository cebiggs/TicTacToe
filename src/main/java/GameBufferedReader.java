import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by cbiggs on 6/18/15.
 */
public class GameBufferedReader extends BufferedReader {

    public GameBufferedReader(Reader in) {
        super(in);
    }

    @Override
    public String readLine() {
        try {
            return super.readLine();
        } catch (IOException e) {
            throw new RuntimeIOException(e);
        }
    }
}
