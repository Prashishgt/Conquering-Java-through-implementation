package src.Fundamentals;

public class arr {
    public static void main(StringManipulation[] args) {
        Student s1 = new Student();

        s1.setName("Ivey");
        s1.setAge(20);
        // System.out.println(s1.name);

        Student s2 = new Student();
        s2.setName("Subhu");
        s2.setAge(21);
        // System.out.println(s2.name);

        Student students[] = new Student[2];

        students[0] = s1;
        students[1] = s2;

        // for(int i = 0; i < students.length; i++){
        //     System.out.println(students[i].name + " :" + students[i].age);
        // }

       for (Student stud : students) {
        System.out.println(StringManipulation.format("%s : %d", stud.name, stud.age));
        }


        int num[] = new int[4];
        num[0] = 1;
        num[1] = 10;
        num[2] = 5;
        num[3] = 25;
 

        for(int n : num){
            System.out.println(n);
        }
    }
}

class Student {
    public int age;
    public StringManipulation name;

    public void setName(StringManipulation _name){
        this.name = _name;
    }

    public void setAge(int _age){
        this.age = _age;
    }
}