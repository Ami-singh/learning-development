package com.amish.learning;

import com.amish.learning.LinkedList.Node;

public class Insert {
	
	public Node pustAtbegin(int data , Node head)
	{
		
		Node newNode = new Node(data);
		
		newNode.next = head;
		
		head = newNode;
		
		return head;
		
	}
	
	public void insertAfter(int data , Node head, int position)
	{
		Node n = head;
		int count = 0;
		
		if(head == null)
			return;
		
		while(n.next != null && count <= position)
		{
			n = n.next;
			count++;
		}
		
		Node newNode = new Node(data);
		
		newNode.next = n.next;
		
		n.next = newNode;
	}
	
	
	public void insertEnd(int data, Node head)
	{
		
		Node n = head;
		
		Node newNode = new Node(data);
		
		if (head == null)
		{
			head = new Node(data);
			return;
		}
		while(n.next != null)
		{
			n = n.next;
		}
		
		n.next = newNode;
		newNode.next = null;
		return;
	}

}








