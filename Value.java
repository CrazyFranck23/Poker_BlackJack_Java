// Selon le diagrame de classe

public enum Value {
	AS("A", 1),
	TWO("2", 2),
	THREE("3", 3),
	FOUR("4", 4),
	FIVE("5", 5),
	SIX("6", 6),
	SEVEN("7", 7),
	EIGHT("8", 8),
	NINE("9", 9),
	TEN("10", 10),
	JACK("J", 10),
	QUEEN("Q", 10),
	KING("K", 10);
	
	// Déclaration des attributs privé
	private String symbole;
	private int points;
	
	// Constructeur privé pour initialiser les attributs
	private Value(String symbole, int points) {
		this.symbole = symbole;
		this.points = points;
	}
	
	// Déclaration de leurs accesseurs publique respectif
	public String getSymbole() {
		return symbole;
	}

	public int getPoints() {
		return points;
	}


}
