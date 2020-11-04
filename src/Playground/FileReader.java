package Playground;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class FileReader {

    Document document;
    String path;
    Element root;
    Node[] users;

    public FileReader() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            //get path of repo root and concatenate to get the path of xml file
            path = System.getProperty("user.dir");
            path += "/XMLs/Users";

            //create xml doc
            document = builder.parse(new File(path));

            //get root element
            root = document.getDocumentElement();

            //load all users
            users = new Node[1];

            //get user1 element
            users[0] = root.getElementsByTagName("User1").item(0);

            //get coins value of user1
            int coins = Integer.parseInt(users[0].getAttributes().getNamedItem("coins").getNodeValue());

            //get xp value of user1
            int xp = Integer.parseInt(users[0].getAttributes().getNamedItem("xp").getNodeValue());

        } catch (ParserConfigurationException pce) {     //catch exceptions
            pce.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }
    }

    public int[] GetAttributes() {
        int coins = Integer.parseInt(users[0].getAttributes().getNamedItem("coins").getNodeValue());
        int xp = Integer.parseInt(users[0].getAttributes().getNamedItem("xp").getNodeValue());
        int[] retArr = {coins, xp};
        return retArr;
    }
}
