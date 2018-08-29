import java.io.CharArrayReader;
import java.io.IOException;
public class Example9 {
	public static void main(String[] args) throws IOException {
		char arr[]= {'a','b','c','d','e','f','g','h','i'};
		CharArrayReader  car=new CharArrayReader(arr);
		int k=0;
		// read  until end of the file 
		while((k = car.read()) != -1) 
		{
			char ch=(char)k;
			System.out.print(ch+" :");
			System.out.println(k);
		}
	}
}
