import java.util.*;
import java.lang.*;
import java.io.*;

class G4G {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int n,i,j,k,l,tc;
		tc=in.nextInt();
		while(tc-->0)
		{
    		n=in.nextInt();
    		int arr[]=new int[n];
    		
    		for(i=0;i<n;i++)
    		{ 
    			arr[i]=in.nextInt();
    		//        xor=xor^arr[i];
    		}
    		int repeating=0,missing=0;
    		for(i=0;i<n;i++)
    		{
    			if(arr[Math.abs(arr[i])-1]<0)
    				repeating=Math.abs(arr[i]);
    			else	
    				arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
    		}
    		for(i=0;i<n;i++)
    			{
    				if(arr[i]>0)
    				{
    					missing=i+1;
    					break;
    				}
    			}
    		System.out.println(repeating+" "+missing);
    		
		}
	}
}
