package builder.example.car.product;

import builder.example.car.builder.Builder;
import builder.example.car.components.*;
import builder.example.car.constants.CarType;

public class CarManual {
	private final CarType carType;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;
	
	public CarManual(Builder builder) {
		this.carType = builder.getCarType();
		this.seats = builder.getSeats();
		this.engine = builder.getEngine();
		this.transmission = builder.getTransmission();
		this.tripComputer = builder.getTripComputer();
		this.gpsNavigator = builder.getGPSNavigator();
	}

	public String getManual() {
		String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
	}
}
