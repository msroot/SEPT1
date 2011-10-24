/*
 * SEPT Assignment 1
 * 
 * Author: Amruta Varshini
 */
package xml.util;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Helper class to read XML files iwth DOM
 * 
 * @author Amruta Varshini
 * 
 */
public class XMLUtil {
	
	public static Document read(File file) throws SAXException, IOException {
		
		try {
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			builder.setEntityResolver(new EntityResolver() {

				@Override
				public InputSource resolveEntity(String publicId,
						String systemId) throws SAXException, IOException {
					//TODO: Maybe use local doctype
					System.err.println("XmlUtil: Ignoring \"" + publicId
							+ "\", \"" + systemId + "\"");
					return new InputSource(new StringReader(""));
				}
			});
			return builder.parse(file);

		} catch (ParserConfigurationException e) {
			/* This exception is never thrown, treat as fatal if it is */
			throw new RuntimeException(e);
		}
	}
}