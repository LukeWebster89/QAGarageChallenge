package garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
			
		List<Vehicle> vehicles = new ArrayList<>();
		
		public void addVehicle(Vehicle v) {
			this.vehicles.add(v);
			System.out.println("New vehicle added:\n " + v);
		}
		
		public void printVehicles() {
			System.out.println("Garage List: \n");
			for(Vehicle v : this.vehicles) {
				System.out.println(v);
			}
		}
		
		public void removeVehicleTypes(String vehicleType) {
			// must move types to a separate list then delete from that list
			List<Vehicle> foundType = new ArrayList<>();
			for(Vehicle v : vehicles) {
				if(v.getVehicleType().equalsIgnoreCase(vehicleType)) {
					foundType.add(v);
					}
				
			}
			for(Vehicle v : foundType) {
				vehicles.remove(v);
			}
			System.out.println("All " + vehicleType + "s removed!");
										
		}
		
		public void removeVehicleId(int id) {
			for (Vehicle v : vehicles) {
				if(v.getVehicleID()== id) {
					this.vehicles.remove(v);
				}
			}
			System.out.println("Vehicle number " + id + " removed!");
		}
		
		public void emptyGarage() {
			this.vehicles.clear();
			System.out.println("Garage Empty!");
		}
		
		public void vehicleTypeBill(int id) {
			List<Vehicle> foundType = new ArrayList<>();
			for(Vehicle v : vehicles) {
				if(v.getVehicleID()== id) {
					foundType.add(v);
					}															
			}
			
			for(Vehicle v : foundType) {
				if(v.getVehicleType().equalsIgnoreCase("car")){
					
					System.out.println(v + "Your bill is: $200");
					} else if(v.getVehicleType().equalsIgnoreCase("motorbike")){
						System.out.println(v + "Your bill is $100");
					}
					else {
						System.out.println(v + "Your bill is $250");
					}
			}
		}
		
		
		
				
		

}
