import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-->0){
		    int n = scanner.nextInt();
		    long count =0;
		    int[] arr = new int[n];
		    int[] brr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = scanner.nextInt();
		    }
		    
		    for(int i=0;i<n;i++){
		        brr[i] = scanner.nextInt();
		    }
		    Arrays.sort(arr);
		    Arrays.sort(brr);
		    int m = n;
		    int mx =0;
		    int cx =0;
		    int l =0;
		    int r =0;
		    while(l<n && r<n){
		        if(arr[l] < brr[r]){
		            cx++;
		            mx = Math.max(mx,cx);
		            l++;
		            
		        }
		        else{
		            cx--;
		            r++;
		        }
		    }
		    
		    System.out.println(mx);
		}

	}
}
