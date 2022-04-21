package qedge.jan18;

import java.util.ArrayList;

public class Class_array2 {

	public static void main(String[] args)throws Throwable {
		// store string type data using ArrayList
		ArrayList<String> str = new ArrayList<String>();
		str.add("sun");
		str.add("mon");
		str.add("tue");
		str.add("wed");
		str.add("thu");
		str.add("fri");
		str.add("sat");
		System.out.println(str.get(2));
		System.out.println("=================");
		for(String each : str)
		{
			Thread.sleep(1000);
			System.out.println(each);
		}
				

	}

}
