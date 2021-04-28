import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Justin
 *
 */
public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle test = new Vehicle("Honda", "CRV", "White", 2017);
		
		Car myCar = new Car("Honda", "Accord", "Green", 2005, false, 4);
		
		Car anotherCar = new Car("Tesla", "Model S", "Black", 2017, true, 4);
		
		Bus schoolBus = new Bus("Blue Bird", "Vision Gasoline", "Yellow", 2015, true, false, 54);
		
		Motorcycle coolBike = new Motorcycle("Yamaha", "YZF-R6", "Blue and White", 2018, false, "Supersport");
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		vehicles.add(test);
		vehicles.add(myCar);
		vehicles.add(anotherCar);
		vehicles.add(schoolBus);
		vehicles.add(coolBike);
		
		for (Vehicle body: vehicles){
			System.out.println(body);
			System.out.println(body.showMyRide()  );
		}

	}

}
