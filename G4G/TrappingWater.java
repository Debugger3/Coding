import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
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
		    int left[]=new int[n];
		    int right[]=new int[n];
		    Stack<Integer> st=new Stack<Integer>();      
		    st.push(0);
		    left[0]=0;
		    //System.out.println("where m i");
		    for(i=1;i<n;i++)
		    {
		    	if(!st.isEmpty() && arr[(int)st.peek()]<arr[i])
		    	{
		        while(!st.isEmpty() && arr[(int)st.peek()]<arr[i])
		            st.pop();
		         st.push(i);   
		    	}   
		        if(!st.isEmpty())          
		            left[i]=arr[(int)st.peek()];
		        //else left[i] =0;
		        
		    }
		    right[n-1]=0;
		    st.clear();
		    st.push(n-1);
		    //System.out.println("where m i");
		    for(i=n-2;i>=0;i--)
		    {
		    	if(!st.isEmpty() && arr[(int)st.peek()]<arr[i])
		    	{
		        while(!st.isEmpty() && arr[(int)st.peek()]<arr[i])
		            st.pop();
		            st.push(i);
		    	}
		        if(!st.isEmpty())          
		            right[i]=arr[(int)st.peek()];
		        //else right[i] =0;
		        //st.push(i);
		    }
		    /*for(i=0;i<n;i++)
		    	System.out.println(left[i]+"   "+right[i]);*/
		    int sum=0;
		    for(i=0;i<n;i++)
		    {
		        sum+=(Math.min(left[i],right[i])-arr[i]>0?Math.min(left[i],right[i])-arr[i]:0);
		    }
		    System.out.println(sum);
		}
	}
}
