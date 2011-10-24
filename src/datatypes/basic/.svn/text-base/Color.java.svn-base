/*
 * SEPT Assignment 1
 * 
 * Author: Stefan Fuchs
 * 
 */
package datatypes.basic;

import datatypes.basic.util.ColorUtil;

/**
 * Basic class for the "Color" attribute
 * 
 * @author Stefan Fuchs
 */
public class Color {

	private int r;
	private int g;
	private int b;

	/**
	 * Constructor for supporting RGB value inputs
	 * 
	 * @param r
	 *            Red channel
	 * @param g
	 *            Green channel
	 * @param b
	 *            Blue Channel
	 */
	public Color(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public Color(String name) {
		int rgb[] = ColorUtil.instance().translate(name);
		this.r = rgb[0];
		this.g = rgb[1];
		this.b = rgb[2];
	}

	/**
	 * Accessor for the red channel
	 * 
	 * @return Value of the red channel
	 */
	public int getR() {
		return r;
	}

	/**
	 * Accessor of the green channel
	 * 
	 * @return Value of the green channel
	 */
	public int getG() {
		return g;
	}

	/**
	 * Accessor of the blue channel
	 * 
	 * @return Value of the blue channel
	 */
	public int getB() {
		return b;
	}
}