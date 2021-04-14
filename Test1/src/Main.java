

public class Main {

	public static void main(String[] args) {
		
		Shimano s = new Shimano();
		
		s.setModel();
		s.setColour();
		s.setmaxSpeed();
		s.setWeight();
		
		System.out.println("Model : " + s.getModel());
		System.out.println("Colour : " + s.getColour());
		System.out.println("Speed : " + s.getSpeed() + " KM/H ");
		System.out.println("Weight : " + s.getWeight() + " KG ");		
	}

}
