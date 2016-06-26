import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int countSteps(int[] arr,int begin,int end)
    {
        int i,j,k,l,n;
        n=end+1;
        int result=0,count=0;
        while(true)
        {
            count=0;
            for(i=begin;i<=end;i++)
            {
                
                if((arr[i] & 1)==1)
                {
                    //System.out.println("here "+i+"   "+arr[i]);
                    arr[i]--;
                    result++;
                    //2 ,0
                    
                }
                if(arr[i]==0)
                    count++;
            }
            if(count==n)
                return result;
            count=0;
            for(i=begin;i<=end;i++)
            {
                if(arr[i]%2==0)
                {
                    arr[i]=arr[i]>>1;
                       
                }
            }
            result++; 
        }
        //return 0;
    }
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int tc,i,j,k,n;
		tc=in.nextInt();
		while(tc-->0)
		{
		    n=in.nextInt();    
		    int arr[]=new int[n];
		    for(i=0;i<n;i++)
		        arr[i]=in.nextInt();
            //int tryArr[]=new int[n];
            //Arrays.fill(tryArr,0);
            int count=countSteps(arr,0,n-1);
            System.out.println(count);
		}
	}
}
