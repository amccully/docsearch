import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;

public class DocSearchTest {

    @Test
    public void testHandleURL() throws IOException {
        Server.start(3030, new Handler("./technical/"));
    }
}
