class Scratch {
    public static void main(String[] args) {
        // methods..functions but associated with objects?
        int x = 3;
        int y = 4;
        int z = 5;
        int result = sum(x,y); //both result(s) are local variables :D

        System.out.println(result);
    }

    static int sum(int a,int b)

    {
        int result = a + b;
        System.out.println("This adds only 2 values!");
        return result; // return x+y; works too
    }
    //time to overload it!
    static int sum(int a,int b,int c)
    {
        System.out.println("This adds THREE values!");
        return a + b + c;
    }
    /* same method name but different signature
    * Signatures are method name + method parameters(Number,Data type etc) */





}
