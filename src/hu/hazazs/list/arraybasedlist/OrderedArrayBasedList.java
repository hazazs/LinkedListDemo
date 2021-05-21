package hu.hazazs.list.arraybasedlist;

import java.util.Arrays;

public class OrderedArrayBasedList extends ArrayBasedList {

	@Override
	public boolean add(int number) {
		boolean isAlreadyInList = contains(number);
		if (size >= elements.length) {
			elements = Arrays.copyOf(elements, elements.length * 2);
		}
		int i = 0;
		while (i < size && elements[i] < number) {
			i++;
		}
		for (int j = size; j > i; j--) {
			elements[j] = elements[j - 1];
		}
		elements[i] = number;
		size++;
		return !isAlreadyInList;
	}

}