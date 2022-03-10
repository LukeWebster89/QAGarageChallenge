package garage;

public class Motorbikes extends Vehicle {
	
	int engine;
	String bikeType;
	
	public Motorbikes(String make, String model, String vehicleType, int vehicleID, int engine, String bikeType) {
		super(make, model, vehicleType, vehicleID);
		this.engine = engine;
		this.bikeType = bikeType;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public String getBikeType() {
		return bikeType;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}

	@Override
	public String toString() {
		return "Motorbikes: make=" + make + ", model=" + model + ",engine=" + engine + 
				", bikeType=" + bikeType + ", vehicleType=" + vehicleType + ", vehicleID=" + vehicleID + "\n";
	}
	

	
}
