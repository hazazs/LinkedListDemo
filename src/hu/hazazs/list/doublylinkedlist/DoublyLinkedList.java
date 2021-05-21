package hu.hazazs.list.doublylinkedlist;

import java.util.ArrayList;
import java.util.stream.Collectors;
import hu.hazazs.list.List;
import hu.hazazs.list.doublylinkedlist.Link;

public class DoublyLinkedList implements List {

	protected Link first = new Link(true);
	protected Link last = new Link(true);

	public DoublyLinkedList() {
		first.setNext(last);
		last.setPrevious(first);
	}

	@Override
	public int getSize() {
		int size = 0;
		Link current = first.getNext();
		while (!current.isBound()) {
			size++;
			current = current.getNext();
		}
		return size;
	}

	@Override
	public boolean add(int number) {
		boolean isAlreadyInList = contains(number);
		Link newLink = new Link(number, first, first.getNext());
		first.getNext().setPrevious(newLink);
		first.setNext(newLink);
		return !isAlreadyInList;
	}

	@Override
	public boolean contains(int number) {
		Link current = first.getNext();
		while (!current.isBound()) {
			if (current.getNumber() == number) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	@Override
	public void delete(int number, boolean all) {
		Link current = first.getNext();
		while (!current.isBound()) {
			if (current.getNumber() == number) {
				current.getPrevious().setNext(current.getNext());
				current.getNext().setPrevious(current.getPrevious());
				if (!all) {
					break;
				}
			}
			current = current.getNext();
		}
	}

	@Override
	public String getElementsAsString() {
		java.util.List<String> elements = new ArrayList<>();
		Link current = first.getNext();
		while (!current.isBound()) {
			elements.add(String.valueOf(current.getNumber()));
			current = current.getNext();
		}
		return elements.stream().collect(Collectors.joining(" - "));
	}

}