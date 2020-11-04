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

public class FileWriter {

    DocumentBuilderFactory factory;
    DocumentBuilder builder;
    Document document;
    String path;
    NamedNodeMap attributes;
    Element root;
    Node[] users;
    Node coinsNode;
    Node xpNode;

    public FileWriter() {
        try {
            factory = DocumentBuilderFactory.newInstance();
            builder = factory.newDocumentBuilder();
            path = System.getProperty("user.dir");
            path += "/XMLs/Users";
            document = builder.parse(new File(path));
            root = document.getDocumentElement();
            users = new Node[1];
            users[0] = root.getElementsByTagName("User1").item(0);
            attributes = users[0].getAttributes();

            //update coins value
            coinsNode = attributes.getNamedItem("coins");
            xpNode = attributes.getNamedItem("xp");
            coinsNode.setTextContent("400");

            // write the DOM object to the file


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

}
