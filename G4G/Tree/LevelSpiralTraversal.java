/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Node{
	int data;
	Node left,right;
	Node(int d)
	{
		data=d;
		left=right=null;
	}
}
class Solution
{
	public static void levelOrderSpiral(Node root)
	{
		if(root==null)
			return ;
		Node temp=root;
		Stack<Node>st1=new Stack<Node>();
		Stack<Node>st2=new Stack<Node>();
		boolean flag=false;
		st1.push(root);
		while(!st1.isEmpty())
		{
			Node curr=st1.pop();
			System.out.print(curr.data+"  ");
			if(!flag)
			{
				if(curr.left!=null)
					st2.push(curr.left);
				if(curr.right!=null)
					st2.push(curr.right);
			}
			else
			{
				if(curr.right!=null)
					st2.push(curr.right);
				if(curr.left!=null)
					st2.push(curr.left);
			}
			if(st1.isEmpty())
			{
				st1=(Stack<Node>)st2.clone();
				st2.removeAll(st2);
				//System.out.println("stack size--->"+st2.size());
				//st2=new Stack<Node>();
				flag=!flag;
			}

		}
	}
	public static void main(String args[])
	{
	  /* Constructed binary tree is
	            1
	          /   \
	        2      3
	      /  \
	    4     5
	  */
	  Node root1 = new Node(1);
	  Node root2 = new Node(1);
	  root1.left        = new Node(2);
	  root1.right       = new Node(3);
	  root1.left.left  = new Node(4);
	  root1.left.right = new Node(5);

	  root1.right.left = new Node(7);
	  root1.right.right = new Node(9);
	  //root1.left.right = new Node(5);
	  int arr[]=new int[5];
	levelOrderSpiral(root1);
	//inorder(root1);



	}
}

