
/**
 * In deze opdracht verken je het generieke karakter van de gelinkte datastructuur.
 * Daarvoor programmeer je eerst de klasse 'GelinkteLijst'. Deze klasse is abstract.
 * De Klasses Stapel en Wachtrij implementeren de GelinkteLijst. 
 * 
 * - Zorg dat je criteria opstelt (zoals we in les 2 gedaan hebben) en beschrijf 
 *   dit in de javadoc bij elke methode.
 * - Aan de hand van de criteria controleer je of de opdracht correct werkt.
 * - Implementeer tot slot de klasse App. Deze is bedoeld om de werking van 
 *   verschillende klassses te demonstreren.
 * 
 * @author youritjang
 *
 */

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//----------------------------------------
		// Gelinkte lijst test
		LinkedList list = new LinkedList();
		
		list.insertFirst("H");
		list.insertFirst("o");
		list.insertFirst("i");
		
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);

		list.removeFirst();
		System.out.println(list);
		
		list.removeFirst();

		System.out.println(list);
		
		//----------------------------------------
		// Stapel test
		Stack s = new Stack();
		s.push("D");
		s.push("a");
		s.push("g");
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
