package qedge.jan18;

public class Loopforeach {


	public static void main(String[] args)throws Throwable {
		// store integer values into array
		int x[]= {100,200,300,400,500,600,700,800};
		System.out.println(x[5]);
		for( int each : x)
		{
	Thread.sleep(1000);
			System.out.println(each);
		}

	}

}
