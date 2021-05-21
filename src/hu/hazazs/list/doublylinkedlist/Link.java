package hu.hazazs.list.doublylinkedlist;

public class Link {

	private final int number;
	private Link previous;
	private Link next;
	private boolean bound;

	public Link(int number) {
		this.number = number;
	}

	public Link(int number, Link previous, Link next) {
		this.number = number;
		this.previous = previous;
		this.next = next;
	}

	public Link(boolean bound) {
		this.number = 0;
		this.bound = bound;
	}

	public int getNumber() {
		return number;
	}

	public Link getPrevious() {
		return previous;
	}

	public void setPrevious(Link previous) {
		this.previous = previous;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public boolean isBound() {
		return bound;
	}

}