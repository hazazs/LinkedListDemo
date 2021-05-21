package hu.hazazs;

import hu.hazazs.list.List;
import hu.hazazs.list.arraybasedlist.OrderedArrayBasedList;

public class Main {

	public static void main(String[] args) {
		List numbers = new OrderedArrayBasedList();
		numbers.add(42);
		numbers.add(8);
		numbers.add(42);
		numbers.add(32);
		numbers.add(17);
		numbers.add(42);
		numbers.add(73);
		numbers.add(42);
		numbers.add(142);
		numbers.add(123);
		numbers.add(7);
		numbers.add(8);
		System.out.println(numbers.getElementsAsString());
		System.out.println("---");
		numbers.delete(42, true);
		System.out.println(numbers.getElementsAsString());
		System.out.println("---");
		System.out.println(numbers.contains(42));
		System.out.println(numbers.contains(73));
		System.out.println("---");
		System.out.println(numbers.getSize());
	}

}