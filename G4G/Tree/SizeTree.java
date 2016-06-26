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
	public static int size(Node root)
	{
		Node current =root;
		if(root==null)
			return 0;
		return 1+size(root.left)+size(root.right);
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
	  Node root = new Node(1);
	  root.left        = new Node(2);
	  root.right       = new Node(3);
	  root.left.left  = new Node(4);
	  root.left.right = new Node(5);

	  System.out.println(size(root));
	}
}
