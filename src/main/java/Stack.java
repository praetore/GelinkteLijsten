


/**
 * De stapel, of eigenlijk 'Stack', is ook een 
 * klassieke datastructuur.
 * In [Hubbard, Hoofdstuk 5] wordt de Stack besproken. 
 * Niet te veel spieken, daar leert u immers minder van. 
 * 
 * In deze klasse implementeer je zelf een Stack, door alleen 
 * maar gebruik te maken van de opslag methode die de 
 * klasse GelinkteLijst je biedt. De Node komt in deze
 * klasse niet voor.
 */
public class Stack {
	private LinkedList list;
	
	public Stack(){
		list = new LinkedList();
	}
	
	/**
	 * Zet een object boven op de stapel
	 * @param object
	 */
	void push(Object object){
		list.insertFirst(object);		
	}
	
	
	/**
	 * Haalt het bovenste object van de stapel
	 * LIFO: Last-in, First-out
	 * @return het bovenste object
	 */
	Object pop(){
		Object result = list.getFirst() ;
		list.removeFirst();
		return result;
	}
	
	/**
	 * Geeft het bovenste object terug, maar 
	 * laat het op de stapel staan.
	 * @return
	 */
	Object front(){
		return list.getFirst();
	}

	/**
	 * Geeft 'true' als er niks op de stapel ligt.
	 * @return
	 */
	boolean isEmpty(){
		return list.getSize() == 0;
	}
	
	public String toString(){
		return list.toString();
	}
}
