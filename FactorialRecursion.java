package FactorialRecursion;

public class FactorialRecursion {
	
	public int CalculateFactorial(int Factorial)
	{
		if (Factorial == 1) return 1;
		return Factorial * CalculateFactorial(Factorial-1);
		
	}

}
