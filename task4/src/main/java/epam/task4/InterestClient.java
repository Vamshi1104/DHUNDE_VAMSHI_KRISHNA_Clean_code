package epam.task4;

import java.util.Scanner;

public class InterestClient {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		double principle,rate,years;
		System.out.println("Enter principle:");
		principle=sc.nextDouble();
		System.out.println("Enter rate:");
		rate=sc.nextDouble();
		System.out.println("Enter time in years:");
		years=sc.nextInt();
		System.out.println("Enter the choice\n1.Simple Interest\n2.Compound Interest");
		choice=sc.nextInt();
		if(choice==1||choice==2)
		{
			System.out.println("The interest is:");
			InterestCalculator icobj=new InterestCalculator();
			if(choice==1)
				System.out.println(icobj.simpleInterestCalculator(principle, rate, years)+" Rupees");
			else
				System.out.println(icobj.compoundInterestCalculator(principle, rate, years)+" Rupees");
		}
		else
		{
			System.out.println("Invalid choice");
		}
		sc.close();
		
	}
}
