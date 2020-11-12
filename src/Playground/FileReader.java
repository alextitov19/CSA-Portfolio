package Playground;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;
import java.util.LinkedList;

public class FileReader {

    Document document;
    String path;
    Element root;
    LinkedList<Node> users;
    int size, currentUser;

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

            size = Integer.parseInt(root.getElementsByTagName("Size").item(0).getNodeValue());
            currentUser = Integer.parseInt(root.getElementsByTagName("CurrentUser").item(0).getNodeValue());

            //load all users
            users = new LinkedList<>();
            NodeList nlUsers = root.getElementsByTagName("User");
            for (int i = 0; i < nlUsers.getLength(); i++) {
                users.add(nlUsers.item(i));
            }

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
