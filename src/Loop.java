package src;

public class Loop {
    public static void main(String[] args) {
        // for loop
        // do while and while

        // for (int i = 0; i <=10; i++) {
        //     System.out.println(i);
        // }
        
        int count = 1;
        boolean check = true;

        // while (check) {
        //     System.out.println(count);
        //     count++;

        //     if(count >= 10){
        //         check = false;
        //     }
        // }

        do {
            System.out.println("Hello " + count );
            count++;
            
        } while (count <= 10);

    }
}