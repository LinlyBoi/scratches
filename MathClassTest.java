import java.util.ArrayList;

class Scratch {
    public static void main(String[] args) {
         //double x = 10;
         //double y = 20;
         //double z = x+y;

         // Array
         String[] noobs = {"Ggsleeb", "Glabnab", "Galanbees","Gegelfar","Gighalara"};
            System.out.println("The element is " +noobs[0]); //start from 0 :D

        //Print Array with foreach
        for (String x : noobs)
        {
            System.out.println(x);
        }

        //2D arrays POG
        String[] [] noobs2 = new String [3][3];
        noobs2[0][0]= "Roosya";
        noobs2[0][1]= "GGsya";
        noobs2[0][2]= "Glabnab";
        noobs2[1][0]= "KhaledHn1";
        noobs2[1][1]= "Embty";
        noobs2[1][2]= "Noob";

        //print 2D array with for loop :D

        for(int i=0;i<noobs2.length;i++)
        {
            System.out.println();
            for(int j=0; j< noobs2[i].length;j++)
            {
                System.out.print(noobs2[i][j]+" ");
            }

            //can also define 2D array like this

            String[][] idots = {
                                {"ex1","ex2","ex3"},
                                {"ex4","ex5","ex6"},
                                {"ex7","ex8","ex9"}
                             };
            //ArrayLists! They need not primitive data types
            ArrayList<String> food = new ArrayList<String>();

            food.add("Pasta");
            food.add("Pizza");
            food.add("Rice");

            //print with for statement yes

            for(int y=0;y<food.size();y++){
                System.out.println(food.get(y));

            }
            //ArrayList.set(Position,"element") , ArrayList.clear exist too :D
        }

    }
}