interface PI2
{
    default void show()
    {
        System.out.println("Default PI2");
    }
}
interface PI1
{
    // default method
    default void show()
    {
        System.out.println("Default PI1");
    }
}

class Multiple_Inher_Sid implements PI1, PI2
{
    // Overriding default show method 
    public void show()
    {
        // use super keyword to call the show 
        // method of PI1 interface 
        PI1.super.show();

        // use super keyword to call the show 
        // method of PI2 interface 
        PI2.super.show();
    }

    public static void main(String args[])
    {
        Multiple_Inher_Sid d = new Multiple_Inher_Sid();
        d.show();
    }
} 