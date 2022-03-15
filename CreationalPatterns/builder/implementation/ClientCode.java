package builder.implementation;

import builder.product.Garage;
import builder.product.Garden;
import builder.product.House;
import builder.product.SwimmingPool;

public class ClientCode {
	
	public static void main(String[] args) {
		ClientCode client = new ClientCode();
		client.buildHouse();
		client.buildHouseWithGarageAndGarden();
		client.buildHouseWithSwimmingPool();
	}
	
	public void buildHouse() {
		House hosue = House.builder()
				.walls(4)
				.doors(1)
				.windows(2)
				.roof(1).build();
	}
	
	public void buildHouseWithGarageAndGarden() {
		House hosue = House.builder()
				.walls(4)
				.doors(1)
				.windows(2)
				.roof(1)
				.garage(new Garage("Car parking"))
				.garden(new Garden(50)).build();
	}
	
	public void buildHouseWithSwimmingPool() {
		House hosue = House.builder()
				.walls(4)
				.doors(1)
				.windows(2)
				.roof(1)
				.swimmingPool(new SwimmingPool(5, 7)).build();
	}
}
