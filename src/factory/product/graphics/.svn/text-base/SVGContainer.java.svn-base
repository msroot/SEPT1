/*
 * SEPT Assignment 1
 * 
 * Author: Stefan fuchs
 * 
 */
package factory.product.graphics;

import java.awt.Graphics;
import java.util.ArrayList;

import factory.product.properties.AbstractProperty;

/**
 * This class would represent the Composite element in the Composite Pattern. In
 * our case this element can either be a group <g> or the <svg> element itself.
 * 
 * @author Stefan Fuchs
 * 
 */
public class SVGContainer extends AbstractGraphic {

	/* List that keeps the child elements */
	ArrayList<AbstractGraphic> childList;

	/**
	 * Constructor with the property element passed to it.
	 * 
	 * @param property
	 */
	public SVGContainer(AbstractProperty property) {
		super(property);
		childList = new ArrayList<AbstractGraphic>();
	}

	/**
	 * Print all child components.
	 */
	@Override
	public void draw(Graphics g) {
		for (AbstractGraphic graph : childList) {
			graph.draw(g);
		}
	}

	/**
	 * Add element to the collection of children.
	 */
	@Override
	public void add(AbstractGraphic graphic) {
		if (!childList.add(graphic)) {
			System.out.println("SVGContainer: add operation failed: "
					+ graphic.toString());
		}
	}

	/**
	 * Remove emelent from the collection of children.
	 */
	@Override
	public void remove(AbstractGraphic graphic) {
		if (!childList.remove(graphic)) {
			System.out.println("SVGContainer: remove operation failed: "
					+ graphic.toString());
		}
	}

	/**
	 * Returns the amount of children.
	 */
	@Override
	public int getChildCount() {
		return childList.size();
	}

	/**
	 * Return the child at given index
	 */
	@Override
	public AbstractGraphic getChild(int n) {
		return childList.get(n);
	}
}
