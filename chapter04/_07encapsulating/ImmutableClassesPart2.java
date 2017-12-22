package com.oracle.javacert.associate.chapter04._07encapsulating;

public class ImmutableClassesPart2 {
	private StringBuilder builder;

	public ImmutableClassesPart2(StringBuilder b) {
		// builder = b;
		builder = new StringBuilder(b);
	}

	public StringBuilder getBuilder() {
		// return builder;
		return new StringBuilder(builder);
	}
	
	public String getValue() {
		return builder.toString();
	}

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("intial");
		ImmutableClassesPart2 ic = new ImmutableClassesPart2(sb);
		sb.append(" added");
		StringBuilder gotBuilder = ic.getBuilder();
		gotBuilder.append(" more");
		System.out.println(ic.getValue());
	}
}
