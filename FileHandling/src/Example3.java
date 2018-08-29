import java.io.*;
public class Example3 {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("fw.txt");
		fw.write(" hello");
		fw.write(" world ");
		fw.write(" java ");
		fw.write(" servlet");
		fw.write("\n");
		
		char []ch1= {'a','b','c'};
		fw.write(ch1);		
		
		fw.close();
		
	}

}
