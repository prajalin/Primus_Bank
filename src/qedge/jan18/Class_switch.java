package qedge.jan18;

import java.util.Scanner;

public class Class_switch {

	public static void main(String[] args) {
		// checking course in qedge dyanamically
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=6;i++)
		{
			System.out.println("Enter your course");
			String course = s.next();
			switch(course.toUpperCase())
			{
			case "SELENIUM":
				System.out.println("course is present"+ course);
				break;
			case "MANUALTESTING":
				System.out.println("course is present"+ course);
				break;
			case "JAVA":
				System.out.println("course is present"+ course);
				break;
			case "QTP":
				System.out.println("course is present"+ course);
				break;
				default:
					System.out.println("course is not present"+ course);
					break;
			}
		}

	}

}
