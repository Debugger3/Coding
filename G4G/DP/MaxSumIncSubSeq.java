import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int tc,i,j,k,n;
		tc=in.nextInt();
		while(tc-->0)
		{
		    n=in.nextInt();    
		    int arr[]=new int[n];
		    for(i=0;i<n;i++)
		        arr[i]=in.nextInt();
		    int sum[]=new int[n];
		    sum[0]=arr[0];
		    for(i=1;i<n;i++)
		    {
		        sum[i]=arr[i];
		        for(j=0;j<i;j++)
		        {
		            if(arr[j]<arr[i] && sum[i]<sum[j]+arr[i])
		                sum[i]=sum[j]+arr[i];
		        }
		    }
		    int max=0;
		    for(i=0;i<n;i++)
		    {
		        if(max<sum[i])
		            max=sum[i];
		    }
		    System.out.println(max);
		}
	}
}
