package garage;

public class Runner {

	public static void main(String[] args) {
		Cars audi = new Cars("Audi", "A8", "Car", 1, "Hatchback", 5, false);  
		Motorbikes yamaha = new Motorbikes("Yamaha", "YZF-R125", "Motorbike", 2, 125, "Sports");
		Vans ford = new Vans("Ford", "Transit", "Van", 3, 6, 15.1);
		
		Garage g = new Garage();
		
		g.addVehicle(audi);
		g.addVehicle(yamaha);
		g.addVehicle(ford);
		
		g.vehicleTypeBill(3);
			
		
//		g.printVehicles();
		
//		g.emptyGarage();
		
//		g.removeVehicleId(2);
//		
//		System.out.println("===========================");
//		
//		g.printVehicles();

	}

}
