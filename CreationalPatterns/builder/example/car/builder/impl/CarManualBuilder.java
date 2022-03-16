package builder.example.car.builder.impl;

import builder.example.car.builder.Builder;
import builder.example.car.components.Engine;
import builder.example.car.components.GPSNavigator;
import builder.example.car.components.Transmission;
import builder.example.car.components.TripComputer;
import builder.example.car.constants.CarType;
import builder.example.car.product.CarManual;

public class CarManualBuilder implements Builder<CarManual> {
	private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
	
    @Override
    public CarType getCarType() {
		return carType;
	}
	
    @Override
    public int getSeats() {
		return seats;
	}
	
    @Override
    public Engine getEngine() {
		return engine;
	}
	
    @Override
    public Transmission getTransmission() {
		return transmission;
	}
	
    @Override
    public TripComputer getTripComputer() {
		return tripComputer;
	}
	
    @Override
    public GPSNavigator getGPSNavigator() {
		return gpsNavigator;
	}

	@Override
	public Builder carType(CarType carType) {
		this.carType = carType;
		return this;
	}

	@Override
	public Builder seats(int seats) {
		this.seats = seats;
		return this;
	}

	@Override
	public Builder engine(Engine engine) {
		this.engine = engine;
		return this;
	}

	@Override
	public Builder transmission(Transmission transmission) {
		this.transmission = transmission;
		return this;
	}

	@Override
	public Builder tripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
		return this;
	}

	@Override
	public Builder gpsNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
		return this;
	}

	@Override
	public CarManual build() {
		return new CarManual(this);
	}
}
