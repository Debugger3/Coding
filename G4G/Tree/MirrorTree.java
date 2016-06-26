/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

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
	public static void inorder(Node root)
	{
		if(root==null)
		return ;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	public static void mirror(Node root)
	{
		if(root==null)
			return ;
		mirror(root.left);
		mirror(root.right);
		Node temp=root.left;
		root.left=root.right;
		root.right=temp;
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
	mirror(root1);
	inorder(root1);
	}
}

