package com.zeenet.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		BasicLinkedList<Integer> list = new BasicLinkedList<>();
		list.addNode(5);
		list.addNode(7);
		list.addNode(3);
		list.addNode(9);
		list.addNode(8);

		System.out.println(list);

		list.insertAt(2, 3);

		System.out.println(list);

		System.out.println(list.removeAt(3));

		System.out.println(list);
		
		list.removeNode();
		
		System.out.println(list);
		
//		list.insertAt(2, 0);
		
		System.out.println("=========================================");
		
		LinkedList<Integer> linkedlist = new LinkedList<>();
		linkedlist.add(5);
		linkedlist.add(7);
		linkedlist.add(3);
		linkedlist.add(9);
		linkedlist.add(8);
		
		System.out.println(linkedlist);
		
		linkedlist.add(3, 2);
		System.out.println(linkedlist);
		
		linkedlist.remove(3);
		System.out.println(linkedlist);
		
		linkedlist.add(1, 0);
		System.out.println(linkedlist);
		
		linkedlist.remove();
		System.out.println(linkedlist);

	}

}
