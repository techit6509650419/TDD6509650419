package core;


import junit.framework.TestCase;

public class StackTestCases extends TestCase {

	//TC1
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
    }
	
	//TC2
	public void testPushElmToTop() {
		Stack s1 = new Stack();
		assertFalse(s1.isFull());
		int obj1 = new Integer(1);
		s1.push(obj1);
		assertEquals(s1.top(), obj1);
	}
	
	//TC3
	public void testLastInFirstOut() {
		Stack s1 = new Stack();
		Integer obj1 = new Integer(1);
		Integer obj2 = new Integer(2);
		try {
			
			s1.push(obj1);
			s1.push(obj2);
		
			 } catch (Exception e) {
			e.printStackTrace();
			 }

	
			 assertEquals(s1.pop(), obj2);
			 assertEquals(s1.pop(), obj1);
			 
	}
}
