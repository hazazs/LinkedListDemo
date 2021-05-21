package hu.hazazs.list;

public interface List {

	int getSize();

	boolean add(int number);

	boolean contains(int number);

	void delete(int number, boolean all);

	String getElementsAsString();

}