/*
 * SEPT Assignment 1
 * 
 * Author: amruta Varshini
 * 
 */
package xml;

import java.io.File;
import java.io.IOException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import datatypes.basic.util.ColorUtil;

import xml.util.XMLUtil;
import factory.factory.IAbstractFactory;
import factory.factory.IAbstractFactory.ElementType;
import factory.product.graphics.AbstractGraphic;
import factory.product.properties.CircleProperty;
import factory.product.properties.GProperty;
import factory.product.properties.LineProperty;
import factory.product.properties.RectangleProperty;
import factory.product.properties.SVGProperty;

/**
 * Concrete parser for SVG files
 * 
 * @author Amruta Varshini
 */
public class SVGParser implements IAbstractParser {

	/* private variables */
	private String fileName;
	private IAbstractFactory factory;

	/* private static variables to help determining the color */
	private static final int NOT_SUPPORTED = 0;
	private static final int IS_RGB = 1;
	private static final int IS_NAME = 2;
	private static final int IS_NONE = 3;
	

	/**
	 * Constructor
	 * 
	 * @param file
	 *            The filename
	 * @param factory
	 *            The factory to be used
	 */
	public SVGParser(String file, IAbstractFactory factory) {
		this.fileName = file;
		this.factory = factory;
	}

	@Override
	public AbstractGraphic parse() throws SAXException, IOException {

		AbstractGraphic svgContainer;

		Document doc = XMLUtil.read(new File(fileName));
		Element documentElement = doc.getDocumentElement();

		if (documentElement.getNodeName().equals("svg")) {
			svgContainer = populateSVG(documentElement);
		} else {
			System.err.println("Can not have " + documentElement.getNodeName()
					+ " as root element!");
			return null;
		}

		/* Iterate over all children */

		for (Node childElem = documentElement.getFirstChild(); childElem != null; childElem = childElem
				.getNextSibling()) {

			if (childElem.getNodeType() == Node.ELEMENT_NODE) {

				if (childElem.getNodeName().equals("rect")) {
					svgContainer.add(populateRectangle((Element) childElem));
				} else if (childElem.getNodeName().equals("circle")) {
					svgContainer.add(populateCircle((Element) childElem));
				} else if (childElem.getNodeName().equals("line")) {
					svgContainer.add(populateLine((Element) childElem));
				} else if (childElem.getNodeName().equals("g")) {
					svgContainer.add(populateG((Element) childElem));
				} else {
					System.err.println("Node with name \""
							+ childElem.getNodeName() + "\" not supported.");
				}
			}
		}

		return svgContainer;
	}

	@Override
	public void setFile(String file) {
		this.fileName = file;
	}

	/**
	 * Create an svg element
	 * 
	 * @param el
	 *            DOM element holding information
	 * @return {@link AbstractGraphic} representing an svg element
	 */
	private AbstractGraphic populateSVG(Element el) {

		boolean hasWidth = false;
		boolean hasHeight = false;
		SVGProperty prop = (SVGProperty) factory
				.createProperty(ElementType.CONTAINER_SVG);

		NamedNodeMap nnm = el.getAttributes();
		Attr atr;

		for (int i = 0; i < nnm.getLength(); i++) {
			atr = (Attr) nnm.item(i);

			if (atr.getName().equals("width")) {
				ValuePair p = splitString(atr.getValue());
				prop.setWidth(Float.parseFloat(p.length), p.unit);
				hasWidth = true;
			} else if (atr.getName().equals("height")) {
				ValuePair p = splitString(atr.getValue());
				prop.setHeight(Float.parseFloat(p.length), p.unit);
				hasHeight = true;
			} else {
				System.err.println("Attribute with name \"" + atr.getName()
						+ "\" not supported.");
			}
		}

		/*
		 * The default value has been set to 500px
		 */
		if (!hasWidth) {
			prop.setWidth(500f, "px");
		}

		if (!hasHeight) {
			prop.setHeight(500f, "px");
		}

		return factory.createElement(prop);
	}

