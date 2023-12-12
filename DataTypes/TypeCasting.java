package DataTypes;

public class TypeCasting {
    public static void main(String[] args) {
        // type casting in java
        // explicit conversion
        byte b = 127;
        int a = 555;
        // b = a; // will not work
        a = b;

        b = (byte)a;
        // System.out.println(a);
        
        float val = 5.7f;
        int converted = (int)val;

        System.out.println(converted);
        System.out.println(b);
    }
}
