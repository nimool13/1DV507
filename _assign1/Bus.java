package ns222tv_assign1;


public class Bus extends Vehicle{
	
    public Bus (int numberOfPassengers, String registrationPlate)
    {
    	// Validate the plate number. Plate number cannot be null, empty, NO Plate or longer or shorter than 6 characters
    	if(registrationPlate.isEmpty() || registrationPlate == null || registrationPlate == "No Plate" || registrationPlate.length() != 6)
    		throw new IllegalArgumentException("Registration plate is invalid");
    		
    	if(numberOfPassengers < 0 || numberOfPassengers > 20)
    		throw new IllegalArgumentException("Passenger number is invalid");
    	
    	RegistrationPlate = registrationPlate;
    	NumberOfPassengers = numberOfPassengers;
    	Space = 4;
    	PriceForVehicle = 200; 
    	PricePerPassenger = 15;
    }
}
