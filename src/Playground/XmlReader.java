package Playground;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class XmlReader {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        //get path of repo root and concatinate to get the path of xml file
        String path = System.getProperty("user.dir");
        System.out.println(path);
        path += "/XMLs/Users";

        //create xml doc
        Document document = builder.parse(new File(path));
        System.out.println("Doc loaded");

    }
}
