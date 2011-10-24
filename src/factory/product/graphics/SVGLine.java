/*
 * SEPT Assignment 1
 * 
 * Author: Rohit
 * 
 */
package factory.product.graphics;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import factory.factory.IAbstractFactory;
import factory.product.properties.AbstractProperty;
import factory.product.properties.LineProperty;

/**
 * the class represent an AVG Line
 * 
 * @author Rohit
 * 
 */
public class SVGLine extends AbstractGraphic {

	public SVGLine(AbstractProperty property) {
		super(property);
	}

	@Override
	public void draw(Graphics g) {

		if (getProperty().getType() != IAbstractFactory.ElementType.LINE) {
			System.err.println("Property not of type Rectangle! ERROR!");
			System.exit(0);
		}
		LineProperty prop = (LineProperty) getProperty();
		Graphics2D g2d = (Graphics2D) g;

		java.awt.Color oldColor = g2d.getColor();
		java.awt.Stroke oldStroke = g2d.getStroke();

		/* Check the outline */

		/* Stroke was not specified, nothing is happening */
		if (prop.getStroke() != null) {
			if (prop.getStrokeWidth() > 0) {
				g2d.setColor(new java.awt.Color(prop.getStroke().getR(), prop
						.getStroke().getG(), prop.getStroke().getB()));
				g2d.setStroke(new BasicStroke(prop.getStrokeWidth()));
				g2d.drawLine((int) prop.getX1(), (int) prop.getY1(),
						(int) prop.getX2(), (int) prop.getY2());

				/* reset g2d to default values */
				g2d.setStroke(oldStroke);
				g2d.setColor(oldColor);
			}
		}
	}

}
