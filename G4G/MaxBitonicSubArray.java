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
		    int dis[]=new int[n];
		    for(i=0;i<n;i++)
		        arr[i]=in.nextInt();
		    lis[0]=1;
		    dis[n-1]=1;
		    Arrays.fill(lis,1);
		    Arrays.fill(dis,1);
		    for(i=1;i<n;i++)
		    {
		        if(arr[i-1]<arr[i] && lis[i]<lis[i-1]+1)
		            lis[i]=1+lis[i-1];
		    }
		    for(i=n-2;i>=0;i--)
		    {
               if(arr[i+1]<arr[i] && dis[i]<dis[i+1]+1)
	               dis[i]=1+dis[i+1];
		    }
		    int max=Integer.MIN_VALUE;
		    for(i=0;i<n;i++)
		    {
		        //if(arr[i]==90)
		            //System.out.println("arr[i]="+ arr[i]+" and "+dis[i]+" "+lis[i]);
		        if(max<lis[i]+dis[i]-1)
		            max=lis[i]+dis[i]-1;
		    }
		    System.out.println(max);
		}
	}
}
