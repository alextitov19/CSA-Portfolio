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

public class XmlWriter {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            //get path of repo root and concatenate to get the path of xml file
            String path = System.getProperty("user.dir");
            System.out.println(path);
            path += "/XMLs/Users";

            //create xml doc
            Document document = builder.parse(new File(path));
            System.out.println("Doc loaded");

            //get root element
            Element root = document.getDocumentElement();

            //get first user element
            Node user1 = root.getElementsByTagName("User1").item(0);

            //create NodeMap of all attributes of user1
            NamedNodeMap attributes = user1.getAttributes();

            //update coins value
            Node coinsNode = attributes.getNamedItem("coins");
            System.out.println(coinsNode.getTextContent());
            coinsNode.setTextContent("400");

            // write the DOM object to the file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();

            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);

            StreamResult streamResult = new StreamResult(new File(path));
            transformer.transform(domSource, streamResult);

            System.out.println("The XML File was updated");

        } catch (ParserConfigurationException pce) {     //catch exceptions
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }

    }
}
