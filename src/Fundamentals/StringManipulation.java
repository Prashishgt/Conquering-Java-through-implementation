package src.Fundamentals;

public class StringManipulation {
    public static void main(String[] args) {
        // System.out.println("Hello");
        // String name1 = "Prashish";
        // String name2 = "Prashish";

        // System.out.println(name1 == name2);
        // two types of string in jav
        StringBuffer sb = new StringBuffer("Ivey");

        sb.append(", is learning Java");
        System.out.println(sb.capacity());
        sb.setLength(50);
        System.out.println(sb.length());

    

    }
}
