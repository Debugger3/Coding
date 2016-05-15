import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int tc;
        long num,sum=0,i;
        Scanner in=new Scanner(System.in);
        tc=in.nextInt();
        long lastNo3,lastNo5,lastNo15;
        long sum3,sum5,sum15,no3,no5,no15;
        while(tc-->0)
            {
                num=in.nextLong();
                num--;
                lastNo3=num-num%3;

                lastNo5=num-num%5;

                lastNo15=num-num%15;

                no3=(lastNo3-3)/3+1;
                no5=(lastNo5-5)/5+1;
                no15=(lastNo15-15)/15+1;
            //40(2+119)2
                sum3=((lastNo3+3)*no3)/2;
                sum5=((lastNo5+5)*no5)/2;
                sum15=((lastNo15+15)*no15)/2;
                // (495 - 308)/11 + 11 = 18 The sum is: (495 + 308)*18/11

                    sum=sum3-sum15+sum5;

                System.out.println(sum);
        }
    }
}
