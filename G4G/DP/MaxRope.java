import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int tc,k,n, i,j;
		tc=in.nextInt();
		while(tc-->0)
		{
		    n=in.nextInt();    
		    long dp[]=new long[n+1];
		    dp[0]=0;
		    dp[1]=1;
		    dp[2]=1;
		    long result=Long.MIN_VALUE;
		    for(i=3;i<=n;i++)
		    {
		        for(j=1;j<i;j++)
		        {
		        	
		            if(Math.max(dp[i-j],i-j)*j>result)
		                result=Math.max(dp[i-j],i-j)*j;
		            
		        }
		            dp[i]=result;
		    }
		    
		    System.out.println(dp[n]);    
		}
	}
}
