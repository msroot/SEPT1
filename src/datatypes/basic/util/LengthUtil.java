/*
 * SEPT Assignment 1
 * 
 * Author: Stefan Fuchs
 * 
 */
package datatypes.basic.util;

import java.util.HashMap;

/**
 * Helper function to normalise units to pixels.
 * 
 * @author Stefan Fuchs
 */
public class LengthUtil {

	private HashMap<String, Float> lengthMap;

	/* Singleton */
	private static LengthUtil INSTANCE = null;

	private LengthUtil() {
		this.lengthMap = new HashMap<String, Float>();
		init();
	}

	/* Initialise all out mappings */
	private void init() {

		this.lengthMap.put("px", new Float(1f));
		this.lengthMap.put("pt", new Float(1.25f));
		this.lengthMap.put("pc", new Float(15f));
		this.lengthMap.put("mm", new Float(3.543307f));
		this.lengthMap.put("cm", new Float(35.43307f));
		this.lengthMap.put("in", new Float(90f));

		/* Assumption: font size of 10 */
		this.lengthMap.put("em", new Float(10f));
		/* Assumption: ex ~ 0.5 * ex */
		this.lengthMap.put("ex", new Float(this.lengthMap.get("em")
				.floatValue() * 0.5f));
	}

	/**
	 * Singleton accessor method
	 * 
	 * @return The Singleton instance
	 */
	public static LengthUtil instance() {
		if (INSTANCE == null) {
			INSTANCE = new LengthUtil();
		}
		return INSTANCE;
	}

	/**
	 * Map the type of unit to the corresponding normalisation
	 * 
	 * @param type
	 *            Name of the unit. If null, then this method defaults to px
	 * @return The normalisation value
	 */
	public float translate(String type) {
		// For now null or wrong input defaults to px
		Float retValue;
		if (lengthMap.containsKey(type)) {
			retValue = lengthMap.get(type);
		} else {
			retValue = lengthMap.get("px");
		}
		return retValue.floatValue();
	}
}
