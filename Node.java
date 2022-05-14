package Lab_02;

public class Node <T>{
	
	private T dato;
	private Node<T> nextNode;
	
	public Node(T e) {
		this.dato = e;
	}
	public T getDato() {
		return dato;
	}
	public void setDato(T dato) {
		this.dato = dato;
	}
	public Node<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
}
