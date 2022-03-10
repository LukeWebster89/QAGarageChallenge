package garage;

public class Vans extends Vehicle{
	
	int numSeats;
	double capacity;
	
	public Vans(String make, String model, String vehicleType, int vehicleID, int numSeats, double capacity) {
		super(make, model, vehicleType, vehicleID);
		this.numSeats = numSeats;
		this.capacity = capacity;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Vans: make=" + make + ", model=" + model + ", Seats=" + numSeats + ", capacity=" + capacity + 
				 ", vehicleType=" + vehicleType + ", vehicleID=" + vehicleID + "\n";
	} 

	
}
