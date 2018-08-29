import java.io.*;
public class Example_1 {
	public static void main(String[] args) throws IOException {
		int count=0;
		File f1=new File("C:\\Users\\Lavish\\eclipse-workspace_24_aug_2018\\FileHandling");
		
		String []s=f1.list();
		for(String s1:s)
		{
			count++;
			System.out.println(s1);
		}
		System.out.println(" total file and dir "+count);
		f1.createNewFile();
		
		
	}

}
