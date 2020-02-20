package epam.task4;

import java.util.Scanner;

public class ConstructionClient {
public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float area;
		int standardchoice;
		System.out.println("Enter the area in square feet:");
		area=sc.nextFloat();
		System.out.println("Enter the material standard choice:\n1.Standard\n2.Above standard\n3.High standard\n"
							+ "4.High standard and fully automated home");
		standardchoice=sc.nextInt();
		if(standardchoice>0&&standardchoice<=4)
		{
			ConstructionCostCalculator cobj=new ConstructionCostCalculator();
			System.out.println("The construction cost is:"+cobj.costCalc(standardchoice, area)+" Rupees");
		}
		else
		{
			System.out.println("Invalid Choice");
		}
		sc.close();
		
	}
}
