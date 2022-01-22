package ns222tv_assign1;

public class FerryMain {

			public static void main(String[] args) {
			
			Ferry ferry = new Ferry();
			
			Bicycle bicycle1 = new Bicycle();
			Car car2 = new Car(3, "MLA846");
			Car car1 = new Car(3, "MLA848");
			Car car3 = new Car(3, "MLA847");
			Bus bus1 = new Bus(15,"KVF523");
			Bus bus2 = new Bus(18,"KVF524");
			Lorry lorry1 = new Lorry(2,"RTX231");
			Lorry lorry2 = new Lorry(2,"RTX232");
		//	Lorry lorry3 = new Lorry(2,"RTX233");
		//	Lorry lorry4 = new Lorry(2,"RTX234");
			Passenger passenger = new Passenger("Nimool tala");
			
			ferry.Embark(bicycle1);
			ferry.Embark(car1);
			ferry.Embark(car2);
			ferry.Embark(car3);
			ferry.Embark(bus1);
			ferry.Embark(bus2);
			ferry.Embark(lorry1);
			ferry.Embark(lorry2);
			//ferry.Embark(lorry3);
			//ferry.Embark(lorry4);
			ferry.Embark(passenger);
			
			
			System.out.println("Ferry status is " + ferry.ToString());
		    
			ferry.Disembark();
			}
}