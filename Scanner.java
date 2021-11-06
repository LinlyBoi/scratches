import java.util.Scanner;

class Scratch {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println(name +" what? ");
        String lastname = scanner.nextLine();
        System.out.println("That's a made up name!");
    }
}