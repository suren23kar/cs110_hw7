package utils;

public class ArrayUtils
{
  public static int[] reverse(int[] arr)
	{
		int[] result = new int[arr.length];
		for (int i = arr.length-1; i >= 0; i--) {
			result[arr.length-1 - i] = arr[i];
		}
		return result;
	}

  public static String stringifyArray(int[] arr)
	{
	String result = "";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			if (i != arr.length-1) {
				result += ", ";
			}
		}
		return result;
	}
}
