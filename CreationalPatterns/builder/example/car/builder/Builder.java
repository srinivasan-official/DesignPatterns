package builder.example.car.builder;

import builder.example.car.constants.CarType;
import builder.example.car.product.Car;
import builder.example.car.components.*;

public interface Builder<T> {
	Builder<T> carType(CarType type);
	Builder<T> seats(int seats);
	Builder<T> engine(Engine engine);
	Builder<T> transmission(Transmission transmission);
	Builder<T> tripComputer(TripComputer tripComputer);
	Builder<T> gpsNavigator(GPSNavigator gpsNavigator);
    CarType getCarType();
    int getSeats();
    Engine getEngine();
    Transmission getTransmission();
    TripComputer getTripComputer();
    GPSNavigator getGPSNavigator();
    T build();
}
