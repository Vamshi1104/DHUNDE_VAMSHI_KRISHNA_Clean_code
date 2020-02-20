package epam.task4;

public class InterestCalculator {
	double simpleInterestCalculator(double principle,double rate,double time)
	{
		return (principle*rate*time)/100;
	}
	double compoundInterestCalculator(double principle,double rate,double time)
	{
		return principle * Math.pow(1.0+rate/100.0,time) - principle;
	}
}
