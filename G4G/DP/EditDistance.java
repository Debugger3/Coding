import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
				Scanner in=new Scanner(System.in);
		int tc,i,j,k,n,m;
		tc=in.nextInt();
		while(tc-->0)
		{
		    n=in.nextInt();
		    m=in.nextInt();
		    String str1=in.next();
		    String str2=in.next();
		    char ch1[]=str1.toCharArray();
		    char ch2[]=str2.toCharArray();
		    int cal[][]=new int[n+1][m+1];
		    for(i=0;i<=n;i++)
		    {
		        for(j=0;j<=m;j++)
		        {
		            if(i==0 && j==0)
		                cal[i][j]=0;
		            else if(i==0)      
		                cal[i][j]=j;
		            else if(j==0)      
		                cal[i][j]=i;
		            else if(ch1[i-1]==ch2[j-1])
		                cal[i][j]=cal[i-1][j-1];
		            else
		            {
		                cal[i][j]=Math.min(Math.min(cal[i-1][j-1],cal[i][j-1]),cal[i-1][j])+1;
		            }
		        }
		    }
		    System.out.println(cal[n][m]);
		}
	}
}
