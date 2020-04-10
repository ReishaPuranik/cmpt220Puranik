//class for a single card
class singleCard {
	private String face, suit;
	public singleCard(String f, String s) {
		face = f;
		suit = s;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	@Override
	public String toString() {
		return face + " of " + suit;
	}
}
//class for a whole deck of cards
public class Deck {
	private singleCard[] cards;
	private static final String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
	private static final String[] faces = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	public Deck() {
		cards = new singleCard[52];
		int c = 0;
		for (int i = 0; i<4; i++) {
			for (int j = 0; j<13; j++) {
				cards[c++] = new singleCard(faces[j], suits[i]);
			}
		}
	}
	public void display() {
		for (int i = 0; i<cards.length; i++) {
			System.out.println(cards[i]);
		}
	}
	public static void main(String[] args) {
		Deck d = new Deck();
		d.display();
	}
}