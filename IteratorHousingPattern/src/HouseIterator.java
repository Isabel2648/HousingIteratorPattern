
public class HouseIterator implements Iterator{
	
	private Homes [] homes;
	private int index = 0;
	
	public HouseIterator(Homes[] homes) {
		
		this.homes = homes;
	}
	
	public boolean hasNext() {
		if(index >= homes.length || homes[index]==null) {
			return false;
		}
		
		return true;
	}
	
	public Homes next() {
		return homes[index ++];
	}
	
	public void remove() {
		
		for (int i = index-1; i<homes.length-1; i++) {
			homes[i] = homes[+1];
		}
		
		homes[homes.length-1] = null;
	
	}

}
