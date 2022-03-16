package builder.example.car.director;

import builder.example.car.builder.Builder;
import builder.example.car.components.*;
import builder.example.car.constants.CarType;
import builder.example.car.product.Car;

public class Director {
	public void constructSportsCar(Builder<Car> builder) {
        builder.carType(CarType.SPORTS_CAR);
        builder.seats(2);
        builder.engine(new Engine(3.0, 0));
        builder.transmission(Transmission.SEMI_AUTOMATIC);
        builder.tripComputer(new TripComputer());
        builder.gpsNavigator(new GPSNavigator(""));
    }

    public void constructCityCar(Builder<Car> builder) {
        builder.carType(CarType.CITY_CAR);
        builder.seats(2);
        builder.engine(new Engine(1.2, 0));
        builder.transmission(Transmission.AUTOMATIC);
        builder.tripComputer(new TripComputer());
        builder.gpsNavigator(new GPSNavigator(""));
    }

    public void constructSUV(Builder<Car> builder) {
        builder.carType(CarType.SUV);
        builder.seats(4);
        builder.engine(new Engine(2.5, 0));
        builder.transmission(Transmission.MANUAL);
        builder.gpsNavigator(new GPSNavigator(""));
    }
}
