import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int n,i,j,k,l;
		int tc;
		tc=in.nextInt();
		while(tc-->0)
		{
    		n=in.nextInt();
    		int arr[]=new int[n];
    		for(i=0;i<n;i++)
    		    arr[i]=in.nextInt();
    		//int max=arr[0];
    		int max=Integer.MIN_VALUE;
    		int min=Integer.MIN_VALUE;
    		int currSum=0;
    		int count=0;
    		for(i=0;i<n;i++)
    		{
    		    if(currSum+arr[i]>0)
    		        currSum=currSum+arr[i];
    		    else  currSum=0;
    		    //System.out.println(" curr sum "+currSum+"   "+i);
    		    if(arr[i]<0)
    		    	count++;
    		    min=Math.max(arr[i],min);
    		    if(currSum>max)
    		        max=currSum;
    		}
    		if(count==n)
    		System.out.println(min);
    		else
    		System.out.println(max);
		}
	}
}
