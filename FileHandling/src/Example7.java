import java.io.*;

public class Example7 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("fw1.txt");
		BufferedReader br=new BufferedReader(fr);
		String str=br.readLine();
		while(str !=null)
		{
			System.out.println(str);
			str=br.readLine();
		}
		br.close();
		
	}

}
