
import java.util.*;

class main{
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);
        double val1=sc.nextDouble();
        double val2=sc.nextDouble();
        char  op= sc.next().charAt(0);
        double result=0;
        switch(op){
            case '+':
                 result=val1+val2;
                 break;
            case'-':
                  result=val1-val2;
                  break;
            default:
            System.out.println("do other operators by your own");
            return;
        }
        System.out.println(result);
    
    }
}
