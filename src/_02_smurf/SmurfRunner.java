package _02_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	
	Smurf smurf1= new Smurf("Handy Smurf");
	smurf1.eat();
	smurf1.getName();
	
	Smurf smurf2= new Smurf("Papa Smurf");
	System.out.println(smurf2.getName());
	System.out.println(smurf2.getHatColor());
	System.out.println(smurf2.isGirlOrBoy());
	
	Smurf smurf3= new Smurf ("Smurfette");
	System.out.println(smurf3.getName());
	System.out.println(smurf3.getHatColor());
	System.out.println(smurf3.isGirlOrBoy());
}
}
