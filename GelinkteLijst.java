package gelinkteLijsten;

public class GelinkteLijst {


	
	private Node first, last;
	private int size;
	
	public GelinkteLijst(){
	}
	
	
	Node getFirst(){
		return first;
	}
	
	Node getLast(){
		return last;
	}	
	
	/**
	 * Voeg toe aan de voorkant
	 */
	void insertFirst(Object o){}

	/**
	 * Voeg toe aan de achterkant
	 */
	void insertLast(Object o){}
	
	/**
	 * Voeg toe voor een ander element
	 */
	void insertBefore(Object o, Object before){}
	
	/**
	 * Voeg toe na een ander element
	 */
	void insertAfter(Object o, Object after){}

	
	/**
	 * Verwijder een element
	 * @param data
	 */
	void remove(Object data){}
	
	/**
	 * 
	 * @param current
	 * @return
	 */
	boolean isFirst(Node current){
		return false; //dummy
	}
	
	
	/**
	 * 
	 * @param current
	 * @return
	 */
	boolean isLast(Node current){
		return false; //dummy	
	}
	
	
	/**
	 * Het aantal elementen in de gelinkte lijst
	 * @return
	 */
	int getSize(){
		return size;
	}
	
	/**
	 * Set size
	 * @return
	 */
	protected int setSize(){
		return size;
	}
}
