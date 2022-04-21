package qedge.jan18;

public class Demo {
	//global variables declaration
	int a,b,c;
	double x,y,z;
	public void addition()//non static method
	{
		a=4356;
		b=86;
		c=a+b;
		System.out.println(c);
	}
	public void division()//non static method
	{
		x=76765;
		y=97;
		z=x/y;
		System.out.println(z);
	}

	public static void main(String[] args) //main method
	{
		//creating reference object to call non static methods
		Demo obj = new Demo();
		obj.addition();
		obj.division();
		

	}

}
