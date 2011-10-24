package test;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;

import org.xml.sax.SAXException;

import factory.factory.SVGFactory;
import factory.product.graphics.AbstractGraphic;
import factory.product.properties.SVGProperty;

import xml.IAbstractParser;
import xml.SVGParser;

public class XMLTest extends JFrame {
	
	private AbstractGraphic svgContainer;
	
	public XMLTest( AbstractGraphic absG ) {
		this.svgContainer = absG;
		init();
	}
	
	private void init() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize((int)((SVGProperty)svgContainer.getProperty()).getWidth(),
					  (int)((SVGProperty)svgContainer.getProperty()).getHeight());
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	@Override
	public void paint(Graphics g) {
		
		//super.paint(g);
		svgContainer.draw(g);
	}
	
	public static void main(String[] args) throws SAXException, IOException {
//		SVGParser xml = new SVGParser("SVG.xml");
//		xml.XMLReader();
		
		IAbstractParser parser = new SVGParser("g.xml", SVGFactory.instance());
		AbstractGraphic svgContainer = parser.parse();
		
		
/* ***************************** */
		
		XMLTest xt = new XMLTest(svgContainer);
	}
}
