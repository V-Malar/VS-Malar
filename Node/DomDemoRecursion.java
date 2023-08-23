package src;

import java.io.File;
import java.util.Arrays;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomDemo {
	public static void get(Element rootelement) {
	    System.out.println("<" + rootelement.getNodeName() + ">");    
	    NodeList contents = rootelement.getChildNodes();

	    for (int i = 0; i < contents.getLength(); i++) {
	    	System.out.println("Hey");
	        Node childNode = contents.item(i);
	        if (childNode instanceof Element) {
	           get((Element) childNode); // Recursively process child elements
	    }else if (childNode.getNodeType() == Node.TEXT_NODE) {
	            System.out.println(childNode.getTextContent().trim());
	       }
	    }
	    
	    System.out.println("</" + rootelement.getNodeName() + ">");
	}

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();

		Document doc = db.parse("books.xml");
		Element rootelement = doc.getDocumentElement();
		get(rootelement);

	}
}
