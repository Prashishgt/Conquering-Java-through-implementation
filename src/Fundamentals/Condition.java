package src.Fundamentals;

public class Condition {
    public static void main(String[] args) {
        int x = 10;

        if (x >= 10) {
            System.out.println("Hello! proud that you made it this far");
        } else {
            System.out.println("Keep trying you are almost there");
        }

        // ternary operator
        int check = 8;
        String result = "";    

        result = check % 2 == 0 ? "even" : "odd";
        System.out.println(result);

    }   
}
