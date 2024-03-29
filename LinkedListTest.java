import org.junit.*;
import static org.junit.Assert.*;

public class LinkedListTest{
	
	@Test
	public void testsAdd(){
		LinkedList<String> list = new DBLinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		
		assertTrue(list.delete("one"));
		assertTrue(list.delete("two"));
		assertTrue(list.delete("three"));
		assertTrue(list.delete("four"));
		assertTrue(list.delete("five"));
		assertTrue(list.delete("six"));
	
		LinkedList<Integer> list2 = new DBLinkedList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		assertTrue(list2.delete(1));
		assertTrue(list2.delete(2));
		assertTrue(list2.delete(3));
		assertTrue(list2.delete(4));
		assertTrue(list2.delete(5));
		assertTrue(list2.delete(6));
	
	}
	
	
}
