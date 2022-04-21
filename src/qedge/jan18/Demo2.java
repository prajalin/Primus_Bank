package qedge.jan18;

public class Demo2 // class name
{
	//declaring static variables
	static int a,b,c;
	static double x,y,z;
	public static void multiplication()//static method
	{
		a=6767;
		b=76;
		c=a*b;
		System.out.println(c);
	}
	public static void floatingDivision()//static method
	{
		x=545656;
		y=76;
		z=x/y;
		System.out.println(z);
	}
	public void sub()// non static method
	{
		a=554;
		b=76;
		z=a-b;
		System.out.println(z);
	}
	
	

	public static void main(String[] args)// main method
	{
		// calling static method directly with class name
		Demo2.multiplication();
		Demo2.floatingDivision();
		//creating reference object to call non static method
		Demo2 obj = new Demo2();
		obj.sub();
		

	}

}
