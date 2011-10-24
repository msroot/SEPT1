package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import factory.product.graphics.*;
import factory.product.properties.*;

public class CompositeTest extends JFrame {
	
	private AbstractGraphic svgContainer;
	
	public CompositeTest(AbstractGraphic absG) {
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
		
		/* Set up the property of the svg element */
		SVGProperty svgProperty = new SVGProperty();
		svgProperty.setWidth(600, "px");
		svgProperty.setHeight(600, "px");
		
		/* Create the actual container */
		AbstractGraphic svgContainer = new SVGContainer(svgProperty);
		

		/***********************************************************************************
		 * Create a rectangle test
		 * 
		 * @author Stefan fuchs
		 * 
		 ***********************************************************************************/
		/* Here we create our Rectangles. 
		 * We have to populate the properties from the svg file's attributes */
		RectangleProperty rectProp = new RectangleProperty();
		rectProp.setX(10, null);
		rectProp.setY(300, null);
		
		rectProp.setWidth(200, "px");
		rectProp.setHeight(200, "px");
		
		/* defaults to black*/
		rectProp.setFill("darkviolet");
		//rectProp.setFill(null);
		
		/* defaults to black, or dont set ie leave it null in order to not be printed*/
		rectProp.setStroke("salmon");
		
		/* Defaults to 1px?*/
		rectProp.setStrokeWidth(5, "px");
		
		AbstractGraphic RectangleTest = new SVGRectangle(rectProp);
		svgContainer.add(RectangleTest);
		

		/**********************************************************************************
		 * Create a circle test
		 * 
		 * @author John Kolovos
		 * 
		 ***********************************************************************************/
		CircleProperty cirleProp = new CircleProperty();
		cirleProp.setCx(10, null);
		cirleProp.setCy(10, null);
		
		cirleProp.setR(200, "px");
 		
		cirleProp.setFill("limegreen");
  		cirleProp.setStroke("gold");
 		cirleProp.setStrokeWidth(5, "px");
		
 		AbstractGraphic CircleTest = new SVGCircle(cirleProp);
		svgContainer.add(CircleTest);
		
		
		/***********************************************************************************/
		
		CompositeTest ct = new CompositeTest(svgContainer);
	
		
		



	}
}
