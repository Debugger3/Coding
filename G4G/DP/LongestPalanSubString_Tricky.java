import java.util.*;
import java.lang.*;
import java.io.*;
/*
 			many corner cases.. spent half day on it.



*/
class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int n,k,i,j,count=0,tc;
		
		tc=in.nextInt();
		while(tc-->0)
		{
		    String str=in.next();
		    int len=str.length();
		    boolean dp[][]=new boolean[len][len];
		    for(i=0;i<len;i++)
		      dp[i][i]=true;      
		    int end,max=1;
		    int start = 0;
		    for (i = 0; i < len-1; ++i)
		    {
		        if(str.charAt(i)==str.charAt(i+1))
		        {
		            dp[i][i+1] = true;
		            if(start==0)
		            {
		            start = i;
		            max = 2;
		            }
		        }
		    }
		    for(k=3;k<=len;k++)
		    {
		  		for(i=0;i<len-k+1;i++)
		  		{
		  			j=i+k-1;
		  			if(str.charAt(j)==str.charAt(i) && dp[i+1][j-1] )
		            	{
		            		
		            		dp[i][j]=dp[i+1][j-1];
		            		//System.out.println("same here "+i+"    "+j+"  and value "+k+" ~  "+max);
		            		if(k-start>max-start)
		            		{
		            			start = i;
                    			max = k;
		            		}
		            	}
		  		}
		  }
		  //System.out.println(str+" max "+max+"  start "+start);
		  System.out.println(str.substring(start,start+max));
		}
	}
}
