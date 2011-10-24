/*
 * SEPT Assignment 1
 * 
 * Author: Amruta Varshini
 * 
 */
package xml;

import java.io.IOException;

import org.xml.sax.SAXException;

import factory.product.graphics.AbstractGraphic;

/**
 * Public interface for a parser that will populate a composite tree and return
 * it.
 * 
 * @author Amruta Varshini
 * 
 */
public interface IAbstractParser {

	/**
	 * Parse method that will parse the current file with the factory set in the
	 * constructor.
	 * 
	 * @return {@link AbstractGraphic} representation of the document. Or null
	 *         if the file is not a proper file of the chosen format.
	 * @throws SAXException
	 * @throws IOException
	 */
	public AbstractGraphic parse() throws SAXException, IOException;

	/**
	 * Set the filename of the file to be used.
	 * 
	 * @param file
	 *            Filename
	 */
	public void setFile(String file);

}
