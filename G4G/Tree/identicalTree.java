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
	public static boolean isIdentical(Node root1,Node root2)
	{
		if(root1==null && root2 ==null)
			return true;
		if(root1==null || root2==null)
			return false;
		if(root1.data!=root2.data)
			return false;
		return isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right);
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

	 root2.left = new Node(2);
    root2.right = new Node(3);
    root2.left.left = new Node(4);
    root2.left.right = new Node(6);
	System.out.println(isIdentical(root1,root2));
	}
}
