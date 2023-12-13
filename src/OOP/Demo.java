package src.OOP;

public class Demo {
    public static void main(String args[]) {
        int num1 = 10, num2 = 20;

        // int result = num1 + num2;
        // System.out.println(result);
        Calculator calculator = new Calculator();
        int result = calculator.add(num1,num2);
        System.out.println(result);
    }
}

class Calculator {

    int x,y;

    public int add(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }
}
