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
		clip.start();
		scanner.next();
	}
}




