
public class Production extends Rank {
	public static int getAverage;
	private int castMembers;
	private int crewMembers;
	private double costOfShow;
	private String producers;
	//default constructor 
	Production() {
		
	}
	//specialized constructor
	Production(int cast, int crew, double cost, String p) {
		castMembers = cast;
		crewMembers = crew;
		costOfShow = cost;
		producers = p;
	}
	public int getCastMembers() {
		return castMembers;
	}
	public void setCastMembers(int castMembers) {
		this.castMembers = castMembers;
	}
	public int getCrewMembers() {
		return crewMembers;
	}
	public void setCrewMembers(int crewMembers) {
		this.crewMembers = crewMembers;
	}
	//cost of show per episode
	public double getCostOfShow() {
		return costOfShow;
	}
	public void setCostOfShow(double costOfShow) {
		this.costOfShow = costOfShow;
	}
	public String getProducers() {
		return producers;
	}
	public void setProducers(String producers) {
		this.producers = producers;
	}
	//This is the average for this class that will be added to the averages of the other classes
	public double getAverage() {
		return ((castMembers + crewMembers + costOfShow)/3);
	}
}
