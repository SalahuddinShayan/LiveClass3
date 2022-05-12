package assistedPracticeProjects;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String toString() {
		return "Your Request Has Been Denied As You Are Under Age";}
}

class OverAgeException extends Exception{
	public String toString() {
		return "Your Request Has Been Denied As You Are Over Age";}
}
public class CustomException2 {
	public static void main(String args[]) throws ArrayIndexOutOfBoundsException, UnderAgeException, OverAgeException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int a = sc.nextInt();
		if (a<18) {try {
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.toString());
			throw uae;}
		catch (UnderAgeException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		}
		else if(a>65) {try {
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.toString());
			throw oae;}
		catch (OverAgeException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		}
		else{
			System.out.println("Your Request Has Been Apporoved");
		}
	}
}


