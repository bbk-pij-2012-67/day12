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
	}
}
