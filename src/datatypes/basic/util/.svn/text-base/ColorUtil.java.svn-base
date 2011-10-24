/*
 * SEPT Assignment 1
 * 
 * Author: John Kolovos
 * 
 */

package datatypes.basic.util;

import java.util.HashMap;

/**
 * Utility function to help translate colours passed as names to their RGB
 * representation.
 * 
 * @author John Kolovos
 */
public class ColorUtil {

	private HashMap<String, int[]> colorMap;

	/* Singleton Instance */
	private static ColorUtil INSTANCE = null;

	private ColorUtil() {
		this.colorMap = new HashMap<String, int[]>();
		init();
	}

	/**
	 * Initialise predefined colour names <colorMap> with RGB values
	 */
	private void init() {

		initColorMap("aliceblue", 240, 248, 255);
		initColorMap("antiquewhite", 250, 235, 215);
		initColorMap("aqua", 0, 255, 255);
		initColorMap("aquamarine", 127, 255, 212);
		initColorMap("azure", 240, 255, 255);
		initColorMap("beige", 245, 245, 220);
		initColorMap("bisque", 255, 228, 196);
		initColorMap("black", 0, 0, 0);
		initColorMap("blanchedalmond", 255, 235, 205);
		initColorMap("blue", 0, 0, 255);
		initColorMap("blueviolet", 138, 43, 226);
		initColorMap("brown", 165, 42, 42);
		initColorMap("burlywood", 222, 184, 135);
		initColorMap("cadetblue", 95, 158, 160);
		initColorMap("chartreuse", 127, 255, 0);
		initColorMap("chocolate", 210, 105, 30);
		initColorMap("coral", 255, 127, 80);
		initColorMap("cornflowerblue", 100, 149, 237);
		initColorMap("cornsilk", 255, 248, 220);
		initColorMap("crimson", 220, 20, 60);
		initColorMap("cyan", 0, 255, 255);
		initColorMap("darkblue", 0, 0, 139);
		initColorMap("darkcyan", 0, 139, 139);
		initColorMap("darkgoldenrod", 184, 134, 11);
		initColorMap("darkgray", 169, 169, 169);
		initColorMap("darkgreen", 0, 100, 0);
		initColorMap("darkgrey", 169, 169, 169);
		initColorMap("darkkhaki", 189, 183, 107);
		initColorMap("darkmagenta", 139, 0, 139);
		initColorMap("darkolivegreen", 85, 107, 47);
		initColorMap("darkorange", 255, 140, 0);
		initColorMap("darkorchid", 153, 50, 204);
		initColorMap("darkred", 139, 0, 0);
		initColorMap("darksalmon", 233, 150, 122);
		initColorMap("darkseagreen", 143, 188, 143);
		initColorMap("darkslateblue", 72, 61, 139);
		initColorMap("darkslategray", 47, 79, 79);
		initColorMap("darkslategrey", 47, 79, 79);
		initColorMap("darkturquoise", 0, 206, 209);
		initColorMap("darkviolet", 148, 0, 211);
		initColorMap("deeppink", 255, 20, 147);
		initColorMap("deepskyblue", 0, 191, 255);
		initColorMap("dimgray", 105, 105, 105);
		initColorMap("dimgrey", 105, 105, 105);
		initColorMap("dodgerblue", 30, 144, 255);
		initColorMap("firebrick", 178, 34, 34);
		initColorMap("floralwhite", 255, 250, 240);
		initColorMap("forestgreen", 34, 139, 34);
		initColorMap("fuchsia", 255, 0, 255);
		initColorMap("gainsboro", 220, 220, 220);
		initColorMap("ghostwhite", 248, 248, 255);
		initColorMap("gold", 255, 215, 0);
		initColorMap("goldenrod", 218, 165, 32);
		initColorMap("gray", 128, 128, 128);
		initColorMap("grey", 128, 128, 128);
		initColorMap("green", 0, 128, 0);
		initColorMap("greenyellow", 173, 255, 47);
		initColorMap("honeydew", 240, 255, 240);
		initColorMap("hotpink", 255, 105, 180);
		initColorMap("indianred", 205, 92, 92);
		initColorMap("indigo", 75, 0, 130);
		initColorMap("ivory", 255, 255, 240);
		initColorMap("khaki", 240, 230, 140);
		initColorMap("lavender", 230, 230, 250);
		initColorMap("lavenderblush", 255, 240, 245);
		initColorMap("lawngreen", 124, 252, 0);
		initColorMap("lemonchiffon", 255, 250, 205);
		initColorMap("lightblue", 173, 216, 230);
		initColorMap("lightcoral", 240, 128, 128);
		initColorMap("lightcyan", 224, 255, 255);
		initColorMap("lightgoldenrodyellow", 250, 250, 210);
		initColorMap("lightgray", 211, 211, 211);
		initColorMap("lightgreen", 144, 238, 144);
		initColorMap("lightgrey", 211, 211, 211);
		initColorMap("lightpink", 255, 182, 193);
		initColorMap("lightsalmon", 255, 160, 122);
		initColorMap("lightseagreen", 32, 178, 170);
		initColorMap("lightskyblue", 135, 206, 250);
		initColorMap("lightslategray", 119, 136, 153);
		initColorMap("lightslategrey", 119, 136, 153);
		initColorMap("lightsteelblue", 176, 196, 222);
		initColorMap("lightyellow", 255, 255, 224);
		initColorMap("lime", 0, 255, 0);
		initColorMap("limegreen", 50, 205, 50);
		initColorMap("linen", 250, 240, 230);
		initColorMap("magenta", 255, 0, 255);
		initColorMap("maroon", 128, 0, 0);
		initColorMap("mediumaquamarine", 102, 205, 170);
		initColorMap("mediumblue", 0, 0, 205);
		initColorMap("mediumorchid", 186, 85, 211);
		initColorMap("mediumpurple", 147, 112, 219);
		initColorMap("mediumseagreen", 60, 179, 113);
		initColorMap("mediumslateblue", 123, 104, 238);
		initColorMap("mediumspringgreen", 0, 250, 154);
		initColorMap("mediumturquoise", 72, 209, 204);
		initColorMap("mediumvioletred", 199, 21, 133);
		initColorMap("midnightblue", 25, 25, 112);
		initColorMap("mintcream", 245, 255, 250);
		initColorMap("mistyrose", 255, 228, 225);
		initColorMap("moccasin", 255, 228, 181);
		initColorMap("navajowhite", 255, 222, 173);
		initColorMap("navy", 0, 0, 128);
		initColorMap("oldlace", 253, 245, 230);
		initColorMap("olive", 128, 128, 0);
		initColorMap("olivedrab", 107, 142, 35);
		initColorMap("orange", 255, 165, 0);
		initColorMap("orangered", 255, 69, 0);
		initColorMap("orchid", 218, 112, 214);
		initColorMap("palegoldenrod", 238, 232, 170);
		initColorMap("palegreen", 152, 251, 152);
		initColorMap("paleturquoise", 175, 238, 238);
		initColorMap("palevioletred", 219, 112, 147);
		initColorMap("papayawhip", 255, 239, 213);
		initColorMap("peachpuff", 255, 218, 185);
		initColorMap("peru", 205, 133, 63);
		initColorMap("pink", 255, 192, 203);
		initColorMap("plum", 221, 160, 221);
		initColorMap("powderblue", 176, 224, 230);
		initColorMap("purple", 128, 0, 128);
		initColorMap("red", 255, 0, 0);
		initColorMap("rosybrown", 188, 143, 143);
		initColorMap("royalblue", 65, 105, 225);
		initColorMap("saddlebrown", 139, 69, 19);
		initColorMap("salmon", 250, 128, 114);
		initColorMap("sandybrown", 244, 164, 96);
		initColorMap("seagreen", 46, 139, 87);
		initColorMap("seashell", 255, 245, 238);
		initColorMap("sienna", 160, 82, 45);
		initColorMap("silver", 192, 192, 192);
		initColorMap("skyblue", 135, 206, 235);
		initColorMap("slateblue", 106, 90, 205);
		initColorMap("slategray", 112, 128, 144);
		initColorMap("slategrey", 112, 128, 144);
		initColorMap("snow", 255, 250, 250);
		initColorMap("springgreen", 0, 255, 127);
		initColorMap("steelblue", 70, 130, 180);
		initColorMap("tan", 210, 180, 140);
		initColorMap("teal", 0, 128, 128);
		initColorMap("thistle", 216, 191, 216);
		initColorMap("tomato", 255, 99, 71);
		initColorMap("turquoise", 64, 224, 208);
		initColorMap("violet", 238, 130, 238);
		initColorMap("wheat", 245, 222, 179);
		initColorMap("white", 255, 255, 255);
		initColorMap("whitesmoke", 245, 245, 245);
		initColorMap("yellow", 255, 255, 0);
		initColorMap("yellowgreen", 154, 205, 50);
	}

	/**
	 * Singleton accessor method
	 * 
	 * @return Singleton Instance of {@link ColorUtil}
	 */
	public static ColorUtil instance() {
		if (INSTANCE == null) {
			INSTANCE = new ColorUtil();
		}
		return INSTANCE;
	}

	/**
	 * Helper function to initialise colorMap colour-names and RGB values
	 * 
	 * @param name
	 *            The name of the colour
	 * @param r
	 *            Red channel
	 * @param g
	 *            Green channel
	 * @param b
	 *            Blue channel
	 */
	public void initColorMap(String name, int r, int g, int b) {
		colorMap.put(name, new int[] { r, g, b });

	}

	/**
	 * Translate name to colour. Default is black.
	 * 
	 * @return Integer RGB array
	 */
	public int[] translate(String name) {
		int retValue[];

		if (colorMap.containsKey(name)) {
			retValue = colorMap.get(name);
		} else {
			retValue = colorMap.get("black");
		}
		return retValue;
	}

	/**
	 * Function to determine if a colour is supported
	 * 
	 * @param name
	 *            Name of the colour
	 * @return true if colour is supported 
	 * 		   false if colour is not supported
	 */
	public boolean containsColor(String name) {
		return colorMap.containsKey(name);
	}
}
