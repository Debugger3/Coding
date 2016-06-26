import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in =new Scanner(System.in);
		int tc,i,j,n;
		tc=in.nextInt();
		while(tc-->0)
		{
		    n=in.nextInt();
		    int arr[]=new int[n];
		    for(i=0;i<n;i++)
		        arr[i]=in.nextInt();
		    int lo=0,mid=0,high=n-1,temp;      
		    while(mid<=high/* && mid<n && high>0*/)
		    {
		        //System.out.println(mid+"   "+high);
		        switch (arr[mid])
		        {
		            case 0:
		                temp=arr[lo];
		                arr[lo++]=arr[mid];
		                arr[mid++]=temp;
		                break;
		            case 1:
		               mid++;
		                break;
		            case 2:
		                temp=arr[high];
		                arr[high--]=arr[mid];
		                arr[mid]=temp;
		                break;
		        }
		    }
		    for(i=0;i<n;i++)
		        System.out.print(arr[i]+" ");
		    System.out.println();      
		}
	}
}
