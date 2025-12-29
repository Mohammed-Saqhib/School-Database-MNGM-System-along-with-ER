import java.util.Scanner;

class MarksException extends Exception {
    public String toString() {
        return("Marks Exception: Marks should be 40 or above in all subjects");
    }
}

class Student2 {
    String USN;
    String name;
    int m1,m2,m3;

    void avgMarks() {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter USN");
            USN=sc.nextLine();
            System.out.println("Enter name");
            name=sc.nextLine();
            System.out.println("enter marks of first paper");
            m1=sc.nextInt();
            System.out.println("enter marks of second paper");
            m2=sc.nextInt();
            System.out.println("enter marks of third paper");
            m3=sc.nextInt();
            
            if(m1<40 || m2<40 || m3<40)
                throw new MarksException();
            
            int avg=(m1+m2+m3)/3;
            System.out.println("Average marks:"+avg);
        }
        catch(MarksException e) {
            System.out.println("Exception caught"+e);
        }
    }
}

public class Lab9_Exception {
    public static void main(String[] args) {
        System.out.println("Student1");
        Student2 s1=new Student2();
        s1.avgMarks();
        System.out.println("Student2");
        Student2 s2=new Student2();
        s2.avgMarks();
    }
}
