package src;

public class Operators {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 4;
        
        int sum = num1 + num2;
        int sub = num1 + num2;
        int div = num1 / num2;
        int multi = num1 * num2;
        int mod = num1 % num2;

        // num1 = num1 + 2; // num +=2;, num *=4;
        // num1++;  num1 = num1 + 1; num1--; num1 = num1 - 1
        //  ++num1;

        int result = num1++; //first fetch and update 
        int result1 = ++num1; //first increment and fetch the value 


        System.out.println(result);

        // System.out.println(sum);
        // System.out.println(sub);
        // System.out.println(div);
        // System.out.println(multi);
        // System.out.println(mod);
    }
}
