
public class Averages {
	public double totalAverages() {
		//adds all the averages from each class to get the total average
		double totalAvg = Shows.getAverage + Production.getAverage + Genre.getAverage;
		return totalAvg;
	}
	public static int getRank(Rank x) {
		//returns the total average to get the overall ranking for each show
		return x.totalAvg;
	}
	public static void main(String[] args) {
		//Initializing the constructors for show 1
		Shows show1 = new Shows("Friends", 23000000.0, "Cable Tv"); new Production(815, 520, 10000000.0, "James Burrows and Scott Silveri"); new Genre(1, 100);
		System.out.println("Friends: the average ranking of this show's qualities is " + getRank(show1));
		
		//Initializing the constructors for show 2
		Shows show2 = new Shows("Game of Thrones", 44200000.0, "HBO"); new Production(832, 9683, 10000000.0, "David Benioff, D.B Weiss, etc"); new Genre(2, 50);
		System.out.println("Game of Thrones: the average ranking of this show's qualities is " + getRank(show2));
		
		//Initializing the constructors for show 3
		Shows show3 = new Shows("Grey's Anatomy", 8000000.0, "Cable TV"); new Production(2977, 2236, 575000.0, "Shonda Rhimes and more"); new Genre(2, 50);
		System.out.println("Grey's Anatomy: the average ranking of this show's qualities is " + getRank(show3));
		

	}

}