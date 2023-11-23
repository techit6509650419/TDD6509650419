package core;

public interface IStack {
	 int getSize();
	 boolean isEmpty();
	 Object pop() throws Exception;
	 void push(Object element) throws Exception;
	 Object top() throws Exception;

}
