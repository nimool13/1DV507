package ns222tv_assign1;


public class Lorry extends Vehicle {
	
    public Lorry (int numberOfPassengers, String registrationPlate)
    {
    	// Validate the plate number. Plate number cannot be null, empty, NO Plate or longer or shorter than 6 characters
    	if(registrationPlate.isEmpty() || registrationPlate == null || registrationPlate == "No Plate" || registrationPlate.length() != 6)
    		throw new IllegalArgumentException("Registration plate is invalid");
    	
    	if(numberOfPassengers < 0 || numberOfPassengers > 2)
    		throw new IllegalArgumentException("Passenger number is invalid");
    	
      	RegistrationPlate = registrationPlate;
    	NumberOfPassengers = numberOfPassengers;
    	Space = 8;
    	PriceForVehicle = 300; 
    	PricePerPassenger = 20;
    }

}
