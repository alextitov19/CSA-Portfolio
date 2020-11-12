package Playground;

// used this as an example https://examples.javacodegeeks.com/core-java/xml/parsers/documentbuilderfactory/modify-xml-file-in-java-using-dom-parser-example/

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.LinkedList;

public class FileWriter {

    DocumentBuilderFactory factory;
    DocumentBuilder builder;
    Document document;
    String path;
    Element root;
    LinkedList<Node> users;
    Node coinsNode;
    Node xpNode;
    Node currentuserNode;
    int currentUser;

    public FileWriter() {
        try {
            FileReader fr = new FileReader();
            factory = DocumentBuilderFactory.newInstance();
            builder = factory.newDocumentBuilder();
            path = System.getProperty("user.dir");
            path += "/XMLs/Users";
            document = builder.parse(new File(path));
            root = fr.root;
            users = fr.users;
            currentUser = fr.currentUser;

            coinsNode = users.get(currentUser).getAttributes().getNamedItem("coins");
            xpNode = users.get(currentUser).getAttributes().getNamedItem("xp");
            currentuserNode = root.getAttributes().getNamedItem("currentUser");

        } catch (ParserConfigurationException pce) {     //catch exceptions
            pce.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }
    }

    public void SetValue(int[] atts) {
        int coins = atts[0];
        int xp = atts[1];
        coinsNode.setTextContent(Integer.toString(coins));
        xpNode.setTextContent(Integer.toString(xp));
        Write();
    }

    private void Write() {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();

            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);

            StreamResult streamResult = new StreamResult(new File(path));
            transformer.transform(domSource, streamResult);

        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }

    public void SetNewCurrentUser(int n) {
        currentuserNode.setTextContent(Integer.toString(n));
        Write();
    }

}
