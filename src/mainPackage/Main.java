package mainPackage;


public class Main {
    public static void main(String[] args) {
        // Creating instances of the Pet class using constructor
        Pet pet2 = new Pet("Lani", 4,"", "German Sherpherd");
        
        
        System.out.println("This Is Pet Class:");
        System.out.println("--------------------");
        System.out.println("Name: " + pet2.getName());
        System.out.println("Age: " + pet2.getAge());
        System.out.println("Type: " + pet2.getType());
        //notic the location is empty but constructor skipped it 
        //without error.
        System.out.println();
        //Creating instances of the Phone class using getters and setter
        Phone phone1 = new Phone();
        phone1.setBrand("Ipnone");
        phone1.setModel("14 Pro Max");
        phone1.setStorageCapacity(564);
        System.out.println("This Is Phone Class:");
        System.out.println("--------------------");
        System.out.println("Phone brand is "+ phone1.getBrand());
        System.out.println("Phone brand is "+ phone1.getModel());
        System.out.println("Phone capacity is "+ phone1.getStorageCapacity());
    }
}
