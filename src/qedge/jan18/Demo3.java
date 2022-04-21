package qedge.jan18;

public class Demo3 // class name
{
	public static void addition(int x,int y)
	{
		int z= x+y;
		System.out.println("addition is::"+ z);
	}
	public static String verifyStrings(String str1, String str2)
	{
		String res="";
		if(str1.equals(str2))
		{
			res="strings are equal";
		}else
		{
			res="strings are not equal";
		}
		return res;
	}
	public static boolean compareValues(int a, int b)
	{
		if(a==b)
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	

	public static void main(String[] args) 
	{
		//calling void type method by class name
		Demo3.addition(6, 9);
		//calling return type method by class name
		String result = Demo3.verifyStrings("hello", "india");
		System.out.println(result);
		boolean result1 = Demo3.compareValues(100, 200);//passing values
		System.out.println(result1);
		
	

	}

}
