package com.exception;

public class RemoveWord {
	static void replace(String str, String s) {
		String replaceAll = str.replaceAll("Country", "India");
		System.out.println(replaceAll);
	}
	static void remove(String str, String s) {
		System.out.println(str);
		String[] words = str.split(" ");

		String nstr = " ";

		for (String string : words) {
			System.out.println(string);
			if (!string.equals(s)) {
				nstr = nstr+" "+string;
			}

		}
		System.out.println(nstr);

	}

	public static void main(String[] args) {
		RemoveWord rm = new RemoveWord();
		//rm.remove("I Love My Country", "My");
		RemoveWord.remove("I Love My Country", "My");
		RemoveWord.replace("I Love My Country", "India");
	}

}
