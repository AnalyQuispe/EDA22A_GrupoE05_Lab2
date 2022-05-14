package Lab_02;

public class List<T> {
	
	private Node<T> root;
	
	public boolean isEmpty() {
		return this.root == null;
	}
	
	public void clear() {
		this.root = null;
	}
	
	public boolean add(T e){
		if (isEmpty())
			this.root = new Node<T>(e);
		
		else {
			add(this.root.getNextNode(), e);
		}
		return true;
	}
	
	private void add(Node<T> tmp, T e) {
		Node<T> aux = tmp.getNextNode();
			
			if(aux == null)
				tmp.setNextNode(new Node<T>(e));
			else {
				add(tmp.getNextNode(), e);
			}
	}
}
