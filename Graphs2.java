**
Name: Graphs
Description: Week 17 Ex 8 - Modifyed with switch loop
Created By:Jennifer Ryan
Created On:31/01/2018
*/

import java.util.Scanner;

public class Graphs2{
	public static void main(String[] args){

	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter Number: ");
	 int num1 = input.nextInt();

	 System.out.println("Enter Number: ");
	 int num2 = input.nextInt();

	 System.out.println("Enter Number: ");
	 int num3 = input.nextInt();

	 System.out.println("Enter Number: ");
	 int num4 = input.nextInt();

	 System.out.println("Enter Number: ");
	 int num5 = input.nextInt();

	int value = 0;

	for(int counter = 1; counter <= 5; counter++){
		switch(counter){
			case 1:
				value = num1;
				break;
			case 2:
				value = num2;
				break;
			case 3:
				value = num3;
				break;
			case 4:
				value = num4;
				break;
			case 5:
				value = num5;
				break;
			default:
				System.out.println("There is a Problem!!");
			}

			for(int j = 1; j<= value; j ++)
			System.out.print("*");

			System.out.println();
		}
	}
}
