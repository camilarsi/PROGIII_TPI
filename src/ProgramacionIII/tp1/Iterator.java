package ProgramacionIII.tp1;


public class Iterator implements java.util.Iterator<Object>{

	private Node iterator;
	
	public Iterator(Node iterator) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasNext() {
		return this.iterator != null;
	}

	@Override
	public Object next() {
		Node toReturn = this.iterator;
		this.iterator = this.iterator.getNext();
		return toReturn;
	}
	
	public void setIterador(Node other) {
		this.iterator = other;
	}

	
	//computational complexity is lower with Iterable-Iterator pattern: O(1) Vs O(n) to iterate list without it.
}
