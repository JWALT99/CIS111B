/**
 * 
 */

/**
 * @author Justin
 *
 */
public class Car extends Vehicle {
	private boolean isBatteryPowered;
	private int numDoors;
	
	/**
	 * @param make
	 * @param model
	 * @param color
	 * @param year
	 * @param isBatteryPowered
	 * @param numDoors
	 */
	
	public Car(String make, String model, String color, int year, boolean isBatteryPowered, int numDoors) {
		super(make, model, color, year);
		this.isBatteryPowered = isBatteryPowered;
		this.numDoors = numDoors;
	}

	/**
	 * @return the isBatteryPowered
	 */
	public boolean isBatteryPowered() {
		return isBatteryPowered;
	}

	/**
	 * @param isBatteryPowered the isBatteryPowered to set
	 */
	public void setBatteryPowered(boolean isBatteryPowered) {
		this.isBatteryPowered = isBatteryPowered;
	}

	/**
	 * @return the numDoors
	 */
	public int getNumDoors() {
		return numDoors;
	}

	/**
	 * @param numDoors the numDoors to set
	 */
	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [isBatteryPowered=" + isBatteryPowered + ", numDoors=" + numDoors + "]";
	}
	
	public  String showMyRide()
	{
		
		String answer;
		
		if(isBatteryPowered == true)
			answer = "I drive in my very cool battery powered car!";
		else
			answer = "I drive in my car.";
		
		return answer;
	
	}
	
	
	

}
