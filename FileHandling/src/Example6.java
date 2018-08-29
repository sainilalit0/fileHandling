import java.io.*;
public class Example6 {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("fw1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("97");
		bw.newLine();
		char ch[]= {'a','b','c'};
		bw.write(ch);
		bw.newLine();
		bw.write("java");
		bw.write(" software programmming");
		bw.flush();
		bw.close();
	}

}
