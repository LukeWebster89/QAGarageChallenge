package garage;

public class Cars extends Vehicle{
	
	String carType;
	int numSeats;
	boolean manual;
	
	public Cars(String make, String model, String vehicleType, int vehicleID, String carType, int numSeats,
			boolean manual) {
		super(make, model, vehicleType, vehicleID);
		this.carType = carType;
		this.numSeats = numSeats;
		this.manual = manual;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}

	@Override
	public String toString() {
		return "Cars: make=" + make + ", model=" + model + ", carType=" + carType + ", numSeats=" + numSeats + 
				", manual=" + manual + ", vehicleType=" + vehicleType + ", vehicleID=" + vehicleID + "\n";
	}
	
	

	
	

}
