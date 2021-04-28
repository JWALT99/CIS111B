/**
 * 
 */

/**
 * @author Justin
 *
 */
public class Bus extends Vehicle {
	private boolean isSchoolbus;
	private boolean isSingleDeck;
	private int busNumber;
	
	/**
	 * @param make
	 * @param model
	 * @param color
	 * @param year
	 * @param isSchoolbus
	 * @param isSingleDeck
	 * @param busNumber
	 */
	
	public Bus(String make, String model, String color, int year, boolean isSchoolbus, boolean isSingleDeck,
			int busNumber) {
		super(make, model, color, year);
		this.isSchoolbus = isSchoolbus;
		this.isSingleDeck = isSingleDeck;
		this.busNumber = busNumber;
	}

	/**
	 * @return the isSchoolbus
	 */
	public boolean isSchoolbus() {
		return isSchoolbus;
	}

	/**
	 * @param isSchoolbus the isSchoolbus to set
	 */
	public void setSchoolbus(boolean isSchoolbus) {
		this.isSchoolbus = isSchoolbus;
	}

	/**
	 * @return the isSingleDeck
	 */
	public boolean isSingleDeck() {
		return isSingleDeck;
	}

	/**
	 * @param isSingleDeck the isSingleDeck to set
	 */
	public void setSingleDeck(boolean isSingleDeck) {
		this.isSingleDeck = isSingleDeck;
	}

	/**
	 * @return the busNumber
	 */
	public int getBusNumber() {
		return busNumber;
	}

	/**
	 * @param busNumber the busNumber to set
	 */
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bus [isSchoolbus=" + isSchoolbus + ", isSingleDeck=" + isSingleDeck + ", busNumber=" + busNumber + "]";
	}
	
	public  String showMyRide()
	{
		String answer;
		
		if(isSchoolbus == true)
			answer = "I ride a schoolbus.";
		else
			answer = "I ride on a city bus.";
			
		return answer;
	
	}

}
