package qedge.jan18;

public class Elseif {

	public static void main(String[] args) {
		// verify given marks as grades
		int marks=45;
		if(marks>=40)
		{
			System.out.println("grade-A");
			
		}else if(marks>=30)
		{
			System.out.println("grade-B");
		}else if(marks>=20)
		{
			System.out.println("grade-C");
		}else
		{
			System.out.println("fail");
		}

	}

}
