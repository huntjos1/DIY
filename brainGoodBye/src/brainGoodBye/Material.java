package brainGoodBye;

import java.io.Serializable;

/**
 * 
 * @author Jacob Ficker
 * @author Joey Hunt (minor edits)
 */
public class Material implements Cloneable, Serializable{
	
	
	/**
	 * Generated SUID
	 */
	private static final long serialVersionUID = -5993446442313573690L;
	private int myQuantity;
	private Double myPrice;
	private boolean isAcquired;
	private String myName;
	
	/**
	 * This is the basic constructor for making a new material.
	 * The material created will be set to not acquired yet.
	 * @author Jacob Ficker
	 * @param nam
	 * @param quant
	 * @param price
	 */
	public Material(String nam, int quant, Double price) {
		isAcquired = false;
		myPrice = price;
		myQuantity = quant;
		myName = nam;
	}
	
	/**
	 * This is the constructor allows the specification of whether or not
	 * the material has already been acquired.
	 * @author Jacob Ficker
	 * @param name
	 * @param quantity
	 * @param price
	 * @param acq
	 */
	public Material(String name, int quantity, Double price, boolean acq) {
		isAcquired = acq;
		myPrice = price;
		myQuantity = quantity;
		myName = name;
	}
	
	/**
	 * @author Jacob Ficker
	 */
	public Material() {
		myQuantity = 0;
		myPrice = 0.0;
		isAcquired = false;
		myName="Material";
	}
	
	/**
	 * @author Jacob Ficker
	 * @param myQuantity
	 */
	public void setQuantity(int myQuantity) {
		this.myQuantity = myQuantity;
	}
	/**
	 * @author Jacob Ficker
	 * @return
	 */
	public int getQuantity() {
		return myQuantity;
	}

	/**
	 * @author Jacob Ficker
	 * @return
	 */
	public Double getPrice() {
		return myPrice;
	}

	/**
	 * @author Jacob Ficker
	 * @return
	 */
	public boolean isAcquired() {
		return isAcquired;
	}

	/**
	 * @author Jacob Ficker
	 * @return
	 */
	public String getName() {
		return myName;
	}

	/**
	 * @author Jacob Ficker
	 * @param myPrice
	 */
	public void setPrice(Double myPrice) {
		this.myPrice = myPrice;
	}

	/**
	 * @author Jacob Ficker
	 * @param isAcquired
	 */
	public void setAcquired(boolean isAcquired) {
		this.isAcquired = isAcquired;
	}
	
	/**
	 * @author Jacob Ficker
	 * @param myName
	 */
	public void setName(String myName) {
		this.myName = myName;
	}
	
	/**
	 * @author Jacob Ficker
	 */
	public Material clone() {
		return new Material(myName, myQuantity, myPrice, isAcquired);
	}
	
	/**
	 * @author Jacob Ficker
	 */
	@Override
	public boolean equals(Object o) {
		Material m = (Material) o;
		return m.getName().equals(this.getName())
				&& m.getPrice() == this.getPrice()
				&& m.getQuantity() == this.getQuantity()
				&& m.isAcquired() == this.isAcquired();
	}
	
	/**
	 * @author Jacob Ficker
	 * @author Joey Hunt (minor edits)
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + getName().hashCode();
		result = (int) (prime * result + getPrice());
		result = prime * result + getQuantity();
		
		return result;
	}
	
}
