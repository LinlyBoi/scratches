import java.io.File;
class Scratch {
	public static void main(String[] args)
	{
		File file = new File("ggsleeb_wisdom.txt");
			if(file.exists())
			{
				System.out.println("File exists O:");
				System.out.println(file.getPath());
				System.out.println(file.getAbsolutePath());
			}
		
	}
}

