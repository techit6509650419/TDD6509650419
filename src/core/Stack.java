package core;

import java.util.ArrayList;
import java.util.List;

public class Stack implements IStack {
    private List<Object> elements;
    private int capacity;
    private Class<?> type;

    public Stack(int capacity) {
        this.elements = new ArrayList<>();
        this.capacity = capacity;
        this.type = null;
    }

    @Override
    public int getSize() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void push(Object element) throws Exception {
        if (getSize() == capacity) {
            throw new Exception("Stack overflow");
        }

        if (element == null) {
            throw new IllegalArgumentException("Null elements are not allowed in the stack.");
        }

        if (type == null) {
            type = element.getClass();
        } else if (!element.getClass().equals(type)) {
            throw new Exception("All elements in the stack must be of the same type.");
        }

        elements.add(element);
    }

    @Override
    public Object top() {
        if (isEmpty()) {
            return null;
        }
        return elements.get(getSize() - 1);
    }

    public Object pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack underflow");
        }
        return elements.remove(getSize() - 1);
    }

    @Override
    public boolean isFull() {
        return getSize() == capacity;
    }
}
