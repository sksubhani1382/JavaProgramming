package com.Winter_Oct2026;

class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}

public class ReverseLinkedList {
	
	static Node reverse(Node head)
	{
		Node prev=null;
		Node cur=head;
		
		while(cur!=null)
		{
			Node next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
			
		}
		return prev;
	}
	static void PrintList(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.data+"->");
			head=head.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		
		System.out.println("Before revese: ");
		PrintList(head);
		head=reverse(head);
		System.out.println("After reverse: ");
		PrintList(head);
		
	}
}
