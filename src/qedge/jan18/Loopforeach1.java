package qedge.jan18;

public class Loopforeach1 {

	public static void main(String[] args)throws Throwable {
		// store string type data into array
		String week[]= {"mon","tue","wed","thu","fri","sat","sun"};
		System.out.println(week[3]);
		System.out.println("..............");
		for(String each: week)
		{
			Thread.sleep(1000);
			System.out.println(each);
		}
		
				
		

	}

}
