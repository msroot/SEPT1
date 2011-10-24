/*
 * SEPT Assignment 1
 * 
 * Author: Rohit
 * 
 */
package factory.product.properties;

import datatypes.basic.Color;
import datatypes.basic.Coordinate;
import datatypes.basic.Length;
import factory.factory.IAbstractFactory;

public class LineProperty extends AbstractProperty {

	private Coordinate x1 = null;
	private Coordinate x2 = null;
	private Coordinate y1 = null;
	private Coordinate y2 = null;
	
	private Color stroke = null;
	private Length strokewidth = null;
	
	
	public LineProperty() {
		super(IAbstractFactory.ElementType.LINE);
	}
	
	
	/* Set x1*/
	
	public void setX1(float pos, String unit) {
		this.x1 = new Coordinate(pos, unit);
	}
	
	/* Get x1*/
	
	public float getX1() {
		return x1.getLength();
	}
	
	/* Set y1 */
	public void setY1(float pos, String unit) {
		this.y1 = new Coordinate(pos, unit);
	}
	
	/* Get y1 */
	public float getY1() {
		return y1.getLength();
	}
	
	
	/* Set x2 */
	
	public void setX2(float pos, String unit) {
		this.x2 = new Coordinate(pos, unit);
	}
	
	/* Get x2 */
	
	public float getX2() {
		return x2.getLength();
	}
	
	/* Set y2 */
	public void setY2(float pos, String unit) {
		this.y2 = new Coordinate(pos, unit);
	}
	
	/* Get y2 */
	public float getY2() {
		return y2.getLength();
	}
	
	/* Set stroke size */
	public void setStrokeWidth(float width, String unit) {
		this.strokewidth = new Length(width, unit);
	}
	
	/* Get stroke size */
	public float getStrokeWidth() {
		return strokewidth.getLength();
	}
	
	/* Set stoke color with rgb color */
	public void setStroke(int r, int g, int b) {
		this.stroke = new Color(r, g, b);
	}
	
	/* Set stroke color with name */
	public void setStroke( String name ) {
		if ( name == null ) {
			this.stroke = null;
		} else {
			this.stroke = new Color(name);
		}
	}
	
	/* Get the color of stroke */
	public Color getStroke() {
		return stroke;
	}
	
}
