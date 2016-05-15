import java.io.*;
import java.util.*;

public class Solution {
//55+89=144
    //+2
    //+8
    //34*4=136+8
    //144+89=233
    //144+233=377
    //377+233=610
    //144*4=576+34=610
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int tc,i,j,k;
        long num;
        long term1,term2;
        long lastSum=0,temp=0;
        tc=in.nextInt();
        while(tc-->0)
            {
            num=in.nextLong();
            lastSum=2;
            term1=0;
            term2=2;
            //sum=2;
            while(term1+4*term2<=num)
                {

                lastSum=lastSum+term1+4*term2;
                temp=term1+4*term2;
                term1=term2;
                term2=temp;
            }
            System.out.println(lastSum);
        }
    }
}
