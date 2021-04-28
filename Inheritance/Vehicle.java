/**
 * 
 */

/**
 * @author Justin
 *
 */
public class Vehicle {
	protected String make;
	protected String model;
	protected String color;
	protected int year;
	
	public Vehicle(String make, String model, String color, int year) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", color=" + color + ", year=" + year + "]";
	}
	
	public  String showMyRide()
	{
		
		return "I don't know what I ride, but I do ride some type of vehicle!";
	
	}
	

}
