public class DBLinkedList<T> implements LinkedList<T>{
	
	private T value;
	private DBLinkedList<T> nextNode;
	private DBLinkedList<T> previousNode;
	
	public void add(T value){
		if(this.nextNode == null){
			DBLinkedList<T> newNode = new DBLinkedList<T>();
			newNode.value = value;
			this.nextNode = newNode;
			newNode.previousNode = this;
		}else{
			this.nextNode.add(value);
		}
	}
	
	public boolean delete(T value){
		if(this.nextNode == null){
			return false;//not found
		}else if(this.nextNode.value.equals(value)){
			//found
			this.nextNode = nextNode.nextNode;
			if (this.nextNode != null){
				this.nextNode.previousNode = this;
			}
			return true;
		}else{
			return this.nextNode.delete(value);
		}
	}
}
