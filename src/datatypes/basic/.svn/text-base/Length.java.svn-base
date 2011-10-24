/*
 * SEPT Assignment 1
 * 
 * Author: Stefan Fuchs
 * 
 */
package datatypes.basic;

import datatypes.basic.util.LengthUtil;

/**
 * Basic class for the "Length" attribute
 * 
 * @author Stefan Fuchs
 */
public class Length {

	private float length;
	
	/**
	 * Constructor
	 * 
	 * @param length In specified unit
	 * @param unit The unit
	 */
	public Length( float length, String unit ) {
		this.length = length * LengthUtil.instance().translate(unit);
	}
	
	/**
	 * Accessor for the length in pixels
	 * 
	 * @return The length in pixels
	 */
	public float getLength() {
		return length;
	}
}
