package src.Fundamentals;

class Mobile {
    String brand;
    int price;
    // String network;
    static String name;

    public void show(){
        System.out.println("This is non static method");
    }
    // static methods
    public static void view(Mobile mob){
        System.out.println(mob.brand + " new phone. Starting at " + mob.price);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Mobile mob = new Mobile();
        mob.brand = "Apple";
        mob.price = 1000;
        
        // these above are called instance variable 
        // below is called static variable and shared among every instance and should be accessed using class itself
        Mobile.name = "iphone 10";

        // static method and like variable can be called from class itself
        // Mobile.view();

        // throws an error trying to access non static method using class
        // Mobile.show();

        // instance variable can be access by have to send object itself as a parameter
        Mobile.view(mob);

    }
}
