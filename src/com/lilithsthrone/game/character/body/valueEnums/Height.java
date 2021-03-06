package com.lilithsthrone.game.character.body.valueEnums;

import com.lilithsthrone.utils.Colour;

/**
 * @since 0.1.86
 * @version 0.1.86
 * @author Innoxia
 */
public enum Height {

	/**4' to 5'*/
	ZERO_TINY("tiny", 122, 152, Colour.GENERIC_SIZE_ONE),
	
	/**5' to 5'6"*/
	ONE_SHORT("short", 152, 166, Colour.GENERIC_SIZE_TWO),

	/**5'6" to 6'*/
	TWO_AVERAGE("average height", 166, 183, Colour.GENERIC_SIZE_THREE),

	/**6' to 6'6"*/
	THREE_TALL("tall", 183, 198, Colour.GENERIC_SIZE_FOUR),

	/**6'6" to 7'*/
	FOUR_VERY_TALL("very tall", 198, 214, Colour.GENERIC_SIZE_FIVE),

	/**7' to 7'6"*/
	FIVE_ENORMOUS("towering", 214, 228, Colour.GENERIC_SIZE_SIX),

	/**7'6" to 9'"*/
	SIX_GIANT("gigantic", 228, 274, Colour.GENERIC_SIZE_SEVEN),

	/**9' to 12'*/
	SEVEN_COLOSSAL("colossal", 274, 366, Colour.GENERIC_SIZE_EIGHT);
	
	private int minimumValue, maximumValue;
	private String descriptor;
	private Colour colour;

	private Height(String descriptor, int minimumValue, int maximumValue, Colour colour) {
		this.descriptor = descriptor;
		this.minimumValue = minimumValue;
		this.maximumValue = maximumValue;
		this.colour = colour;
	}

	public int getMinimumValue() {
		return minimumValue;
	}

	public int getMaximumValue() {
		return maximumValue;
	}

	public int getMedianValue() {
		return minimumValue + (maximumValue - minimumValue) / 2;
	}

	public static Height getHeightFromInt(int inches) {
		for(Height cs : Height.values()) {
			if(inches>=cs.getMinimumValue() && inches<cs.getMaximumValue()) {
				return cs;
			}
		}
		return SEVEN_COLOSSAL;
	}
	
	public String getDescriptor() {
		return descriptor;
	}

	public Colour getColour() {
		return colour;
	}
}
