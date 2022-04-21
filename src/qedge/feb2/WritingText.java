package qedge.feb2;

import java.io.*;

public class WritingText {

	public static void main(String[] args) throws Throwable {
		//create new file
	   File f = new File("c:\\mrng.txt");
	   FileWriter fw = new FileWriter(f);
	   BufferedWriter bw = new BufferedWriter(fw);
	   bw.write("hi guys");
	   bw.newLine();
	   bw.write("testing selenium");
	   bw.newLine();
	   bw.write("handling files in a system");
	   bw.flush();
	   bw.close();

	}

}
