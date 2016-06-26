import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int getCount(int[] arr, int begin,int n)
    {
        if(arr[0]==0)
            return -1;
        int lis[] =new int[n],i,j;
        lis[0]=0;
        for(i=1;i<n;i++)
        {
            lis[i]=Integer.MAX_VALUE;
            for(j=0;j<i;j++)
            {
                if(lis[j]!=Integer.MAX_VALUE && i<=j+arr[j] )
                   lis[i]=Math.min(lis[j]+1,lis[i]);
            }
        }
        return lis[n-1];
    }
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int n,k,i,j,count=0,tc;
		
		tc=in.nextInt();
		while(tc-->0)
		{
		    n=in.nextInt();
		    int arr[]=new int[n];
		    for(i=0;i<n;i++)
			    arr[i]=in.nextInt();
			System.out.println(getCount(arr,0,n));    
		}
		
	}
}
