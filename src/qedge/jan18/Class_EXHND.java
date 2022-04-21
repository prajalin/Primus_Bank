package qedge.jan18;

public class Class_EXHND {

	public static void main(String[] args) {
		// divide anything with zero
		try 
		{
			int x = 345, y = 0, z;
			z= x/y;
			System.out.println(z);
			
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
			t.printStackTrace();
		}finally {
			System.out.println("!oops i(finally) executed");
			}
		double a=43434,b=45,c;
		c=a/b;
		System.out.println(c);

	}

}
