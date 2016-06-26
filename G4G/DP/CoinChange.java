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
		    int coins[]=new int[n];
		    for(i=0;i<n;i++)
		        coins[i]=in.nextInt();
		    int cost=in.nextInt();
		    long dp[]=new long[cost+1];
		    dp[0]=1;
		    for(j=0;j<n;j++)
		    {
		        for(i=1;i<=cost;i++)
		        {
		            if(coins[j]<=i)
		                dp[i]+=dp[i-coins[j]];
		        }
		    }
		    
		    System.out.println(dp[cost]);    
		}
	}
}
