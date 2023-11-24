
public class Card {
	// Déclaration d'attributs
	private Color color; // Nom d'attribut = "color" de type "Color (un enum)" (type nom_attr;)
	private Value value;
	
	public Card(Value value, Color color) {
		this.color=color;
		this.value=value;
	}
	
	public String getColorSymbole() {
		return color.getSymbole();
	}
	
	public String getColorName() {
		return color.name();
	}
	
	public String getValueSymbole() {
		return value.getSymbole();
	}
	
	public int getPoints() {
		return value.getPoints();
	}

} 
