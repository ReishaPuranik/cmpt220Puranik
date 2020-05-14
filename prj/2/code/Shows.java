
public class Shows extends Rank {
	public static int getAverage;
	private String nameOfShows;
	private double numOfViewers;
	private String streamingService;
	//default constructor
	Shows() {
		
	}
	//Specialized constructor
	Shows(String nameS, double v, String streaming) {
		nameOfShows = nameS;
		numOfViewers = v;
		streamingService = streaming;
	}
	//name of the show as a string
	public String getNameOfShows() {
		return nameOfShows;
	}
	public void setNameOfShows(String nameOfShows) {
		this.nameOfShows = nameOfShows;
	}
	//number of viewers per episode
	public double getNumOfViewers() {
		return numOfViewers;
	}
	public void setNumOfViewers(int numOfViewers) {
		this.numOfViewers = numOfViewers;
	}
	public String getStreamingService() {
		return streamingService;
	}
	public void setStreamingService(String streamingService) {
		this.streamingService = streamingService;
	}
	//This will be used for calculating the average since number of viewers is the only number in this class
	public double getAverage() {
		return numOfViewers;
	}
	
}
