package hu.hazazs.list.linkedlist;

public class Link {

	private final int number;
	private Link next;

	public Link(int number) {
		this.number = number;
	}

	public Link(int number, Link next) {
		this.number = number;
		this.next = next;
	}

	public int getNumber() {
		return number;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

}