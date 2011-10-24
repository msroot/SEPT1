/*
 * SEPT Assignment 1
 * 
 * Author: Stefan fuchs
 * 
 */
package factory.product.graphics;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import factory.factory.IAbstractFactory;
import factory.product.properties.AbstractProperty;
import factory.product.properties.RectangleProperty;

/**
 * This class represents an AVG Rectangle
 * 
 * @author Stefan Fuchs
 * 
 */
public class SVGRectangle extends AbstractGraphic {

	/**
	 * Constructor for the rectangle.
	 * 
	 * @param property
	 *            The property.
	 */
	public SVGRectangle(AbstractProperty property) {
		super(property);
	}

	@Override
	public void draw(Graphics g) {

		if (getProperty().getType() != IAbstractFactory.ElementType.RECTANGLE) {
			System.err.println("Property not of type Rectangle! ERROR!");
			System.exit(0);
		}

		RectangleProperty prop = (RectangleProperty) getProperty();
		Graphics2D g2d = (Graphics2D) g;

		java.awt.Color oldColor = g2d.getColor();
		java.awt.Stroke oldStroke = g2d.getStroke();

		/*
		 * 1. Draw the rectangle with the filling 2. Draw the outline of the
		 * rectangle.
		 */

		/*
		 * Print the filling of the rectangle only if fill is not "none" aka
		 * null
		 */
		if (prop.getFill() != null) {

			g2d.setColor(new java.awt.Color(prop.getFill().getR(), prop
					.getFill().getG(), prop.getFill().getB()));

			g2d.fillRect((int) prop.getX(), (int) prop.getY(),
					(int) prop.getWidth(), (int) prop.getHeight());
		}
		/* reset Color to old color */
		g2d.setColor(oldColor);

		/* Check the outline */

		/* Stroke was not specified, nothing is happening */
		if ( prop.getStroke() != null ) {
			if (prop.getStrokeWidth() > 0) {
				g2d.setColor(new java.awt.Color(prop.getStroke().getR(), prop
						.getStroke().getG(), prop.getStroke().getB()));
				g2d.setStroke(new BasicStroke(prop.getStrokeWidth()));
				g2d.drawRect((int) prop.getX(), (int) prop.getY(),
						(int) prop.getWidth(), (int) prop.getHeight());

				/* reset g2d to default values */
				g2d.setStroke(oldStroke);
				g2d.setColor(oldColor);
			}
		}
	}
}
