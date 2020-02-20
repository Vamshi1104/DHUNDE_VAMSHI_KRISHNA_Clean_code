package epam.task4;

public class ConstructionCostCalculator {
	double costCalc(int standardlevel,float area)
	{
		int arr[]=new int[]{1200,1500,1800,2500};
		return arr[standardlevel-1]*area;
	}
}
