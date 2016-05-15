import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean isPrime(int n)
        {
        String num=n+"";
        int i=0;
        int len=num.length();
        while(i<len/2)//1231
            {
            if(num.charAt(i)==num.charAt(len-i-1))
                {
                i++;
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int tc,i,j,n,max;
        Scanner in=new Scanner(System.in);
        tc=in.nextInt();
        while(tc-->0)
            {
            n=in.nextInt();
            max=Integer.MIN_VALUE;
            for(i=100;i<=999;i++)
                {
                for(j=100;j<=999;j++)
                    {
                    if(i*j>=100000 && i*j<=n && isPrime(i*j))
                        {
                        if(max<i*j)
                            max=i*j;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
