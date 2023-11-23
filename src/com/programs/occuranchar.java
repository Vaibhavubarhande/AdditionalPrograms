package com.programs;

import java.util.HashMap;

public class occuranchar {

	public static void main(String[] args) {

		String s = "i love india";

		HashMap<Character, Integer> hm = new HashMap<>();
		
		s = s.replaceAll(" ", "");  //remove the space count

		for (int i = 0; i < s.length(); i++) {

			if (hm.containsKey(s.charAt(i))) {  

				int value = hm.get(s.charAt(i)) + 1;

				hm.put(s.charAt(i), value);

			} else {

				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println(hm);
	}
}
