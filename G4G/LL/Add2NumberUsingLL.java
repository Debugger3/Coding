/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data=d;
	}
}
class Ideone
{
	static Node head1 = null, head2 =null, result = null;
	public static Node push(Node head, int  value)
	{
		if(head==null)
			{
				head=new Node(value);
				return head;	
			}
			Node start=head,temp=start;
			while(start!=null)
			{
				temp=start;
				start=start.next;
			}
			if(temp!=null)
			temp.next=new Node(value);
			return head;
	}
	public static int length(Node head)
	{
		if(head==null)
			return 0;
		Node start=head;
		int count=0;
		while(start!=null)
		{
			start=start.next;
			count++;
		}
		return count;
	}
	public static Node traverserNode(Node head,int count,Node previousNode[])
	{
		Node start=head;
		int count1=0;
		while(start!=null && count1<count)
		{
			previousNode[0]=start;
			start=start.next;
			count1++;
		}
		return start;
	}
	public static Node addListUtil(Node node1,Node node2,Node result,int []carry)
	{
		if(node1.next==null && node2.next==null && result==null)
			{
				result=new Node((node1.data+node2.data)%10);
				carry[0]=(node1.data+node2.data)/10;
				return result;
			}
			Node temp=addListUtil(node1.next,node2.next,result,carry);
			int value=node1.data+node2.data+carry[0];
			result=new Node(value%10);
			result.next=temp;
			carry[0]=value/10;
			return result;
	}

	public static Node addList(Node head1,Node head2,Node result)
	{
		
		int len1=length(head1);
		int len2=length(head2);
		Node node1=head1,node2=head2,previousNode[]=new Node[1];
		//System.out.println("FOund length ryt??"+len1+"   "+len2);//+"   and node 1 and node 2"+node1+" ~~~ "+node2);
		if(len1!=len2)
		{
			if(len1>len2)
				{
					//System.out.println("I should come here");
					node1=traverserNode(head1,len1-len2,previousNode);
					//System.out.println("I should come here111>>"+node1.data);
				}
			else
				node2=traverserNode(head2,len2-len1,previousNode);
		}
		//System.out.println("FOund length ryt??"+len1+"   "+len2+"   and node 1 and node 2"+node1+" ~~~ "+node2);
		int carry[]=new int[1];
		carry[0]=0;
		result=addListUtil(node1, node2, result,carry);
		if(len1==len2 && carry[0]==0)
			return result;
		
		//	return result;
		else if(len1>len2)	
		{
			result=addCarry(head1,result,previousNode,carry);
		}
		else if(len2>len1)	{
			result=addCarry(head2,result,previousNode,carry);
		}
		if(carry[0]!=0)	
			{
				Node temp=result;
				result=new Node(carry[0]);
				result.next=temp;
				return result;
			}
				return result;
	}
	public static Node addCarry(Node head1,Node result,Node previousNode[],int[] carry)
	{
		if(head1==null)
			return null;
		Node temp;	
		if(head1==previousNode[0])	
		{
			temp=result;
			int value=head1.data+carry[0];
			result=new Node(value%10);
			result.next=temp;
			carry[0]=value/10;	
			return result;
		}
		else
		{
			temp=addCarry(head1.next,result,previousNode,carry);
			int value=head1.data+carry[0];
			result=new Node(value%10);
			result.next=temp;
			carry[0]=value/10;	
			return result;
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
	    int arr1[] = {9, 9, 9};
	    int arr2[] = {2, 8,9,9};
 		//1130
    	int size1 = 3;
    	int size2 = 4;
    	int i;
    	for (i =0;i<= size1-1; i++)
        		head1=push(head1, arr1[i]);
 			display(head1);	
 			System.out.println();
    // Create second list as 1->8
	    for (i =0;i<= size2-1; i++)
    		head2=push(head2, arr2[i]);
 		display(head2);	
 		System.out.println();
    	result=addList(head1, head2, result);
    	
    	display(result);
	}
	public static void display(Node result)
	{
		if(result==null)
			return;
		Node temp=result;
		while(temp!=null)
		{
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}
	}
}
