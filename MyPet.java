package cs176L_Assignments;

public class MyPet {

	private String petName;
	private String typePet;
	private int petAge;
	
	//Default Constructor
	public MyPet() {
		this.petName = null;
		this.typePet = null;
		this.petAge = 0;
	}
	
	//Parameter Constructor 
	public MyPet(String petName, String typePet, int petAge) {
		this.petName = petName;
		this.typePet = typePet;
		this.petAge = petAge;
	}
	//Method to display pet information
	public void displayInfo() {
		System.out.println("Name: " + petName);
		System.out.println("Type of Pet: " + typePet);
		System.out.println("Pet's Age: " + petAge);
		System.out.println(" ");
	}
	
	//Method that increases age and sends Birthday message
	public void celebrateBirthday() {
		petAge += 1;
		System.out.println("Happy Birthday to " + petName + "! You are now: " + petAge);
		System.out.println(" ");
	}
	
	
	
	
	
	
}//Class
