import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int tc,i,j,n,num,ans=1;
        Scanner in=new Scanner(System.in);
        tc=in.nextInt();
        while(tc-->0)
            {
            n=in.nextInt();
            ans=1;

            for(i=2;i<=n;i++)
                {
                ans=lcm(ans,i);
            }
            System.out.println(ans);
        }
    }
    public static int lcm(int a,int i)
        {
        return (a*i)/gcd(a,i);
    }
    public static int gcd(int a,int b)
        {
        if(a==0)return b;
		if(b==0)return a;
		return gcd(b,a%b);
    }
}
