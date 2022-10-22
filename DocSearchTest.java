import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DocSearchTest {

    @Test
    public void testHandleURL() throws URISyntaxException, IOException {
        Handler h = new Handler("./technical/");
        URI test_handle = new URI("/");
        System.out.println("handleURL gives: " + h.handleRequest(test_handle));
    }

    @Test
    public void testSearch1() throws URISyntaxException, IOException {
        Handler h = new Handler("./technical/");
        URI test_handle = new URI("/search?q=strange");
        System.out.println("handleURL gives: " + h.handleRequest(test_handle));
    }
}
