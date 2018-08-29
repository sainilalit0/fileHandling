import java.io.File;
import java.io.IOException;

public class Example2 {
	public static void main(String[] args) throws IOException {
		int count=0;
		File f1=new File("C:\\Users\\Lavish\\eclipse-workspace_24_aug_2018\\FileHandling");
		
		String []s=f1.list();
		for(String s1:s)
		{
			File f2=new File(f1,s1);
			if(f2.isFile())
			{
				count++;
				System.out.println(s1);
			}
		}
		System.out.println(" total file  "+count);
		
		
		
	}

}
