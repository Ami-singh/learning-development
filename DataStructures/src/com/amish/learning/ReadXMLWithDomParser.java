package com.amish.learning;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;

public class ReadXMLWithDomParser {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		readXMLDomParser();
	}
	
	public static void readXMLDomParser() throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		Document document = builder.parse(new File("D:/workspace/DataStructures/src/com/amish/learning/JUnitTest.xml"));

		document.getDocumentElement().normalize();

		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());

		NodeList nList = document.getElementsByTagName("UnitSubSystem");
		System.out.println("============================");

		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node node = nList.item(temp);
			System.out.println("node.getNodeType()==="+node.getNodeName());
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				
				Element eElement = (Element) node;
				
			}
		}
	}

}
