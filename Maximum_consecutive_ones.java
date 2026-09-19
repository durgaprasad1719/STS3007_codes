


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int left=0;
		int no_of_zeros=0;
		int maxones=Integer.MIN_VALUE;
		for(int right=0;right<n;right++){
		    if(arr[right]==0){
		        no_of_zeros+=1;
		    }
		    while(no_of_zeros>1){  //in place of 1 we can replace with k , k is no of bits to flip given by user

		        if(arr[left]==0){
		            no_of_zeros-=1;
		         }
		        left+=1;
		    }
		    int length=right-left+1;
		    maxones=Math.max(maxones,length);
		  }
		 System.out.println(maxones);
	}
}
