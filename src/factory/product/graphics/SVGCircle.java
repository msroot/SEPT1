/*
 * SEPT Assignment 1
 * 
 * Author: John Kolovos
 * 
 */
package factory.product.graphics;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import factory.factory.IAbstractFactory;
import factory.product.properties.AbstractProperty;
import factory.product.properties.CircleProperty;

/**
 * The SVG circle
 * 
 * @author John Kolovos
 */
public class SVGCircle extends AbstractGraphic {

	public SVGCircle(AbstractProperty property) {
		super(property);
	}

	@Override
	public void draw(Graphics g) {

		if (getProperty().getType() != IAbstractFactory.ElementType.CIRCLE) {
			System.err.println("Property not of type circle! ERROR!");
			System.exit(0);
		}

		CircleProperty circleProp = (CircleProperty) getProperty();
		Graphics2D g2d = (Graphics2D) g;

		/* Caclulate everything for the circle here */
		int startX = (int) (circleProp.getCx() - circleProp.getR());
		int startY = (int) (circleProp.getCy() - circleProp.getR());
		int d = (int) (2 * circleProp.getR());

		java.awt.Color oldColor = g2d.getColor();
		java.awt.Stroke oldStroke = g2d.getStroke();

		/* Only fill the circle when fill is specified */
		if ( circleProp.getFill() != null ) {
			g2d.setColor(new java.awt.Color(circleProp.getFill().getR(), circleProp
				.getFill().getG(), circleProp.getFill().getB()));

			g.fillOval(startX, startY, d, d);
		}

		/* reset g2d to default values */
		g2d.setStroke(oldStroke);
		g2d.setColor(oldColor);

		/* Stroke was not specified, nothing is happening */
		if (circleProp.getStroke() != null) {
			if (circleProp.getStrokeWidth() > 0) {
				g2d.setColor(new java.awt.Color(circleProp.getStroke().getR(),
						circleProp.getStroke().getG(), circleProp.getStroke()
								.getB()));
				g2d.setStroke(new BasicStroke(circleProp.getStrokeWidth()));

				g2d.drawOval(startX, startY, d, d);
				/* reset g2d to default values */
				g2d.setStroke(oldStroke);
				g2d.setColor(oldColor);
			}
		}

	}

}
