package ProgramacionIII.tp1;

public class Pile<T> {

	private MySimpleLinkedList<T> list;
	
	public Pile() {
		this.list = new MySimpleLinkedList<T>();	
	}
	
	public void push(T o) {
		this.list.insertFront(o);
	}
	
	public T pop() {
		return this.list.extractFront();
	}
	
	public T top() {
		return this.list.get(0);
	}
	
	public void reverse() {
		MySimpleLinkedList<T> aux = new MySimpleLinkedList<T>();
		while(aux.size()<this.list.size()) {
			aux.insertFront(this.list.extractFront());
		}
		this.list = aux;
	}
}
