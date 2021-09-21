
public class HousingMarket {
	
	private Homes [] home = new Homes[5];
	
	private int index = 0;
	
	public void add(Homes homes) {
		
		home[index] = homes;
		
		index ++;
		
	}
	
	public Homes [] getHouses() {
		
		return home;
	}

}
