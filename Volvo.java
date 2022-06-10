package J002_Inheritance;

public class Volvo extends Truck {
	
	public Volvo() {
		this.name = "m21"; 
		this.brand = "Volvo"; 
		this.color = "White";
		this.type = "DayCab"; 
	}
	
	public void DriveCam () {
		System.out.println("Your "+name+" "+brand+" truck is Equipted with a DRIVECAM Video Recording System!");
	}
}
