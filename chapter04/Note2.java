package com.oracle.javacert.associate.chapter04;

public class Note2 {
	// private static Notes n1 = new Notes();
	// private static Notes n2 = new Notes();

	private Note2() {
		// TODO Auto-generated constructor stub
		System.out.println("ulaþtý aq");
	}

	/*
	 * void Note2(){ System.out.println("asdasd"); }
	 */

	/*
	 * { System.out.println(n1.length);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		// Note2 n = new Note2();
		// n.Note2();
		// n1.length = 2;
		// n2.length = 8;
		// System.out.println(n1.length);

		System.out.print(Note3.result + " ");
		new Note3();
		System.out.print(Note3.result + " ");
		new Note3();
		System.out.print(Note3.result + " ");

	}
}

class Note3 {
	static String result = "";
	{
		result += "2";
	}
	static {
		result += "1";
	}
	{
		result += "3";
	}
}
