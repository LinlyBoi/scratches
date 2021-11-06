import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        //Loop in loops
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol;
        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("enter symbol");
        symbol = scanner.next();
        for(int i =1;i<=rows;i++)
        {
            System.out.println(); //moves us to next line each time to signify rows

            for(int j =1;j<=columns;j++)
            {
                System.out.print(symbol); //prints symbol = to columns number

            }


            }

        }
    }
}