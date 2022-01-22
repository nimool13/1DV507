package ns222tv_assign1;

import java.util.ArrayList;

public class Ferry implements IFerry {
	
    final int PricePerPassenger = 25;
	final int MaxNumberOfPassengers = 200;
	final int MaxSpaceForVehicles = 40;
	int NumberOfPassengersOnBoard;
	double SpaceOccupiedByVehiclesOnBoard;
	ArrayList<Vehicle> VehiclesOnBoard = new ArrayList<Vehicle>();
	ArrayList<Passenger> PassengersOnBoard = new ArrayList<Passenger>();
	ArrayList<String> RegistrationPlates = new ArrayList<String>();
	
	@Override
	public int CountPassengers() {
		
		int totalNumberOfPassengers = 0;
		
		totalNumberOfPassengers += PassengersOnBoard.size();
		
		for (Vehicle vehicle : VehiclesOnBoard) 
		{ 
			totalNumberOfPassengers += vehicle.NumberOfPassengers;
		}
		
		return totalNumberOfPassengers;
	}
	
	

	@Override
	public int CountVehicleSpace() {
		
	int totalOccupiedSpace = 0;
		
	for (Vehicle vehicle : VehiclesOnBoard) 
	{ 
	    totalOccupiedSpace += vehicle.Space;
	}
		
		return totalOccupiedSpace;
	}

	
	
	@Override
	public int CountMoney() {
	
		int totalSum = 0;
		
        totalSum = PassengersOnBoard.size() * PricePerPassenger;
        
    	for (Vehicle vehicle : VehiclesOnBoard) 
    	{ 
    		totalSum += vehicle.PriceForVehicle + vehicle.NumberOfPassengers * vehicle.PricePerPassenger;
    	}
    	
    	return totalSum;
	}

	@Override
	public Vehicle[] GetAllVehicles() {
			
	 return VehiclesOnBoard.toArray(new Vehicle[VehiclesOnBoard.size()]); 
		 
	}

	@Override
	public void Embark(Vehicle vehicle) {
		
		if(vehicle.RegistrationPlate != "No Plate" && RegistrationPlates.contains(vehicle.RegistrationPlate))
		{
		    System.out.println("The vehicle is already embarked");
		}
		
		else if(HasSpaceFor(vehicle) && NumberOfPassengersOnBoard + vehicle.NumberOfPassengers <= MaxNumberOfPassengers)
		{
			VehiclesOnBoard.add(vehicle);
			SpaceOccupiedByVehiclesOnBoard += vehicle.Space;
		    NumberOfPassengersOnBoard += vehicle.NumberOfPassengers;
		    RegistrationPlates.add(vehicle.RegistrationPlate);
		}
		
		else
		    System.out.println("Not enough space for this vehicle or not enough room for its passengers");
		
	}

	@Override
	public void Embark(Passenger passenger) {
		
		if(HasRoomFor(passenger))
		{
			PassengersOnBoard.add(passenger);
		    NumberOfPassengersOnBoard +=1;				
		}
		
		else
		    System.out.println("There is no room for a passenger");
	}

	@Override
	public void Disembark() {
		NumberOfPassengersOnBoard = 0;
		SpaceOccupiedByVehiclesOnBoard = 0;
		VehiclesOnBoard.clear();
		PassengersOnBoard.clear();	
		RegistrationPlates.clear();
	}

	@Override
	public boolean HasSpaceFor(Vehicle vehicle) 
	{
		if(SpaceOccupiedByVehiclesOnBoard + vehicle.Space <= 40)
			return true;
		else
			return false;
	}

	@Override
	public boolean HasRoomFor(Passenger passenger) {
		
		if(NumberOfPassengersOnBoard < 200)
			return true;
		else
			return false;
	}

	@Override
	public String ToString() {
					
		int numberOfBicycles = 0, numberOfBuses=0, numberOfCars=0, numberOfLorries = 0;
				
    	for (Vehicle vehicle : VehiclesOnBoard) 
    	{ 
    		if(vehicle instanceof Bicycle)
    			numberOfBicycles++;
    		if(vehicle instanceof Car)
    			numberOfCars++;
     		if(vehicle instanceof Bus)
     			numberOfBuses++;
      		if(vehicle instanceof Lorry)
      			numberOfLorries++;
    	}
    	
    	String ferryStatus = "Total number of passengers: " + NumberOfPassengersOnBoard + "\n";
		ferryStatus += "Total number of vehicles: " + VehiclesOnBoard.size() + "\n";	
    	ferryStatus += "Total number of Bicycles: " + numberOfBicycles + "\n";
    	ferryStatus += "Total number of Cars: " + numberOfCars + "\n";
    	ferryStatus += "Total number of Buses: " + numberOfBuses + "\n";
    	ferryStatus += "Total number of Lorries: " + numberOfLorries + "\n";
    	ferryStatus += "Total money earned: " + CountMoney();
    	
    	return ferryStatus;   		
	}

}
