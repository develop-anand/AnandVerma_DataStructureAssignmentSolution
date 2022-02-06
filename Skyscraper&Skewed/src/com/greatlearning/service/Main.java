package com.greatlearning.service;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public TreeNode node;
	
	Queue <TreeNode> buffer_queue;
	
	public void convertToSkewed() {
		
		buffer_queue = new LinkedList<>();
		
		NodesToQueue(node);
		
		
		TreeNode temp = node = buffer_queue.remove();
		while(!buffer_queue.isEmpty()) {
			temp.right = buffer_queue.remove();
			temp = temp.right;
		}
	}

	private void NodesToQueue(TreeNode node) {
		
		if(node == null) {
			
			return;
		}
		
		NodesToQueue(node.left);
		
		node.left = null;
		
		buffer_queue.add(node);
		
		NodesToQueue(node.right);
		
		node.right = null;
	}
	
	public void Inorder(TreeNode node) {
		
		if(node == null) {
			
			return;
			
		}
		
		Inorder(node.left);
		
		System.out.print(node.getData() + " ");
		
		Inorder(node.right);
		
	}
	
	public void Skewed() {
		
		TreeNode temp = node;
		
		while(temp != null) {
			
			if(temp.left != null) {
				
				System.out.println(" Not a skewed tree !");
				
				return;
			}
		}
		
		
	}
	
}