	/**
	 * Create Rectangle element
	 * 
	 * @param el
	 *            DOM element holding information
	 * @return {@link AbstractGraphic} representing an rectangle element
	 */
	private AbstractGraphic populateRectangle(Element el) {

		boolean hasWidth = false;
		boolean hasHeight = false;
		boolean hasX = false;
		boolean hasY = false;
		boolean hasFill = false;
		boolean hasStroke = false;
		boolean hasStrokeWidth = false;

		RectangleProperty prop = (RectangleProperty) factory
				.createProperty(ElementType.RECTANGLE);

		NamedNodeMap nnm = el.getAttributes();
		Attr atr;

		for (int i = 0; i < nnm.getLength(); i++) {
			atr = (Attr) nnm.item(i);

			if (atr.getName().equals("width")) {
				ValuePair p = splitString(atr.getValue());
				prop.setWidth(Float.parseFloat(p.length), p.unit);
				hasWidth = true;
			} else if (atr.getName().equals("height")) {
				ValuePair p = splitString(atr.getValue());
				prop.setHeight(Float.parseFloat(p.length), p.unit);
				hasHeight = true;
			} else if (atr.getName().equals("x")) {
				ValuePair p = splitString(atr.getValue());
				prop.setX(Float.parseFloat(p.length), p.unit);
				hasX = true;
			} else if (atr.getName().equals("y")) {
				ValuePair p = splitString(atr.getValue());
				prop.setY(Float.parseFloat(p.length), p.unit);
				hasY = true;
			} else if (atr.getName().equals("stroke-width")) {
				ValuePair p = splitString(atr.getValue());
				prop.setStrokeWidth(Float.parseFloat(p.length), p.unit);
				hasStrokeWidth = true;
			} else if (atr.getName().equals("stroke")) {
				
				int cv = determinColorType(atr.getValue());
				
				if ( cv == IS_RGB ) {
					String[] str = splitRGB(atr.getValue());
					prop.setStroke((Integer.parseInt(str[0])),
							(Integer.parseInt(str[1])),
							(Integer.parseInt(str[2])));
				} else if ( cv == IS_NAME ){
					prop.setStroke(atr.getValue());
				} else {
					prop.setStroke(null);
				}
					
				hasStroke = true;

			} else if (atr.getName().equals("fill")) {
				
				int cv = determinColorType(atr.getValue());
				
				if ( cv == IS_NONE ) {
					prop.setFill(null);
				} else if ( cv == IS_RGB ) {
					String[] str = splitRGB(atr.getValue());
					prop.setFill((Integer.parseInt(str[0])),
							(Integer.parseInt(str[1])),
							(Integer.parseInt(str[2])));
				} else {
					prop.setFill(atr.getValue());
				}
				
				hasFill = true;

			} else {
				System.err.println("Attribute with name \"" + atr.getName()
						+ "\" not supported.");
			}
		}

		if (!hasWidth) {
			prop.setWidth(0f, "px");
		}

		if (!hasHeight) {
			prop.setHeight(0f, "px");
		}

		if (!hasX) {
			prop.setX(0f, "px");
		}

		if (!hasY) {
			prop.setY(0f, "px");
		}

		if (!hasStrokeWidth) {
			if (hasStroke) {
				prop.setStrokeWidth(1f, "px");
			} else {
				prop.setStrokeWidth(0f, "px");
			}
		}

		if (!hasStroke) {
			prop.setStroke(null);
			prop.setStrokeWidth(0f, "px");
		}

		if (!hasFill) {
			prop.setFill("black");
		}

		return factory.createElement(prop);
	}



