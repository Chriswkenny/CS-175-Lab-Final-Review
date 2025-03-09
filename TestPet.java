package cs176L_Assignments;

public class TestPet {

	public static void main(String[] args) {
		
		MyPet pet1 = new MyPet();
		pet1.displayInfo();
		
		MyPet pet2 = new MyPet("Fluffy", "Cat", 2);
		pet2.displayInfo();
		pet2.celebrateBirthday();
		pet2.displayInfo();
		
		
	}//Main
}//Class
