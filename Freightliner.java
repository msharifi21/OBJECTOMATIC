
public class Freightliner extends Truck {
	
	public Freightliner () {
		this.name = "m41"; 
		this.brand = "Freightliner"; 
		this.color = "Orange";
		this.type = "DayCab";
	}
	
	
	public void Scanner() {
		System.out.println("Your "+name+" "+brand+" Truck has a SCANNER for the Product Scan!");
	}
}
