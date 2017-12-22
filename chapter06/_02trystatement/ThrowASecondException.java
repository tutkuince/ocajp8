package com.oracle.javacert.associate.chapter06._02trystatement;


public class ThrowASecondException {
	public static void main(String[] args) {
		ThrowASecondException tse = new ThrowASecondException();
		System.out.println(tse.exceptions());
	}
	
	@SuppressWarnings({ "finally", "null" })
	public String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before ";
				v.length();
				result += "after ";
			} catch (Exception e) {
				result += "catch ";
				throw new RuntimeException();
			}finally {
				result += "finally ";
				throw new Exception();
			}
		} catch (Exception e) {
			result += "done ";
		}
		
		return result;
	}
}
