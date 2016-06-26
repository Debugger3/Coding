import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int tc,i,j,k,n;
		tc=in.nextInt();
		int modul=1000000007;
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(0,1);
		hm.put(1,2);
		for(i=2;i<=70;i++)
		        hm.put(i,(hm.get(i-1)+hm.get(i-2))%modul);
		while(tc-->0)
		{
		    n=in.nextInt();    
		    System.out.println(hm.get(n));
		}
	}
}
