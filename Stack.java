/**
 * A basic Stack of Strings
 */
public interface Stack<T> {
    /*
     * Pushes a new string onto the stack
     */
    void push(T newText);

    /*
     * Retrieves the last element from the stack and returns it. 
     * If the stack is empty, returns null.
     */
    T pop();

    /*
     * Returns the last element from the stack (does not remove it).
     * If the stack is empty, returns null.
     */
    T peek();

    /* 
     * Returns true if the stack contains no elements, 
     * false otherwise. 
     */
    boolean isEmpty();
}