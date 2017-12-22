package com.oracle.javacert.associate.chapter01javabuildingblocks._07initializationofvar;

// in scope from declaration to end of block

public class LocalVariables {
	@SuppressWarnings("unused")
	public void notValid(){
		int x = 10;
		int y;
		//int reply = x + y; // Does not compile // y might not have been initialized
	}
	
	public void valid(){
		int y = 10;
		int x; 		// x is declared here
		x = 5;		// and initialized here
		int reply = x + y;
		System.out.println(reply);
	}
	
	@SuppressWarnings("unused")
	public void findAnswer(boolean check){
		int answer;
		int onlyOneBranch;
		if(check){
			onlyOneBranch = 1;
			answer = 1;
		}else{
			answer = 2;
		}
		System.out.println(answer);
		// System.out.println(onlyOneBranch); Does not compile
	}
}
