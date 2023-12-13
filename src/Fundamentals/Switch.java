package src.Fundamentals;

public class Switch {
    public static void main(String[] args) {
        int n = 4;

        // old switch statement
        
        switch (n) {
            case 1:
                System.out.println("Sunday");
                break;
        
            case 2:
                System.out.println("Monday");
                break;
        
            case 3:
                System.out.println("Tuesday");
                break;
        
            case 4:
                System.out.println("Wednesday");
                break;
        
            case 5:
                System.out.println("Thursday");
                break;
        
            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;
        
            default:
                System.out.println("Enter a valid number");
                break;
        }

        // new switch 
        String day = "noon";
        
        switch(day){
            case "morning", "afternoon" ->  System.out.println("10am");
            case "noon" -> System.out.println("3pm");
            default -> System.out.println("Night");           
        }
    }
}
