/**
 * Implementation of interface stack using a 
 * dynamic structure as support. 
 */
public class PointerStack<T> implements Stack<T> {
    /**
     * The head of the stack: the visible node
     */
    private StackNode<T> head;

    public PointerStack() {
	  head = null;
    }

    public void push(T newContent) {
	  StackNode<T> newNode = new StackNode<T>(newContent);
	  if (head != null) {
		newNode.setNext(head);
	  }
	  head = newNode;	  
    }

    public T pop() {
	  if (head == null) {
		return null;
	  }
	  T result = head.getContent();
	  head = head.getNext();
	  return result;
    }

    public T peek() {
	  if (head == null) {
		return null;
	  } else {
		return head.getContent();
	  }
    }

    public boolean isEmpty() {
	  if (getSize() == 0) {
		return true;
	  } else {
		return false;
	  }
    }

    /**
     * Returns the number of string in the stack
     */
    public int getSize() {
	  int result = 0;
	  StackNode currentNode = head;
	  while (currentNode != null) {
		currentNode = currentNode.getNext();
		result++;
	  }
	  return result;
    }
}