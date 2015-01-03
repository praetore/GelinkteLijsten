public class LinkedList {
	
	/**
	 * Alleen de gelinkte lijst heeft toegang tot de node
	 */
	private class Node {
		//Dit is de data die je opslaat
		Object data;
		
		// referenties/pijlen naar de eerste en laatste nodes
		Node next, previous;
		
		Node(Object data, Node next, Node prev){
			this.data		= data;
			this.next		= next;
			this.previous	= prev;
		}
		
		Node(Node next, Node prev){ //only inits next and previous
			this.previous 	= prev;
			this.next  		= next;
		}
		
		Node(){}
	}	
	
	private Node first, last;
	private int size;
	
	
	public LinkedList(){
		size = 0;
		
		first = new Node(last, null);
		last  = new Node(null, first);	
		
		first.next = last;
		last.previous = first;
	}
	
	
	Object getFirst(){
		return first.next.data;
	}
	
	
	Object getLast(){
		return last.previous.data;
	}	
	
	/**
	 * Voeg toe aan de voorkant
	 * 
	 */
	void insertFirst(Object o){
		Node oldFirst  = this.first.next;
		
		Node current = new Node(o, oldFirst, this.first);
		oldFirst.previous = current;
		
		this.first.next = current;
		
		size++;
	}

	/**
	 * Voeg toe aan de achterkant
	 */
	void insertLast(Object o){
		Node oldLast  = this.last.previous;
		
		Node current = new Node(o, this.last, oldLast);
		oldLast.next = current;
		
		this.last.previous = current;
		
		size++;
	}
	
	

	
	/**
	 * Verwijder een element
	 * @param data
	 */
	void remove(Object data){
		boolean removed = false;
		
		
		if(removed){
			size--;
		}
	}

	
	Object removeFirst(){
		Node oldFirst = null;
		
		if(first.next != last){
			//Temporarily store all relevant nodes
			oldFirst = this.first.next;
			Node second = this.first.next.next;
			
			//Relay references
			second.previous = first;	
			first.next = second;
			
			//adjust size
			size--;
		}
		
		return oldFirst.data;
	}
	
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
	
	public String toString(){
		return this.print(first.next, last);
	}
	
	
	public String print(Node start, Node end){
		return (start != end)?start.data + ", " + print(start.next, end) : ""; 
	}
}
