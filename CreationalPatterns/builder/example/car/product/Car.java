package builder.example.car.product;

import builder.example.car.builder.Builder;
import builder.example.car.components.*;
import builder.example.car.constants.CarType;

public class Car {
	private final CarType carType;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;
	private double fuel;
	
	public Car(Builder builder) {
		this.carType = builder.getCarType();
		this.seats = builder.getSeats();
		this.engine = builder.getEngine();
		this.transmission = builder.getTransmission();
		this.tripComputer = builder.getTripComputer();
		this.gpsNavigator = builder.getGPSNavigator();
		this.fuel = 100;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public CarType getCarType() {
		return carType;
	}

	public int getSeats() {
		return seats;
	}

	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public TripComputer getTripComputer() {
		return tripComputer;
	}

	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}
}