	/**
	 * Create Circle element
	 * 
	 * @param el
	 * @return
	 */
	private AbstractGraphic populateCircle(Element el) {

		boolean hasRadius = false;
		boolean hasCx = false;
		boolean hasCy = false;
		boolean hasFill = false;
		boolean hasStroke = false;
		boolean hasStrokeWidth = false;
		CircleProperty prop = (CircleProperty) factory
				.createProperty(ElementType.CIRCLE);

		NamedNodeMap nnm = el.getAttributes();
		Attr atr;

		for (int i = 0; i < nnm.getLength(); i++) {
			atr = (Attr) nnm.item(i);

			if (atr.getName().equals("r")) {
				ValuePair p = splitString(atr.getValue());
				prop.setR(Float.parseFloat(p.length), p.unit);
				hasRadius = true;
			} else if (atr.getName().equals("cx")) {
				ValuePair p = splitString(atr.getValue());
				prop.setCx(Float.parseFloat(p.length), p.unit);
				hasCx = true;
			} else if (atr.getName().equals("cy")) {
				ValuePair p = splitString(atr.getValue());
				prop.setCy(Float.parseFloat(p.length), p.unit);
				hasCy = true;
			} else if (atr.getName().equals("stroke-width")) {
				ValuePair p = splitString(atr.getValue());
				prop.setStrokeWidth(Float.parseFloat(p.length), p.unit);
				hasStrokeWidth = true;
			} else if (atr.getName().equals("stroke")) {
				int cv = determinColorType(atr.getValue());
				
				if ( cv == IS_RGB ) {
					String[] str = splitRGB(atr.getValue());
					prop.setStroke((Integer.parseInt(str[0])),
							(Integer.parseInt(str[1])),
							(Integer.parseInt(str[2])));
				} else if ( cv == IS_NAME ){
					prop.setStroke(atr.getValue());
				} else {
					prop.setStroke(null);
				}
					
				hasStroke = true;
			} else if (atr.getName().equals("fill")) {
				int cv = determinColorType(atr.getValue());
				
				if ( cv == IS_NONE ) {
					prop.setFill(null);
				} else if ( cv == IS_RGB ) {
					String[] str = splitRGB(atr.getValue());
					prop.setFill((Integer.parseInt(str[0])),
							(Integer.parseInt(str[1])),
							(Integer.parseInt(str[2])));
				} else {
					System.out.println("in fill => colour " + atr.getValue() + "   cv: " +cv);
					prop.setFill(atr.getValue());
				}
				
				hasFill = true;
			} else {
				System.err.println("Attribute with name \"" + atr.getName()
						+ "\" not supported.");
			}
		}

		if (!hasRadius) {
			prop.setR(0f, "px");
		}

		if (!hasCx) {
			prop.setCx(0f, "px");
		}

		if (!hasCy) {
			prop.setCy(0f, "px");
		}

		if (!hasStrokeWidth) {
			if (hasStroke) {
				prop.setStrokeWidth(1f, "px");
			} else {
				prop.setStrokeWidth(0f, "px");
			}
		}

		if (!hasStroke) {
			prop.setStroke(null);
			prop.setStrokeWidth(0f, "px");
		}

		if (!hasFill) {
			prop.setFill("black");
		}

		return factory.createElement(prop);
	}

	/**
	 * Create Line element
	 * 
	 * @param el
	 * @return
	 */

	private AbstractGraphic populateLine(Element el) {

		boolean hasX1 = false;
		boolean hasY1 = false;
		boolean hasX2 = false;
		boolean hasY2 = false;
		boolean hasStroke = false;
		boolean hasStrokeWidth = false;

		LineProperty prop = (LineProperty) factory
				.createProperty(ElementType.LINE);

		NamedNodeMap nnm = el.getAttributes();
		Attr atr;

		for (int i = 0; i < nnm.getLength(); i++) {
			atr = (Attr) nnm.item(i);

			if (atr.getName().equals("x1")) {
				ValuePair p = splitString(atr.getValue());
				prop.setX1(Float.parseFloat(p.length), p.unit);
				hasX1 = true;
			} else if (atr.getName().equals("y1")) {
				ValuePair p = splitString(atr.getValue());
				prop.setY1(Float.parseFloat(p.length), p.unit);
				hasY1 = true;
			} else if (atr.getName().equals("x2")) {
				ValuePair p = splitString(atr.getValue());
				prop.setX2(Float.parseFloat(p.length), p.unit);
				hasX2 = true;
			} else if (atr.getName().equals("y2")) {
				ValuePair p = splitString(atr.getValue());
				prop.setY2(Float.parseFloat(p.length), p.unit);
				hasY2 = true;
			} else if (atr.getName().equals("stroke-width")) {
				ValuePair p = splitString(atr.getValue());
				prop.setStrokeWidth(Float.parseFloat(p.length), p.unit);
				hasStrokeWidth = true;
			} else if (atr.getName().equals("stroke")) {
				int cv = determinColorType(atr.getValue());
				
				if ( cv == IS_RGB ) {
					String[] str = splitRGB(atr.getValue());
					prop.setStroke((Integer.parseInt(str[0])),
							(Integer.parseInt(str[1])),
							(Integer.parseInt(str[2])));
				} else if ( cv == IS_NAME ){
					prop.setStroke(atr.getValue());
				} else {
					prop.setStroke(null);
				}
					
				hasStroke = true;
			} else {
				System.err.println("Attribute with name \"" + atr.getName()
						+ "\" not supported.");
			}
		}

		if (!hasX1) {
			prop.setX1(0f, "px");
		}

		if (!hasY1) {
			prop.setY1(0f, "px");
		}

		if (!hasX2) {
			prop.setX2(0f, "px");
		}

		if (!hasY2) {
			prop.setY2(0f, "px");
		}

		if (!hasStrokeWidth) {
			if (hasStroke) {
				prop.setStrokeWidth(1f, "px");
			} else {
				prop.setStrokeWidth(0f, "px");
			}
		}

		if (!hasStroke) {
			prop.setStroke(null);
			prop.setStrokeWidth(0f, "px");
		}

		return factory.createElement(prop);
	}

