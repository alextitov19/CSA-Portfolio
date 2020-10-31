package Playground;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class XmlReader {

    public static void main(String[] args) throws ParserConfigurationException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        //Document document = builder.parse(new File("Users.xml"));
        String path = System.getProperty("user.dir");
        System.out.println();

    }
}
