import javax.swing.JOptionPane;

public class TypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte hoursIneclipse = Byte.MAX_VALUE;
		// The byte data type is an 8-bit signed two's complement integer. It has a
		// minimum value of -128 and a maximum value of 127 (inclusive).
		short coffeesDrank = Short.MAX_VALUE;
		// The short data type is a 16-bit signed two's complement integer. It has a
		// minimum value of -32,768 and a maximum value of 32,767 (inclusive).
		int codeErrors = Integer.MAX_VALUE;
		// By default, the int data type is a 32-bit signed two's complement integer,
		// which has a minimum value of -231 and a maximum value of 231-1.
		long hairsPulled = Long.MAX_VALUE;
		// The long data type is a 64-bit two's complement integer. The signed long has
		// a minimum value of -263 and a maximum value of 263-1.
		float floatingPoints = Float.MAX_VALUE;
		// The float data type is a single-precision 32-bit IEEE 754 floating point.
		double hoursSincelastMeal = Double.MAX_VALUE;
		// Double data type is used to store decimal numbers whose range is from 1.7
		// E-308 to 1.7 E+308.
		boolean gonnaLetyouDown = false;
		// The boolean data type has only two possible values: true and false.
		char abc = 'A';
		// The char data type is a single 16-bit Unicode character. It has a minimum
		// value of '\u0000' (or 0) and a maximum value of '\uffff'

		String message = "Hours in Eclipse: " + hoursIneclipse + "\n" + "Coffees Drank: " + coffeesDrank + "\n"
				+ "Code Errors: " + codeErrors + "\n" + "Hairs Pulled: " + hairsPulled + "\n" + "Floating Points: "
				+ floatingPoints + "\n" + "Hours Since Last Meal: " + hoursSincelastMeal + "\n" + "Gonna Let You Down: "
				+ gonnaLetyouDown + "\n" + "What's The First Letter of the Alphabet: " + abc + "\n";

		JOptionPane.showMessageDialog(null, message);

		hoursIneclipse++; 
		coffeesDrank++;
		codeErrors++;
		hairsPulled++;
		floatingPoints++;
		hoursSincelastMeal++;
		//incrementing the existing values of the number variables by 1

		String message2 = "Hours in Eclipse: " + hoursIneclipse + "\n" + "Coffees Drank: " + coffeesDrank++ + "\n"
				+ "Code Errors: " + codeErrors + "\n" + "Hairs Pulled: " + hairsPulled + "\n" + "Floating Points: "
				+ floatingPoints + "\n" + "Hours Since Last Meal: " + hoursSincelastMeal + "\n" + "Gonna Let You Down: "
				+ gonnaLetyouDown + "\n" + "What's The First Letter of the Alphabet: " + abc + "\n";

		System.out.println(message2);

	}

}
