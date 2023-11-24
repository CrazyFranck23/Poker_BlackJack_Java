public class BlackJackConsole {
	
	public BlackJackConsole() {
		System.out.println("\nWelcome to the BlackJack Table. Let's play !\n\n");
		
		// This is an array of two cards
		Card[] tab = {new Card(Value.TWO, Color.HEART), new Card(Value.JACK, Color.SPADE)}; // Creation d'un tableau appeler "tab" de type "Card"
		for (Card c : tab) { // For each card - On parcour en fait
		    System.out.println("This card is a "+c+ " worth "+c.getPoints()+ " points");
		    System.out.print("It's a ");

		    switch (c.getColorSymbole()) {
			case "♥": System.out.print("heart");
			break;
			case "♠": System.out.print("spade");
			break;
			case "♣": System.out.print("club");
			break;
			case "♦": System.out.print("diamond");
			break;
		    }

		    if (c.getValueSymbole().matches("[JQK]")) { // Is the value symbole a J or a Q or a K ?
			System.out.println(" and a face !");
		    }
		    else {
			System.out.println(" and it's not a face.");
		    }
		}
	}
	
	public static void main(String [] args) {
		new BlackJackConsole();
	}
}
