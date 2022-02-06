package com.greatlearning.main;

import com.greatlearning.service.Main;
import com.greatlearning.service.TreeNode;

public class Skewed_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				Main tree = new Main();
				
				tree.node = new TreeNode(50);
				
				tree.node.left = new TreeNode(30);
				
				tree.node.right = new TreeNode(60);
				
				tree.node.left.left = new TreeNode(10);
				
				tree.node.right.left= new TreeNode(55);
				
				tree.convertToSkewed();
				
				System.out.println("Binary Search Tree is converted successfully to skewed tree \n ");
				
				tree.Inorder(tree.node);
				
			}
		
		

	}


