package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {
	
	   //TC1
	   public void testCreateEmptyStack() {
	        Stack stack = new Stack(10);
	        assertTrue(stack.isEmpty());
	    }

	    // TC2
	    public void testPushAndTop() throws Exception {
	        Stack stack = new Stack(10);
	        stack.push(5);
	        assertEquals(5, stack.top());
	    }

	    // TC3
	    public void testPushSameType() {
	        Stack stack = new Stack(10);
	        try {
	            stack.push(5);
	            stack.push("Test");
	            fail("Exception was not thrown");
	        } catch (Exception e) {
	            assertEquals("All elements in the stack must be of the same type.", e.getMessage());
	        }
	    }

	    // TC4
	    public void testLIFOProperty() throws Exception {
	        Stack stack = new Stack(10);
	        stack.push(1);
	        stack.push(2);
	        assertEquals(2, stack.pop());
	        assertEquals(1, stack.pop());
	    }

	    // TC5
	    public void testStackOverflow() {
	        Stack stack = new Stack(5);
	        try {
	            stack.push(1);
	            stack.push(2);
	            stack.push(3);
	            stack.push(4);
	            stack.push(5);
	            stack.push(6);
	            fail("Exception was not thrown");
	        } catch (Exception e) {
	            assertEquals("Stack overflow", e.getMessage());
	        }
	    }
}