package qedge.jan18;

public class Class_array1 {

	public static void main(String[] args) {
		// store login data into array
		String login[][]= new String[4][2];
		login[0][0]= "admin1";//first row first column
		login[0][1]= "test1";//first row second column
		login[1][0]= "admin2";//second row first column
		login[1][1]= "test2";//second row second column
		login[2][0]= "admin3";//third row first column
		login[2][1]= "test3";//third row second column
		login[3][0]= "admin4";//fourth row first column
		login[3][1]= "test4";//fourth row second column
		System.out.println("row size is::"+login.length);
		System.out.println("column size in any row::"+login[1].length);
		System.out.println("=============================");
		//iterate all rows
		for(int i=0;i<login.length;++i)
		{
			//iterate all columns in each row
			for(int j=0;j<login[i].length;++j)
			{
				System.out.println(login[i][j]+ "\t");
			}
			System.out.println();
		}
		

	}

}
