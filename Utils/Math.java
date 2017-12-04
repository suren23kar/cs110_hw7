package utils;

public class Math
{
	public static long factorial(int num)
	{
		if (num <= 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}

	public static long factorialLoop(int num)
	{
		long result = 1;
		for (int i = num; i >= 1; i--) {
			result *= i;
		}
		return result;
	}
}
