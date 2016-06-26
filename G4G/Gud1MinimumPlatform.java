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
		    int dept[]=new int[n];
		    for(i=0;i<n;i++)
		        arr[i]=in.nextInt();
		    for(i=0;i<n;i++)
		        dept[i]=in.nextInt();       
		  Arrays.sort(arr);
		  Arrays.sort(dept);
		   int plat_needed = 1, result = 1;
		  int currPtr=0;
		  i=1;
		  while(i<n && currPtr<n)
		  {
		      if(arr[i]<dept[currPtr])
		      {  
		          plat_needed++;
		            i++;
		      }
		       else
		      {
		          currPtr++;
		          plat_needed--;
		      }
		      if(result<plat_needed)
		        result=plat_needed;
		  }
		  System.out.println(result);
		}
	}
}
