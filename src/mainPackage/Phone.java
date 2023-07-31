package mainPackage;

public class Phone {
	
	//Minimum 3 private instance variables 
	private String brand;
	private String model;
	private String StorageCapacity;
	private int storageCapacity;
	
	//An empty constructor 
	Phone(){
		
	}
	
	//A constructor that uses only 2 of your 3 variables
	public Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	//A constructor that uses all 3 of your instance variables
	public Phone(String brand, String model, int storageCapacity) {
		this.brand = brand;
		this.model = model;
		this.storageCapacity = storageCapacity;
	}
	
	//Get methods for all 3 of your instance variables and Set methods for all 
	//3 of your instance variables
	//getters
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public int getStorageCapacity() {
		return storageCapacity;
	}
	
	//Setters
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	//A method that returns a Boolean
	public boolean isPhoneWaterProof() {
		return true;
	}
	
	//A method that returns a String
	public String calling(String phoneNumber) {
		return "Call is receiving from "+ phoneNumber;
	}
	
	
}
