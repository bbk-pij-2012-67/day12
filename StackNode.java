/**
 * A node in a dynamic singly-linked list of Strings
 */
public class StackNode<T> {
    private T content;
    private StackNode<T> next;

    public StackNode(T content) {
	  this.content = content;
	  next = null;
    }

    /**
     * Returns the string in this node
     */
    public T getContent() {
	  return content;
    }

    /**
     * Set the next node to point to the given node
     */
    public void setNext(StackNode<T> node) {
	  next = node;		
    }

    /**
     * Set the next node to point to the given node
     */
    public StackNode<T> getNext() {
	  return next;		
    }
}