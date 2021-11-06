import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class Scratch {
	public static void main(String[] args)
	{ 
		Scanner scanner = new Scanner(System.in);
		try
		{
			FileWriter writer = new FileWriter("wisdom.txt");
			System.out.println("Enter wisdom pls :D");
			writer.append("\n"+scanner.nextLine());
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
