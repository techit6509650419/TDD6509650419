package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	void push(Object obj);
	Object top();
	boolean isFull();
	Object pop();

}
