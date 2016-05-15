import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         long tc,i,j,n,num,sumAp,sumSq;
        Scanner in=new Scanner(System.in);
        tc=in.nextLong();
        while(tc-->0)
            {
            n=in.nextLong();
            sumAp=((1+n)*n)/2;
            sumAp=(long)Math.pow(sumAp,2);
            //n(n+1)(2n+1)/6.
            sumSq=(n*(n+1)*(2*n+1))/6;
            //System.out.println("sumSq "+sumSq+"~ "+sumAp);
            System.out.println(Math.abs(sumSq-sumAp));
        }
    }
}
