import java.util.Scanner;

public class CreditCardEntitlement {

	public static void main(String[] args) {
		checkCCEntitlement ();

	}

	private static void checkCCEntitlement() {
		// Read in the employee's data to determine if they are
		// eligible for a credit card.
		
		Scanner sc = new Scanner (System.in);
		System.out.print ("Enter the employee's name: ");
		String name = sc.nextLine ();
		System.out.print("Enter " + name + "'s salary: ");
		float salary = sc.nextFloat ();
		System.out.print("Enter the number of years " + name + " has been with this company: ");
		byte numYears = sc.nextByte();
		sc.close ();
		
		if (salary > 30000 || salary > 20000 && numYears > 3)
			System.out.println ("\n" + name + " is entitled to a credit card.\n");
		else
			System.out.println ("\n" + name + " is not entitled to a credit card.\n");
	}

}
