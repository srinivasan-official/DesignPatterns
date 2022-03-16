package builder.example.house.implementation;

import builder.example.house.components.Garage;
import builder.example.house.components.Garden;
import builder.example.house.components.SwimmingPool;
import builder.example.house.product.House;

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
