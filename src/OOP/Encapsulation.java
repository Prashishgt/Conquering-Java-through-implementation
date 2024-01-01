package src.OOP;

class Human {
    int age;
    private String name = "Ivey";

    public String getName(){
        return this.name;
    }

    public void setName(String _name){
        this.name = _name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj1 = new Human();
        obj1.age = 14;
        // obj1.name = "Ivey";

        // System.out.println(obj1.name);
        // System.out.println(obj1.age);
        obj1.setName("Prashish");
        System.out.println(obj1.getName());
    }
}