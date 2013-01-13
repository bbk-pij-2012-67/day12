public class DBLinkedList<T> implements LinkedList<T>{
	
	private T nextNode;
	private T previousNode;
	
	public void add(T newNode){
		if(this.nextNode == null){
			this.nextNode = newNode;
			newNode.previousNode = this;
		}else{
			this.nextNode.add(newNode);
		}
	}
	
	public boolean delete(T node){
		if(this.nextNode == null){
			return false;//not found
		}else if(this.nextNode.toString().equals(node.toString())){
			//found
			this.nextNode = nextNode.nextNode;
			this.nextNode.previousNode = this;
			return true;
		}else{
			return this.nextNode.delete(node);
		}
	}
}
