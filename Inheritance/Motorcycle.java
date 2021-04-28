/**
 * 
 */

/**
 * @author Justin
 *
 */
public class Motorcycle extends Vehicle {
	private boolean hasSidecar;
	private String cycleType;
	
	/**
	 * @param make
	 * @param model
	 * @param color
	 * @param year
	 * @param hasSidecar
	 * @param cycleType
	 */
	
	public Motorcycle(String make, String model, String color, int year, boolean hasSidecar, String cycleType) {
		super(make, model, color, year);
		this.hasSidecar = hasSidecar;
		this.cycleType = cycleType;
	}

	/**
	 * @return the hasSidecar
	 */
	public boolean isHasSidecar() {
		return hasSidecar;
	}

	/**
	 * @param hasSidecar the hasSidecar to set
	 */
	public void setHasSidecar(boolean hasSidecar) {
		this.hasSidecar = hasSidecar;
	}

	/**
	 * @return the cycleType
	 */
	public String getCycleType() {
		return cycleType;
	}

	/**
	 * @param cycleType the cycleType to set
	 */
	public void setCycleType(String cycleType) {
		this.cycleType = cycleType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Motorcycle [hasSidecar=" + hasSidecar + ", cycleType=" + cycleType + "]";
	}
	
	public  String showMyRide()
	{
		String answer = "";
		
		if(cycleType == "Supersport")
			answer = "I drive a fast motorcycle!";
		else if(cycleType == "Motorcross")
			answer = "I drive an off road motor cycle!";
		else if(cycleType == "Scooter")
			answer = "I drive a small lightweight motorcycle!";
		else
			answer = "I drive a motorcycle!";
		
		return answer;
	
	}
	
}
