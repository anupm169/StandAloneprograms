package com.zeenet.linkedlist;

public class BasicLinkedList<X> {

	private Node first;
	private Node last;
	private int nodeCount;

	public BasicLinkedList() {
		this.first = null;
		this.last = null;
		nodeCount = 0;
	}

	public int size() {
		return nodeCount;
	}

	public void addNode(X item) {

		Node newNode = new Node(item);

		if (first == null) {
			first = newNode;
			last = first;
		} else {
			last.setNextNode(newNode);
			last = newNode;
		}
		nodeCount++;
	}

	public void insertAt(X item, int position) {

		if (position == 0 || position > size() ) {
			throw new IllegalStateException("the position should be less then the size ");
		}

		Node newNode = new Node(item);

		if (first == null || position == 1) {
			first = newNode;
		}

		Node currentNode = first;

		for (int i = 1; i < position && currentNode != null; i++) {

			currentNode = currentNode.getNextNode();

		}

		Node tempNode = null;

		if (currentNode != null && currentNode.getNextNode() != null) {
			tempNode = currentNode.getNextNode();
			currentNode.setNextNode(newNode);
			newNode.setNextNode(tempNode);
		}

		nodeCount++;
	}

	public X removeNode() {

		if (first == null) {
			throw new IllegalStateException("The Linkedlist is empty");
		}

		X item = first.getItem();
		first = first.getNextNode();
		nodeCount--;
		return item;

	}

	public X removeAt(int position) {

		if (first == null && position == 0 && position > size()) {
			throw new IllegalStateException("The list is empty");
		}

		X item = null;
		Node currentNode = first;
		for (int i = 1; i < position && currentNode != null; i++) {
			currentNode = currentNode.getNextNode();
		}

		if (currentNode != null && currentNode.getNextNode() != null) {
			Node deleteNode = currentNode.getNextNode();
			item = deleteNode.getItem();
			Node tempNode = deleteNode.getNextNode();
			currentNode.setNextNode(tempNode);
		}
		nodeCount--;

		return item;
	}

	@Override
	public String toString() {

		Node currentNode = first;

		StringBuilder buffer = new StringBuilder();

		while (currentNode != null) {

			buffer.append(currentNode.getItem());
			if (currentNode.getNextNode() != null) {
				buffer.append(" -> ");
			}
			currentNode = currentNode.getNextNode();
		}

		return buffer.toString();

	}

	private class Node {

		private Node nextNode;
		private X item;

		public Node(X item) {
			this.nextNode = null;
			this.item = item;
		}

		public void setNextNode(Node node) {
			this.nextNode = node;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public X getItem() {
			return item;
		}

	}

}
