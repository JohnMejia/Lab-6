package MainPackage;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args)
	{
		int num1;
		int num2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 2 numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.printf("Hello, you entered %d and %d.", num1, num2);

	}

}
