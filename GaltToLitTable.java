/*
	Program Name: GalToLitTable
	Professor: Brother Jackson, CIT 260
	Student Name: Jae Lee
*/

class GalToLitTable {
	public static void main(String args[]) {
	
		double gallons, liters;
		int counter;
	
		counter = 0;	// initial counter 0
		for (gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854;	// convert to liters
			System.out.println(gallons + " gallons is " + liters + " liters.");
		
			counter++;			// Increment the line counter with each loop iteration
		
			// every 10th line, print a blank line
			if (counter == 10) {		// if counter is 10, output a blank line
				System.out.println();
				counter = 0;		// reset the line counter
			}
		}
	}
}
