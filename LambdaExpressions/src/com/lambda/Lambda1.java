package com.lambda;

public class Lambda1 {

	public static void main(String[] args) {
		
		NumericTest isEven = (n) -> (n%2==0);
		System.out.println("Is 4 Number Even? "+isEven.test(4));
		
		NumericTest isOdd = (n) -> (n%2!=0);
		System.out.println("Is 4 Number Odd? "+isOdd.test(4));
	}

}
