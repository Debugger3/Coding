import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int tc;
        long num,primeCheck,answer,i;
        Scanner in=new Scanner(System.in);
        tc=in.nextInt();
        while(tc-->0)
            {
            num=in.nextLong();
            primeCheck=(long)Math.sqrt(num);
            answer=0;
            //System.out.print("primeCheck "+primeCheck+"~");
            for(i=2;i<=num;i++)
                {
                if(num%i==0)
                    answer=i;
                while(num%i==0 && num>1)
                    {
                    num=num/i;
                }
                //System.out.print("i"+i+"~");
                if(num==1 || i*i>num)
                    {
                        if(num>2)
                            answer=num;
                        break;
                    }
            }
            System.out.println(answer);
        }
    }
}
