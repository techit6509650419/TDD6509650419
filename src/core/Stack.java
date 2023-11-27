package core;

public class Stack implements IStack {

	Object element ;
	Object arr[];
	int capacity = 3 ;
	int top ;
	
	Stack(){
		arr = new Object[capacity];
		top = -1 ;
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true ;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void push(Object element) {
		
		if(!isFull()) {
		top++;
		arr[top] = element;
		}
		
	}
	
	public Object top() {
		
		return arr[top];
	}
	
	public boolean isFull() {
		if(top<capacity-1) {
			return false;
		}
		
		else {
			return true;
		}
	}
	
	public Object pop() {
		Object x = arr[top];
		arr[top]= null;
		top--;
		return x;
	}
}

