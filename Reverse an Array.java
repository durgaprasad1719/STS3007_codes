import java.util.*;
public class Main
{
    static int[] reverse (int n,int []arr){
        int start=0; 
        int end=n-1;
        while(start<end){
            int temp=arr[start];
            
            arr[start]=arr[end];
            arr[end]=temp;
            start+=1;
            end-=1;
            
        }
        return arr;
        
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt(); // size of the Array
	int [] arr=new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	reverse(n,arr);
	System.out.println(Arrays.toString(arr));
	}
}
