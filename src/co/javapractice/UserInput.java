package co.javapractice;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printText();
		System.out.println(StaticVariables.myName);
		
	}
	
	public static String printText(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a String");
		String enteredLine = reader.nextLine();
		System.out.println(enteredLine);
		return enteredLine;
	}

}
