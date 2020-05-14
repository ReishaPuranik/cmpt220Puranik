
public class Genre extends Rank {
	public static int getAverage;
	private int numOfGenres;
	private int involvementOfGenre;
	//default constructor
	Genre() {
		
	}
	//specialized constructor
	Genre(int genres, int involvement) {
		numOfGenres = genres;
		involvementOfGenre = involvement;
	}
	public int getNumOfGenres() {
		return numOfGenres;
	}
	public void setNumOfGenres(int numOfGenres) {
		this.numOfGenres = numOfGenres;
	}
	//in percent
	public int getInvolvementOfGenre() {
		return involvementOfGenre;
	}
	public void setInvolvementOfGenre(int involvementOfGenre) {
		this.involvementOfGenre = involvementOfGenre;
	}
	//this is the average of this class that will be added to the average of other classes
	public double getAverage() {
		return ((numOfGenres + involvementOfGenre)/2);
	}
}
