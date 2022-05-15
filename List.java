package Lab_02;

public class List<T> {
	
	private Node<T> root;
	private int contador = 0;

	public boolean isEmpty() {
		return this.root == null;
	}
	
	public void clear() {
		this.root = null;
	}

	public void add(T elemento){ //para añadir al final

		Node<T> nodo = new Node<T>(elemento);

		if (root == null)
			root = nodo;
		else{

			Node<T> puntero = root;

			while(puntero.getNextNode() != null)
				puntero = puntero.getNextNode();

			puntero.setNextNode(nodo);
		}
		contador++;
	}

	public void add(int indice, T elemento){

		Node<T> nodo = new Nodo<N>(elemento);
		Node<T> puntero = root;
	}
	
}
