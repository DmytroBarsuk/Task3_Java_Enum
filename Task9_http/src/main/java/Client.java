import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class Client {
 //   Socket socket;
    private static final Logger LOGGER = LogManager.getLogger(Client.class);
    private URL url;
    private File availableTickets;
    private DocumentBuilderFactory factory;
    private DocumentBuilder builder;

    public Client() throws IOException, ParserConfigurationException {
        url = new URL("http://10.23.149.167:9999/BookingTicket/getAvailableTicket.xml");
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        availableTickets = new File("D:\\Java\\aqa-rd-autumn-q3q4\\Task9_http\\src\\main\\resources\\tickets.xml");
    }

    public void start() throws IOException, TransformerException, SAXException, ParserConfigurationException {
    //    readXMLFromServer();
        Document docXML = builder.parse(availableTickets);
        putXMLInfoIntoList(docXML);


    }

    private void readXMLFromServer() throws IOException, ParserConfigurationException, SAXException, TransformerException {
        URLConnection connection = url.openConnection();
        InputStream inStream = connection.getInputStream();

        Document doc = builder.parse(inStream);

        TransformerFactory tfactory = TransformerFactory.newInstance();
        Transformer xform = tfactory.newTransformer();

        xform.transform(new DOMSource(doc), new StreamResult(availableTickets));

        Document docXML = builder.parse(availableTickets);

        putXMLInfoIntoList(docXML);

    }

    private void putXMLInfoIntoList(Document doc){
        List<Ticket> tickets = new ArrayList<>();
        System.out.println("Корневой элемент: "
                + doc.getDocumentElement().getNodeName());
        Element root = doc.getDocumentElement();
        NodeList nodes = root.getElementsByTagName("ticket");

        for(int i = 0; i < nodes.getLength(); i++){
            Node node = nodes.item(i);
            System.out.println(node.);
        }
    }
}

