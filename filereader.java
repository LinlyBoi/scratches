import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
class Scratch
{
public static void main(String[] args)
{
	try
	{
		FileReader reader = new FileReader("art.txt");
		int data = reader.read();
		while(data != -1)
		{
			System.out.print((char)data);
			data = reader.read();
		}
		reader.close();

	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e) {
		
		e.printStackTrace();
	}
}
}
