import java.util.Scanner;

class TryCatch
{
    public static void main(String[] args) {
        //lets divide by 0 LOL
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to divide:");
            int x = scanner.nextInt();

            System.out.println("Enter a number to divide by:");
            int y = scanner.nextInt();
            int z = x/y;
        }
        catch(ArithmeticException e)
        {
            System.out.println("1 over zero equals infinity -Ggsya");
        }
    }
}