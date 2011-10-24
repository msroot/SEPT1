/*
 * SEPT Assignment 1
 * 
 * Author: Stefan Fuchs
 * 
 */
package application;

import java.awt.Graphics;

import javax.swing.JPanel;

import factory.product.graphics.AbstractGraphic;
import factory.product.properties.SVGProperty;

/**
 * The Panel to draw hte images on.
 * 
 * @author Stefan Fuchs
 */
public class SVGPanel extends JPanel {

	/* The root container for our svg image */
	private AbstractGraphic svgContainer = null;

	/**
	 * Getter for the current SVG container
	 * 
	 * @return The svgContainer
	 */
	public AbstractGraphic getSvgContainer() {
		return svgContainer;
	}

	/**
	 * Setter for the current SVG container
	 * 
	 * @param svgContainer
	 *            The svgContainer
	 */
	public void setSvgContainer(AbstractGraphic svgContainer) {
		this.svgContainer = svgContainer;
	}

	/**
	 * Constructor
	 */
	public SVGPanel() {
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		if (svgContainer != null) {
			setBounds(0, 0, (int) ((SVGProperty) svgContainer.getProperty())
					.getWidth(), (int) ((SVGProperty) svgContainer
					.getProperty()).getHeight());
			svgContainer.draw(g);
		}
	}

}
