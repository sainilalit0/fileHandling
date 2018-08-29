import java.io.*;
public class example5 {
	public static void main(String[] args) throws IOException {
		File f1=new File("fw.txt");
		char []ch=new char[(int)f1.length()];
		FileReader fr=new  FileReader(f1);
		fr.read(ch);
		for(char ch1:ch)
		{
			System.out.print(ch1);
		}
	}
}
