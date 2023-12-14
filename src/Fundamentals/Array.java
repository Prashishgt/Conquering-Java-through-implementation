package src.Fundamentals;

public class Array {
    public static void main(String[] args) {
        int num[] = {4,5,6,7};
        // int num[] = new int[5];
        // above statement will assign num[] with value of zero
        
        for (int i = 0; i <= 3; i++){

            System.out.println(num[i]);
        }

        int multi[][] = new int[3][4];

        // jagged array [3][]
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                multi[i][j] = (int)  Math.random() * 100;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(multi[i][j] + " ");

            }
            System.out.println();
        }

    }
}
