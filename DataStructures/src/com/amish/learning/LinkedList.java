package com.amish.learning;

public class LinkedList {
	
	static Node head;
	
	static class Node{
		
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	public void printList(Node head){
		
		Node n = head;
		while (n != null)
		{
			System.out.println(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		
		LinkedList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		LinkedList.head.next = second;
		second.next = third;
		
		Insert push = new Insert();
		
		head = push.pustAtbegin(4,head);
		
		push.insertAfter(9, head, 1);
		
		push.insertEnd(11, head);

		list.printList(head);
		
		
	}

}
