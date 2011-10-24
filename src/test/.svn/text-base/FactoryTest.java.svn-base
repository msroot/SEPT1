package test;

import java.awt.Graphics;

import javax.swing.JFrame;

import factory.factory.IAbstractFactory;
import factory.factory.IAbstractFactory.ElementType;
import factory.factory.SVGFactory;
import factory.product.graphics.AbstractGraphic;
import factory.product.properties.*;

public class FactoryTest extends JFrame {
	
private AbstractGraphic svgContainer;
	
	public FactoryTest(AbstractGraphic absG) {
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

	public static void main(String[] args) {

		IAbstractFactory factory = SVGFactory.instance();

		/* Create the SVG element */
		SVGProperty prop = (SVGProperty) factory
				.createProperty(ElementType.CONTAINER_SVG);
		prop.setHeight(600, "px");
		prop.setWidth(600, "px");

		AbstractGraphic svgContainer = factory.createElement(prop);

		/***********************************************************************************
		 * Create a rectangle test
		 * 
		 * @author Stefan fuchs
		 * 
		 ***********************************************************************************/

		 RectangleProperty rectProp =
		 (RectangleProperty)factory.createProperty(ElementType.RECTANGLE);
		
		 rectProp.setX(10, null);
		 rectProp.setY(300, null);
		
		 rectProp.setWidth(200, null);
		 rectProp.setHeight(200, null);
		
		 rectProp.setFill("yellow");
		
		 rectProp.setStroke("green");
		 rectProp.setStrokeWidth(4, null);
		
		
		 svgContainer.add(factory.createElement(rectProp));

		/**********************************************************************************
		 * Create a circle test
		 * 
		 * @author John Kolovos
		 * 
		 ***********************************************************************************/
 
		CircleProperty cicleProp = (CircleProperty) factory
				.createProperty(ElementType.CIRCLE);
		cicleProp.setCx(10, null);
		cicleProp.setCy(10, null);
		//TODO: where do i use r?
		cicleProp.setR(200, null);
		cicleProp.setFill("tomato");
		
		cicleProp.setStrokeWidth(13, null);
		cicleProp.setStroke("brown");

 
		svgContainer.add(factory.createElement(cicleProp));

		/**********************************************************************************/

		FactoryTest ft = new FactoryTest(svgContainer);
	}
}
