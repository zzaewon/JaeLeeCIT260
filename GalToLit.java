/*
* block comment, This is 1-1 GalToLit Program for HW
* Brother Jackson, CIT260
*/

public class GalToLit {
	// class name always Capital letter
	
	public static void main(String args[]) {
		
		// Input
		double gallons; // number of gallons, decimal
		double liters;  // number of liters
		
		// Process
		gallons = 10;
		liters = gallons * 3.7854; // liters conversion
		
		// Output, outstream = out.System-function. all are objects
		// For single Quoue '' = 'K', make sure this. 
		System.out.println(gallons + " gallons is " + liters + " liters.");

	}
}
