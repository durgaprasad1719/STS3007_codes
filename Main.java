// // You are using Java
// A company wants to store employee information. Write a Java program to accept and display:
// - Employee name (String)
// - Employee ID (int)
// - Monthly salary (double)
// - Experience in years (float)
// -gender (M oor F)
import java.util.*;
class Main{
    public static void main (String [] args ){
        System.out.println("hello");
        Scanner sc=new Scanner(System.in);
        String Name=sc.nextLine();
        int  id=sc.nextInt();
        double  salary=sc.nextDouble();
        float Experience =sc.nextFloat();
        char gender =sc.next().charAt(0);
        System.out.println("my name is :"+ Name);
        System.out.println("my employee id:"+id);
        System.out.println("my monthly salary"+salary);
        System.out.println("my Experience is:"+Experience);
        System.out.println("my gender:"+gender);
        
    }
}