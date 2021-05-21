package hu.hazazs.list.doublylinkedlist;

public class OrderedDoublyLinkedList extends DoublyLinkedList {

	@Override
	public boolean add(int number) {
		boolean isAlreadyInList = contains(number);
		Link current = first.getNext();
		while (!current.isBound() && current.getNumber() < number) {
			current = current.getNext();
		}
		Link newLink = new Link(number, current.getPrevious(), current);
		current.getPrevious().setNext(newLink);
		current.setPrevious(newLink);
		return !isAlreadyInList;
	}

}