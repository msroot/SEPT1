/*
 * SEPT Assignment 1
 * 
 * Author: John Kolovos
 * 
 */
package factory.product.properties;

import datatypes.basic.Color;
import datatypes.basic.Coordinate;
import datatypes.basic.Length;
import factory.factory.IAbstractFactory;

/**
 * <cicle> properties class implementation 
 * @author John Kolovos
 *
 */
public class CircleProperty extends AbstractProperty {

	/* Attributes to be implemented */
	
	private Coordinate cx = null;
	private Coordinate cy = null;
	private Length r = null;
	
	private Color fill = null;
	private Color stroke = null;
	private Length strokeWidth = null;
	
	/**
	 * Cicle Property Contractor
	 */
	public CircleProperty() {
		super(IAbstractFactory.ElementType.CIRCLE);
	}


	/**
	 * Set Cx
	 * @param pos
	 * @param unit
	 */
	public void setCx(float pos, String unit) {
		this.cx = new Coordinate(pos, unit);
		
	}
	/**
	 * get Cx in pixels
	 * @return
	 */
	public float  getCx() {
		return cx.getLength();
		
 	}
	
	/**
	 * Set Cy
	 * @param pos
	 * @param unit
	 */
	public void setCy(float pos, String unit) {
		this.cy = new Coordinate(pos, unit);
		
	}
	/**
	 * Get Cy in pixe
	 * @return
	 */
	public float getCy() {
		return cy.getLength();
	}
 

	
	/**
	 * Set r
	 * 
	 * @param length Length
	 * @param unit Unit of Length
	 */
	public void setR(float length, String unit) {
		this.r = new Length(length, unit);
	}
	
	/**
	 * Get r in pixels
	 * 
	 * @return width
	 */
	public float getR() {
		return r.getLength();
	}
	
	

	/**
	 * Set width of the stroke
	 * 
	 * @param width Width
	 * @param unit The unit of width
	 */
	public void setStrokeWidth(float width, String unit) {
		this.strokeWidth = new Length(width, unit);
	}
	
	/**
	 * Get width of the stroke
	 * 
	 * @return Width of stroke in pixels
	 */
	public float getStrokeWidth() {
		return strokeWidth.getLength();
	}
	
	/**
	 * Set the color with rgb values
	 * 
	 * @param r Red
	 * @param g Green
	 * @param b Blue
	 */
	public void setFill(int r, int g, int b) {
		this.fill = new Color(r, g, b);
	}
	
	/**
	 * Set color with name.
	 * @param name Name of a color according to the Specification.
	 * 		If <code>null</code> or another color that is not specified,
	 * 		then the color defaults to black.
	 */
	public void setFill( String name ) {
		if ( name == null ) {
			this.fill = null;
		} else {
			this.fill = new Color(name);
		}
	}
	
	/**
	 * Get the fill attribute
	 * 
	 * @return The color
	 */
	public Color getFill() {
		return fill;
	}
	
	/**
	 * Set the color with rgb values
	 * 
	 * @param r Red
	 * @param g Green
	 * @param b Blue
	 */
	public void setStroke(int r, int g, int b) {
		this.stroke = new Color(r, g, b);
	}
	
	/**
	 * Set color with name.
	 * @param name Name of a color according to the Specification.
	 * 		If <code>null</code> or another color that is not specified,
	 * 		then the color defaults to black.
	 */
	public void setStroke( String name ) {
		if ( name == null ) {
			this.stroke = null;
		} else {
			this.stroke = new Color(name);
		}
	}
	
	/**
	 * Get the fill attribute
	 * 
	 * @return The color
	 */
	public Color getStroke() {
		return stroke;
	}

}
