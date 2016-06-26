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
		System.out.print(root.data+"   ");
		inorder(root.right);
	}
	public static int convertChildSum(Node root)
	{
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return root.data;
		int leftSide=convertChildSum(root.left);
		int rightSide=convertChildSum(root.right);
		if(leftSide+rightSide>root.data)
			{
				root.data=leftSide+rightSide;

			}
		else if(leftSide+rightSide<root.data)
			{
				if(root.left!=null)
					root.left.data=leftSide+root.data-(leftSide+rightSide);
				else
					root.right.data=rightSide+root.data-(leftSide+rightSide);
				int temp=convertChildSum(root.left);
				//return root.data;
			}
		//else
		return root.data;
	}

	public static void main(String args[])
	{

	  Node root1 = new Node(50);
	  root1.left        = new Node(7);
	  root1.right       = new Node(2);
	  root1.left.left  = new Node(3);
	  root1.left.right = new Node(5);
	  root1.right.left = new Node(1);
	  root1.right.right = new Node(30);
	  //root1.left.right = new Node(5);
		convertChildSum(root1);
		inorder(root1);
	}
}

