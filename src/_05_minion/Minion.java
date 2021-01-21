package _05_minion;

public class Minion {

	String name;
	int eyes;
	String color;
	String Master;
	
	public Minion(String string, int i, String string2, String string3) {
		// TODO Auto-generated constructor stub
		this.name=string;
		this.eyes=i;
		this.color=string2;
		this.Master=string3;
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getEyes() {
		// TODO Auto-generated method stub
		return eyes;
	}

	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	public void setMaster(String string) {
		// TODO Auto-generated method stub
		this.Master=string;
		
	}

	public String getMaster() {
		// TODO Auto-generated method stub
		return Master;
	}

}
