package garage;

public class Vehicle {
	
	String make;
	String model;
	String vehicleType;
	int vehicleID;
	
	public Vehicle(String make, String model, String vehicleType, int vehicleID) {
		super();
		this.make = make;
		this.model = model;
		this.vehicleType = vehicleType;
		this.vehicleID = vehicleID;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public double getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", vehicleType=" + vehicleType + ", vehicleID="
				+ vehicleID + "]";
	}

	

	
	
}
