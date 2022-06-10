package J002_Inheritance;

public class Main {

	public static void main(String[] args) {
		
		Volvo vm21 = new Volvo (); 
		String s = "Your "+vm21.name+" "+vm21.brand+" Truck is ";
		System.out.println(s +"A "+ vm21.color+" "+vm21.type+"!");
		vm21.forward(s);
		vm21.Rervers(s);
		vm21.hank(s);
		vm21.DriveCam();
		System.out.println("\n");
		
		international im31 = new international (); 
		String s1 = "Your "+im31.name+" "+im31.brand+" Truck is ";
		System.out.println(s1 +"A "+ im31.color+" "+im31.type+"!");
		im31.forward(s1);
		im31.Rervers(s1);
		im31.hank(s1);
		im31.PopelNet();
		System.out.println("\n");
		
		Freightliner fm41 = new Freightliner (); 
		String s2 = "Your "+fm41.name+" "+fm41.brand+" Truck is ";
		System.out.println(s2 +"A "+ fm41.color+" "+fm41.type+"!");
		fm41.forward(s2);
		fm41.Rervers(s2);
		fm41.hank(s2);
		fm41.Scanner();
		System.out.println("\n");
		
	}

}
