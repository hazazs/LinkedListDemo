package hu.hazazs.list.arraybasedlist;

import java.util.Arrays;

import hu.hazazs.list.List;

public class ArrayBasedList implements List {

	protected int[] elements = new int[10];
	protected int size;

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean add(int number) {
		boolean isAlreadyInList = contains(number);
		if (size >= elements.length) {
			elements = Arrays.copyOf(elements, elements.length * 2);
		}
		elements[size++] = number;
		return !isAlreadyInList;
	}

	@Override
	public boolean contains(int number) {
		for (int i = 0; i < size; i++) {
			if (elements[i] == number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void delete(int number, boolean all) {
		for (int i = 0; i < size; i++) {
			if (elements[i] == number) {
				for (int j = i; j < size - 1; j++) {
					elements[j] = elements[j + 1];
				}
				elements[size-- - 1] = 0;
				i--;
				if (!all) {
					break;
				}
			}
		}
		if (size <= elements.length / 2) {
			elements = Arrays.copyOf(elements, elements.length / 2);
		}
	}

	@Override
	public String getElementsAsString() {
		StringBuilder numbers = new StringBuilder();
		for (int i = 0; i < elements.length; i++) { // TODO size
			numbers.append(i == 0 ? "" : ", ");
			numbers.append(elements[i]);
		}
		return numbers.toString();
	}

}