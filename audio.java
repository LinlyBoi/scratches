import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;
class Scratch
{
	public static void main(String[] args) throws UnsupportedAudioFileException,IOException, LineUnavailableException
	{
		Scanner scanner = new Scanner(System.in);
		File file = new File("JansiFart3.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		String response = "pog"; 
		while(!response.equals("Q")) 
		{
		System.out.println("P = play , S = stop , R = reset, Q = quit");
		System.out.print("Enter your choice:");
		response = scanner.next();
		response = response.toUpperCase();
		switch(response)
		{
			case ("P"): clip.start();
			break;
			case("S"): clip.stop();
			break;
			case("R"): clip.setMicrosecondPosition(0);
			case("Q"): clip.close(); 
			break;
			default: System.out.println("Not valid!");

	}
		clip.start();
}
}


}

