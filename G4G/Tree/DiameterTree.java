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

	public static int diameter(Node root,int[] max)
	{
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 1;
		int leftSide=0,rightSide=0;
		if(root.left!=null)
		leftSide= diameter(root.left,max);
		if(root.right!=null)
		rightSide= diameter(root.right,max);
		if(leftSide+rightSide+1>max[0])
			{
				max[0]=leftSide+rightSide+1;
				//return max[0];
				return Math.max(leftSide,rightSide)+1;
			}
		else return Math.max(leftSide,rightSide)+1;

	}

	public static void main(String args[])
	{

	  Node root1 = new Node(50);
	  root1.left        = new Node(7);
	  root1.left.left  = new Node(3);
	  root1.left.left.left  = new Node(3);
	  root1.left.left.left.left  = new Node(3);
	  root1.left.right = new Node(5);
	  root1.left.right.left = new Node(5);
	  root1.left.right.left.left = new Node(5);
	  root1.left.right.left.left.left = new Node(5);
	  root1.right       = new Node(2);

	  /*
	  root1.right.left = new Node(1);
	  root1.right.right = new Node(30);

	  root1.right.right.right = new Node(32);
	  root1.right.right.right.right = new Node(32);*/
	   /*Node root = new Node(1);
  		root.left = new Node(2);
  		root.right = new Node(3);
  		root.left.left = new Node(4);
  		root.left.right = new Node(5);*/
	  //root1.left.right = new Node(5);
	  int max[]=new int[1];
	  max[0]=0;
		//diameter(root,max);
		diameter(root1,max);
		System.out.println(max[0]);
		//inorder(root1);
	}
}
