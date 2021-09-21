
public class Main {

	public static void main(String[] args) {
		
		Homes Duplex = new Homes (1, "Duplex");
		
		Homes Bungalow = new Homes (2, "Bungalow");
		
		Homes RanchStyle = new Homes (3, "Ranch Style");
		
		Homes Villa = new Homes (4, "Villa");
		
		Homes SplitLevel = new Homes (5, "Split-Level");
		
		HousingMarket housingMarket = new HousingMarket();
		
		housingMarket.add(Duplex);
		
		housingMarket.add(Bungalow);
		
		housingMarket.add(RanchStyle);
		
		housingMarket.add(Villa);
		
		housingMarket.add(SplitLevel);
		
		
		System.out.println("Model Homes available on Housing Market: ");
		
		
		HouseIterator iterator = new HouseIterator(housingMarket.getHouses());
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
			}
		
	}

}

