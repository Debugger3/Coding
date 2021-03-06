import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int tc,n;
        tc=in.nextInt();
        int max = 1000000,i,j;
        boolean prime[]=new boolean[max+1];
        ArrayList<Integer> arr=new ArrayList<Integer>();
        Arrays.fill(prime,true);
        /*
        mark non-primes <=N using Sieve of Eratosthenes
        https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
        */
        for(i=2;i*i<=max;i++)
            {
            if(prime[i])
                {
                for(j=i*i;j<=max;j=j+i)
                    {
                    prime[j]=false;
                }
            }
        }
        for(i=2;i<=max;i++)
            {
            if(prime[i])
                arr.add(i);
        }
        while(tc-->0)
            {
            n=in.nextInt();
            //System.out.println(arr.size());
            //if(arr.size()>n)
                System.out.println(arr.get(n-1));
            /*else
                System.out.println(-1);*/
        }
    }
}
