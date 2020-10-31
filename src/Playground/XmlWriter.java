package Playground;

// used this as an example https://examples.javacodegeeks.com/core-java/xml/parsers/documentbuilderfactory/modify-xml-file-in-java-using-dom-parser-example/

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class XmlWriter {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

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

    }
}
