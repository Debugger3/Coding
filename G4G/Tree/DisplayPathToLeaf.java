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
	public static void printArr(int[] arr,int n)
	{
		for(int i=0;i<=n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void displayPath(Node root,int []arr,int index)
	{
		if(root==null)
			return ;
		arr[index]=root.data;
		if(root.left==null && root.right==null)
		{
			printArr(arr,index);
			return;
		}
		displayPath(root.left,arr,index+1);
		displayPath(root.right,arr,index+1);
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
	  int arr[]=new int[5];
	displayPath(root1,arr,0);
	//inorder(root1);



	}
}

