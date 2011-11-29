package gelinkteLijsten;

/**
 * Een wachtrij (queue) werkt via het 
 * first-in first-out principe;elementen worden toegevoegd 
 * aan de achterkant en verwijdert aan de voorkant.
 * 
 * In deze klasse implementeer je een Queue door alleen 
 * maar gebruik te maken van de opslag methode die de 
 * klasse GelinkteLijst je biedt.
 * 
 * In [Hubbard, hoofdstuk 6] wordt de Queue besproken.
 * 
 * @author Youri 
 *
 */
public class Wachtrij extends GelinkteLijst {
	/**
	 * Zet iets in de wachtrij
	 * aan de achterkant: FIFO
	 */
	void enqueue(Object o){}
	
	/**
	 * Haal iets van de wachtrij
	 * Aan de voorkant: FIFO
	 */
	void dequeue(){}
	
	/**
	 * Het aantal elementen in de wachtrij
	 * @return
	 */
	int size(){return 0;}
	
	/**
	 * Is de lijst leeg?
	 * @return
	 */
	boolean isEmpty(){return false;}
	
	/**
	 * Bekijk het eerste element in de wachtrij, 
	 * maar haalt het niet er vanaf. 
	 * Note: het eerste element is als eerste toegevoegd.
	 * @return
	 */	
	Object front(){return new Object();}
}
