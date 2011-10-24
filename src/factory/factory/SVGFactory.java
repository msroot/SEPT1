/*
 * SEPT Assignment 1
 * 
 * Author: Stefan fuchs
 * 
 */
package factory.factory;

import factory.product.graphics.AbstractGraphic;
import factory.product.graphics.SVGCircle;
import factory.product.graphics.SVGContainer;
import factory.product.graphics.SVGLine;
import factory.product.graphics.SVGRectangle;
import factory.product.properties.AbstractProperty;
import factory.product.properties.CircleProperty;
import factory.product.properties.GProperty;
import factory.product.properties.LineProperty;
import factory.product.properties.RectangleProperty;
import factory.product.properties.SVGProperty;

/**
 * Implementation of the factory
 * 
 * @author Stefan Fuchs
 * 
 */
public class SVGFactory extends IAbstractFactory {

	/** protected constructor */
	protected SVGFactory() {
	}

	/**
	 * Method to get an instance of the factory
	 * 
	 * @return
	 */
	public static IAbstractFactory instance() {
		if (instance == null) {
			instance = new SVGFactory();
		}
		return instance;
	}

	@Override
	public AbstractProperty createProperty(ElementType type) {

		/* In case a wrong type is passes */
		if (!enumContains(type)) {
			System.out.println(type + " is not a valid type of shape!");
			System.exit(0);
		}

		AbstractProperty prop = null;

		/* Create appropriate Properties here */
		if (type == ElementType.RECTANGLE) {
			prop = new RectangleProperty();
		} else if (type == ElementType.CIRCLE) {
			prop = new CircleProperty();
		} else if (type == ElementType.LINE) {
			prop = new LineProperty();
		} else if (type == ElementType.CONTAINER_G) {
			prop = new GProperty();
		} else if (type == ElementType.CONTAINER_SVG) {
			prop = new SVGProperty();
		}

		return prop;
	}

	@Override
	public AbstractGraphic createElement(AbstractProperty property) {

		/* Check if property has an available type */
		if (!enumContains(property.getType())) {
			System.err
					.println("Property has wrong type: " + property.getType());
			System.exit(0);
		}

		AbstractGraphic graphic = null;

		if (property.getType() == ElementType.RECTANGLE) {
			graphic = new SVGRectangle(property);
		} else if (property.getType() == ElementType.CIRCLE) {
			graphic = new SVGCircle(property);
		} else if (property.getType() == ElementType.LINE) {
			graphic = new SVGLine(property);
		} else if (property.getType() == ElementType.CONTAINER_G) {
			graphic = new SVGContainer(property);
		} else if (property.getType() == ElementType.CONTAINER_SVG) {
			graphic = new SVGContainer(property);
		}
		return graphic;
	}

	/* Check if the type is contained in the enum */
	private boolean enumContains(ElementType type) {
		boolean retValue = false;
		for (ElementType el : ElementType.values()) {
			if (el == type) {
				retValue = true;
				break;
			}
		}
		return retValue;
	}

}
