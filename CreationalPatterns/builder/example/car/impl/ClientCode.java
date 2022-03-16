package builder.example.car.impl;

import builder.example.car.builder.Builder;
import builder.example.car.builder.impl.CarBuilder;
import builder.example.car.builder.impl.CarManualBuilder;
import builder.example.car.components.Engine;
import builder.example.car.components.GPSNavigator;
import builder.example.car.components.Transmission;
import builder.example.car.components.TripComputer;
import builder.example.car.constants.CarType;
import builder.example.car.director.Director;
import builder.example.car.product.Car;
import builder.example.car.product.CarManual;

public class ClientCode {

	public static void main(String[] args) {
		Builder<Car> builder = new CarBuilder();
		Car car = builder.carType(CarType.SPORTS_CAR)
				.seats(2)
				.engine(new Engine(3.0, 0))
				.transmission(Transmission.SEMI_AUTOMATIC)
				.tripComputer(new TripComputer())
				.gpsNavigator(new GPSNavigator("")).build();
		
		Director director = new Director();
		builder = new CarBuilder();
		director.constructCityCar(builder);
		car = builder.build();
		
		Builder<CarManual> manualBuilder = new CarManualBuilder();
		CarManual carManual = manualBuilder.carType(CarType.SPORTS_CAR)
				.seats(2)
				.engine(new Engine(3.0, 0))
				.transmission(Transmission.SEMI_AUTOMATIC)
				.tripComputer(new TripComputer())
				.gpsNavigator(new GPSNavigator("")).build();
		System.out.println(carManual.getManual());
	}

}
