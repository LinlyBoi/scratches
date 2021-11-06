class Scratch //name class sth else lol depending on usage
{
    public static void main(String[] args) {
        
    }
    public static class Constructor
    {
    String material;
    int height;
    double width;
    Constructor(String material, int height, double width) //name self-explanatory
    {
        this.material = material;
        this.height = height;
        this.width = width;
        void build();{
                        System.out.println("Building a house out of "+this.material + "that is " +this.height + " high and " + this.width + " wide" );
                    }
    }
 //they can also be overloaded! f
    }
}