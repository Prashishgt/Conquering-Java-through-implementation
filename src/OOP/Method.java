package src.OOP;

class Computer {
    public String playMusic(){
        return "Playing music";
    }

    public int add(int x, int y){
        return x + y;
    }

    public int add(int x, int y, int z){
        return x + y +z;
    }
}

public class Method {
    public static void main(String[] args) {
        Computer computer = new Computer();

        String x = computer.playMusic();

        // method overloading
        int res = computer.add(5,5);
        int res3 = computer.add(5,5, 10);

        System.out.println(res);
        System.out.println(res3);
        System.out.println(x);
    }
}
