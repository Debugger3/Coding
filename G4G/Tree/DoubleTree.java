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

	public static void doubleTree(Node root)
	{
		if(root==null)
			return;
		Node temp;
		 doubleTree(root.left);
		 doubleTree(root.right);
		 temp=root.left;
		root.left=new Node(root.data);
		root.left.left=temp;
		return;


	}
	public static void inorder(Node root)
	{
		if(root==null)
		return ;
		inorder(root.left);
		System.out.print(root.data+"  ");
		inorder(root.right);
	}
	public static void main(String args[])
	{

	  /*Node root1 = new Node(50);
	  root1.left        = new Node(7);
	  root1.left.left  = new Node(3);
	  root1.left.left.left  = new Node(3);
	  root1.left.left.left.left  = new Node(3);
	  root1.left.right = new Node(5);
	  root1.left.right.left = new Node(5);
	  root1.left.right.left.left = new Node(5);
	  root1.left.right.left.left.left = new Node(5);
	  root1.right       = new Node(2);
	  */
	  /*
	  root1.right.left = new Node(1);
	  root1.right.right = new Node(30);

	  root1.right.right.right = new Node(32);
	  root1.right.right.right.right = new Node(32);*/
	   Node root = new Node(1);
  	   root.left = new Node(2);
  	   root.right = new Node(3);
  	   root.left.left = new Node(4);
  	   root.left.right = new Node(5);
	  //root1.left.right = new Node(5);

		//diameter(root,max);
		doubleTree(root);

		inorder(root);
	}
}
