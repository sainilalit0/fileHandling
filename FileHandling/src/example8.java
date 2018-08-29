import java.io.*;
public class example8 {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("fw2.txt");
		PrintWriter pw=new PrintWriter(fw);
		fw.write(100);//d
		fw.write('\n');
		pw.println(100);//100
		
		char ch[]= {'a','b','c'};
		pw.println(ch);
		pw.println("hello");
		pw.flush();
		fw.flush();
		pw.close();
		fw.close();
			
	}
}
