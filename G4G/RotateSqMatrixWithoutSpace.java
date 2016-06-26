import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void transposeReverse(int [][]arr,int n)
    {
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[i][n-1-j];
                arr[i][n-1-j]=temp;
            }
        }
        
    }
	public static void main (String[] args) {
		//code
				Scanner in=new Scanner(System.in);
		int tc,i,j,k,n;
		tc=in.nextInt();
		while(tc-->0)
		{
		    n=in.nextInt();    
		    int arr[][]=new int[n][n];
		    for(i=0;i<n;i++)
		    {
		        for(j=0;j<n;j++)
		            arr[i][j]=in.nextInt();
		    }
		        transposeReverse(arr,n);
		    for(i=0;i<n;i++)
		    {
		        for(j=0;j<n;j++)
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}//7 4 1 8 5 2 9 6 3
}
