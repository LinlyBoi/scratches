import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("What is your name? \n");
            name = scanner.nextLine();
        } while(name.isBlank());
        /* can do the same with while first and without do
        but that doesn't assure that the code runs at least once. */
        System.out.println("Hello "+name);
        //This is a for loop now
        for(int i=10;i>=1;) {
            System.out.println(i);
            i--;
        }
        System.out.println("no more numbers!"); //Is for limited amounts of times pOG
    }
}