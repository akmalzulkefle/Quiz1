import java.util.Scanner;

public class Shimano {

	Scanner s = new Scanner(System.in);
	
	String model;
	String colour;
	int maxspeed;
	double weight;
	
	
	//create Setter Method
	public void setModel() {
		System.out.println("Enter Model :");
		this.model = s.nextLine();
	}
	
	public void setColour() {
		System.out.println("Enter Colour :");
		this.colour = s.nextLine();
	}
	
	public void setmaxSpeed() {
		System.out.println("Enter MaxSpeed :");
		this.maxspeed = s.nextInt();
	}
	
	public void setWeight() {
		System.out.println("Enter Weight :");
		this.weight = s.nextDouble();
	}
	
	//create Getter Method
	public String getModel() {
		return this.model;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public Integer getSpeed() {
		return this.maxspeed;
	}
	
	public Double getWeight() {
		return this.weight;
	}
	
}
