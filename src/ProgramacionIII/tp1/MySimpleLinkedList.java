package ProgramacionIII.tp1;

public class MySimpleLinkedList<T> {

	private Node<T> first;
	private int size;
	
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size++;
	}
	
	public T extractFront() {
		//check that the list is not empty ...
		if(!this.isEmpty()) {
			T aux = this.first.getInfo();
			
			//check there is a next element of the first 
			if(this.first.getNext()!=null) {
				
				//set first as the next one of current first
				this.first = this.first.getNext();
			}
			
			// update list size
			this.size --;
			
			//return the deleted element 
			return aux;
		}
		// ... if the list is empty return null
		return null;
	}

	public boolean isEmpty() {
		
		//if there is not a first element, the list is empty
		return (this.first == null);
	}
	
	public T get(int index) {
		if(!this.isEmpty()) {
			int aux = 0; 
			Node<T> tmp = this.first;
			while(aux<index) {
				if(tmp.getNext()!=null) {
					tmp = tmp.getNext();
					aux++;
				}
			}
		return tmp.getInfo();
		}
		return null;
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		if(!this.isEmpty()) {
			Node<T> tmp = this.first;
			String result = this.first.toString();
			while(tmp!=null) {
				result+= tmp.toString();
				tmp = tmp.getNext();
			}
			return result;
		}
		return null;
	}
}
