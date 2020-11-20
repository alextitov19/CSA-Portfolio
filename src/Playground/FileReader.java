package Playground;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
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

            size = Integer.parseInt(root.getAttributes().getNamedItem("size").getNodeValue());
            currentUser = Integer.parseInt(root.getAttributes().getNamedItem("currentUser").getNodeValue());
            System.out.printf("Current user : %d\n", currentUser);

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
        int coins = Integer.parseInt(users.get(currentUser).getAttributes().getNamedItem("coins").getNodeValue());
        int xp = Integer.parseInt(users.get(currentUser).getAttributes().getNamedItem("xp").getNodeValue());
        int[] retArr = {coins, xp};
        return retArr;
    }

    public int[] GetUnlocks() {
        NodeList children = users.get(currentUser).getChildNodes();
        int[] arr = new int[6];
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            String name = child.getNodeName();
            if (child instanceof Element == false) {
                continue;
            }
            switch (name) {
                case "physicsFormula1":
                    arr[0] = Integer.parseInt(child.getTextContent());
                    break;
                case "physicsFormula2":
                    arr[1] = Integer.parseInt(child.getTextContent());
                    break;
                case "physicsFormula3":
                    arr[2] = Integer.parseInt(child.getTextContent());
                    break;
                case "physicsFormula4":
                    arr[3] = Integer.parseInt(child.getTextContent());
                    break;
                case "calculator":
                    arr[4] = Integer.parseInt(child.getTextContent());
                    break;
                case "graphingCalculator":
                    arr[5] = Integer.parseInt(child.getTextContent());
                    break;
            }
        }
        return arr;
    }

    public void SetValue(int[] atts) {
        int coins = atts[0];
        int xp = atts[1];
        users.get(currentUser).getAttributes().getNamedItem("coins").setTextContent(Integer.toString(coins));
        users.get(currentUser).getAttributes().getNamedItem("xp").setTextContent(Integer.toString(xp));
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
        root.getAttributes().getNamedItem("currentUser").setTextContent(Integer.toString(n));
        Write();
    }


}
