package hu.hazazs.list.linkedlist;

import java.util.ArrayList;
import java.util.stream.Collectors;
import hu.hazazs.list.List;

public class LinkedList implements List {

	private Link first = new Link(0);

	@Override
	public int getSize() {
		int size = 0;
		Link current = first.getNext();
		while (current != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}

	@Override
	public boolean add(int number) {
		boolean isAlreadyInList = contains(number);
		Link newLink = new Link(number, first.getNext());
		first.setNext(newLink);
		return !isAlreadyInList;
	}

	@Override
	public boolean contains(int number) {
		Link current = first.getNext();
		while (current != null) {
			if (current.getNumber() == number) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	@Override
	public void delete(int number, boolean all) {
		Link previous = first;
		Link current = first.getNext();
		while (current != null) {
			if (current.getNumber() == number) {
				previous.setNext(current.getNext());
				if (!all) {
					break;
				}
			} else {
				previous = current;
			}
			current = current.getNext();
		}
	}

	@Override
	public String getElementsAsString() {
		java.util.List<String> elements = new ArrayList<>();
		Link current = first.getNext();
		while (current != null) {
			elements.add(String.valueOf(current.getNumber()));
			current = current.getNext();
		}
		return elements.stream().collect(Collectors.joining(" - "));
	}

}