/* package whatever; // don't place package name! */
/*Inorder Tree Traversal without recursion and without stack!*/
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
	public static void MorrisTraversal(Node root)
	{
		Node current =root;
		if(root==null)
			return;
		while(current!=null)
		{
			if(current.left!=null)
			{
				//System.out.println("I m here");
				Node temp=current.left;
				while(temp.right!=null && temp.right!=current)
				{
					//System.out.println("I m temp right"+temp.right);
					temp=temp.right;
				}
				//System.out.println("I m temp right");//+temp.right);
				if(temp.right==null)
					{
						//System.out.println("I m here1111");
						temp.right=current;
						current=current.left;
					}
				else
					{
						temp.right=null;
						System.out.print(current.data+" ");
						current=current.right;
					}

			}
			else{
						System.out.print(current.data+" ");
						current=current.right;
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
	  Node root = new Node(1);
	  root.left        = new Node(2);
	  root.right       = new Node(3);
	  root.left.left  = new Node(4);
	  root.left.right = new Node(5);

	  MorrisTraversal(root);
	}
}
