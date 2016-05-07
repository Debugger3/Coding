import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int tc,i,j,k,max,row,count=0;
        Scanner in=new Scanner(System.in);
        tc=in.nextInt();
        while(tc-->0)
            {
            count=0;
            row=in.nextInt();
            int arr[][]=new int[row][];
            int sum[][]=new int[row][];
            for(i=0;i<row;i++)
                {
                arr[i]=new int[count+1];
                sum[i]=new int[count+1];
                count++;
                for(j=0;j<count;j++)
                {
                    arr[i][j]=in.nextInt();
                    if(i==row-1)
                        sum[i][j]=arr[i][j];
                    else
                        sum[i][j]=0;
                }
            }
            for(i=row-2;i>=0;i--)
                {
                for(j=arr[i].length-1;j>=0;j--)
                    {
                    //if(j<arr[i].length-1)
                        sum[i][j]=arr[i][j]+Math.max(sum[i+1][j],sum[i+1][j+1]);
                    //else
                        //sum[i][j]=arr[i][j]+Math.max(sum[i+1][j],sum[i+1][j+1]);
                }
            }
            System.out.println(sum[0][0]);
        }
    }
}
