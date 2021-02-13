package ISL;

public class ISLMain  implements Comparable<ISLMain>{
	private int position;
	private String club;
	private int played;
	private int won;
	private int lost;
	private int drawn;
	private int points;
	
	public ISLMain(int position, String club, int played, int won, int lost, int drawn, int points) {
		this.position = position;
		this.club = club;
		this.played = played;
		this.won = won;
		this.lost = lost;
		this.drawn = drawn;
		this.points = points;
	}
	
	public String toString() {
		return String.format("%-5d%-30s%10d%10d%10d%10d", position, club, played, won,lost, points);
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public String getClub() {
		return club;
	}
	
	public void setClub(String club) {
		this.club = club;
	}
	
	public int getPlayed() {
		return position;
	}
	
	public void setPlayed(int played) {
		this.played = played;
	}
	
	public int getWon() {
		return won;
	}
	
	public void setWon(int won) {
		this.won = won;
	}
	
	public int getLost() {
		return lost;
	}
	
	public void setLost(int lost) {
		this.lost = lost;
	}
	
	public int getDrawn() {
		return drawn;
	}
	
	public void setDrawn(int drawn) {
		this.drawn = drawn;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public int compareTo(ISLMain islMain) {
		return ((Integer) points).compareTo(islMain.points);
	}
}
