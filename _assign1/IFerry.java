package ns222tv_assign1;


public interface IFerry {
	
	int CountPassengers();					 // Number of passengers on board
	int CountVehicleSpace(); 				 // Correctly rounded off vehicle space. One car is 1
	int CountMoney(); 						 // Earned money
	Vehicle[] GetAllVehicles();  			 // An array containing all embarked vehicles
	void Embark(Vehicle vehicle); 			 // Embark vehicle. Exception if not enough space
	void Embark(Passenger passenger); 		 //Embark passenger. Exception if not enough room
	void Disembark(); 						 // Clear(Empty) ferry. The money earned remains. i.e is not reset to zero
	boolean HasSpaceFor(Vehicle vehicle); 	 // True if we can embark Vehicle vehicle
	boolean HasRoomFor(Passenger passenger); // True if we can embark Passenger passenger
	String ToString(); 
}