package Lab_02;

public class List<T> {
	
	private Node<T> root;
	private int contador=0;
	
	public boolean isEmpty() {
		return this.root == null;
	}
	
	public void clear() {
		this.root = null;
	}
	
	public List<T> subList(int fromIndex, int toIndex){
		List<T> subList = new List<T>();
		Node<T> aux = this.root;
		for (int i = 1; i< toIndex; i++) {
			if (i >= fromIndex)
				subList.add(aux);
			aux = aux.getNextNode();
		}
		return subList;
	}
	
	public int size () {
		return contador;
	}
	
	public <T extends Comparable> void remove(T e) {
		Node <T> raiz = (Node<T>) this.root;
		Node <T> aux = (Node<T>) this.root;
		boolean indicador = true;
		while(indicador) {
			if (raiz.getDato().compareTo(e) == 0)
				this.root = this.root.getNextNode();
			else if (aux.getNextNode().getDato().compareTo(e) == 0) {
				aux.setNextNode(aux.getNextNode());
				indicador = false;
			}
			aux = aux.getNextNode();
		}
	}
}
