

import java.util.Scanner;
public class Main
{
    static void leaders(int n,int[]arr){
        int count=0;    //it helps to add elment into result array
		 int max=arr[n-1];
		 int result[]=new int[n];
		     result[count]=max;
		     count+=1;
		    
		 for(int i=n-2;i>=0;i--){
		     if (arr[i]>max){
		         result[count]=arr[i];
		         count+=1;
		         max=arr[i];
		     }

		 }
		 for(int i=count-1;i>=0;i--){
		     // count gives no of leaders , 
		     // so our loop should start from count-1  , if we  start from count we will get  error
		    System.out.println( result[i]);
		 }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		

		 int n=sc.nextInt(); 		 
		 int [] arr=new  int[n]; 

		 for(int i=0;i<n;i++){
		     arr[i]=sc.nextInt();
		 }
		 leaders(n,arr);
		

		 
	}
}
