package GroupProject01;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);	
		System.out.println("Please enter a number.");
		int num=scan.nextInt();		
		boolean prime = true;
		
		for (int i=2; i<num; i++) {
			if (num%i==0) {
				prime = false;
				break;
			}	
		}
		if (prime==true) {
	      System.out.println(num + " is a prime number.");
		}else {
	      System.out.println(num + " is not a prime number.");
	    }

	}

}
