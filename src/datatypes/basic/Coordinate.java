/*
 * SEPT Assignment 1
 * 
 * Author: Stefan Fuchs
 * 
 */
package datatypes.basic;

/**
 * Basic class for the "Coordinate" attribute
 * 
 * @author Stefan Fuchs
 */
public class Coordinate {

	private Length length;

	/**
	 * Constructor
	 * 
	 * @param length
	 *            Length in unit
	 * @param unit
	 *            The unit
	 */
	public Coordinate(float length, String unit) {
		this.length = new Length(length, unit);
	}

	/**
	 * Accessor for length
	 * 
	 * @return Length in pixels
	 */
	public float getLength() {
		return length.getLength();
	}

}
