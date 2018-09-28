import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException, SAXException {
        Client client = new Client();
        client.start();
    }
}
