// Selon le diagrame de classe

public enum Value {
	AS(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(10),
	QUEEN(10),
	KING(10);
	
	private int points;

	private Value(int points) {
		//this.symbole = symbole;
		this.points = points;
	}

	public int getPoints() {
		return points;
	}


}