	private AbstractGraphic populateG(Element el) {

		GProperty prop = (GProperty) factory
				.createProperty(ElementType.CONTAINER_G);
		AbstractGraphic gContainer = factory.createElement(prop);

		for (Node child = el.getFirstChild(); child != null; child = child
				.getNextSibling()) {

			if (child.getNodeType() == Node.ELEMENT_NODE) {
				if (child.getNodeName().equals("svg")) {
					gContainer.add(populateSVG((Element) child));
				} else if (child.getNodeName().equals("g")) {
					gContainer.add(populateG((Element) child));
				} else if (child.getNodeName().equals("rect")) {
					gContainer.add(populateRectangle((Element) child));
				} else if (child.getNodeName().equals("circle")) {
					gContainer.add(populateCircle((Element) child));
				} else if (child.getNodeName().equals("line")) {
					gContainer.add(populateLine((Element) child));
				}
			}
		}

		return gContainer;
	}
	
	/**
	 * Helper method to determin the type of color attribute.
	 * 
	 * @param name
	 *            The name. Usually a color name, rgb(...) or none
	 * @return 
	 */
	private int determinColorType(String name) {
		
		if ( name.equals("none") ) {
			return IS_NONE;
		} else if ( name.toLowerCase().startsWith("rgb") ) {
			return IS_RGB;
		} else if ( ColorUtil.instance().containsColor(name) ){
			return IS_NAME;
		} else {
			return NOT_SUPPORTED;
		}
	}

	/**
	 * Private method to split strings
	 * 
	 * @param value
	 * @return
	 */
	private ValuePair splitString(String value) {
		Character c;
		ValuePair vp = new ValuePair();

		for (int i = 0; i < value.length(); i++) {
			c = value.charAt(i);
			// System.out.println(named.charValue()+"flag"+flag);
			if (Character.isDigit(c)) {
				// TODO: Deal with floats e.g. "4.5in"
				if (vp.length == null) {
					vp.length = c.toString();
				} else {
					vp.length = vp.length + c.toString();
				}
			} else {
				if (vp.unit == null) {
					vp.unit = c.toString();
				} else {
					vp.unit = vp.unit + c.toString();
				}
			}
		}
		return vp;
	}

	/**
	 * Private method to split the rgb values
	 * 
	 * @param rgb
	 * @return
	 */
	private String[] splitRGB(String rgb) {

		String color = rgb
				.substring(rgb.indexOf("(") + 1, rgb.lastIndexOf(")"));
		String[] str = color.split(",");
		for (int i = 0; i < str.length; i++) {

			str[i] = str[i].trim();
		}
		return str;
	}

	/**
	 * Inner storage class
	 * 
	 * @author Amruta Varshini
	 */
	private class ValuePair {
		public String length = null;
		public String unit = null;
	}

}
