package com.programs;

public class CapitaliseletterFirst {

	public static void main(String[] args) {

		String line = "i love india";

		char[] charArray = line.toCharArray();

		boolean foundSpace = true;

		for (int i = 0; i < charArray.length; i++) {

			if (Character.isLetter(charArray[i])) {

				if (foundSpace) {

					charArray[i] = Character.toUpperCase(charArray[i]);
					foundSpace = false;
				}
			} else {
				foundSpace = true;
			}
		}
		line = String.valueOf(charArray);
		System.out.println(line);
	}
}
