public class Order {
    //@ instance fields
    private int firstInstanceField = getFirstInstanceMethod();
    private double secondInstanceField = getSecondInstanceMethod();

    //1 static field
    private static int staticField = getStaticField();

    //Instance methods
    public int getFirstInstanceMethod(){
        System.out.println("4- First instance method");
        return 20;
    }

    public double getSecondInstanceMethod(){
        System.out.println("5- Second instance method");
        return 10.1;
    }

    //2 static methods

    public static int getStaticField(){
        System.out.println("1- First static method");
        return 30;
    }
    public static void secondStaticField(){
        System.out.println("1- Second static field");
    }

    //2 instance initialization block
    {
        System.out.println("6- First instance initialization block");
    }
    {
        System.out.println("7- Second instance initialization block");
    }

    //2 static initialization block
    static
    {
        System.out.println("2- First static initialization block");
    }
    static
    {
        System.out.println("3- Second static initialization block");
    }

    //2 Constructors
    public Order(){
        System.out.println("8- First constructor");
    }
    public Order(int firstInstanceField, double secondInstanceField){
        System.out.println("9- Second constructor");
        this.firstInstanceField=firstInstanceField;
        this.secondInstanceField=secondInstanceField;
    }


}
