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
		    int lis[]=new int[n];
		    for(i=0;i<n;i++)
		        arr[i]=in.nextInt();
		    Arrays.fill(lis,1);      
		    for(i=1;i<n;i++)  
		    {
		        for(j=0;j<i;j++)
		        {
		        if(arr[j]<arr[i] && lis[i]<lis[j]+1)
		            lis[i]=lis[j]+1;
		        }
		    }
		    int max=0;
		    for(i=0;i<n;i++)  
		    {
		        if(max<lis[i])
		            max=lis[i];
		    }
		    System.out.println(max);
		}
	}
}
