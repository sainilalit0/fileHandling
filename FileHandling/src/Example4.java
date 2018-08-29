import java.io.*;

public class Example4 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("fw.txt");
		int i=fr.read();
		while(i!= -1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
	}

}
