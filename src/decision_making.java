import java.util.Scanner;

public class decision_making {

	public static void main(String[] args) {
	Scanner scrn = new Scanner(System.in);
	int user_input, output;
	char choice = 'y';
	
	while(choice == 'y'){
	System.out.println("Enter a number between 1 and 100: ");
	user_input = scrn.nextInt();
	
	if (user_input%2 == 1 ) {
		System.out.println("Output: " + user_input + " and Odd");
	}
	else if (user_input%2 == 0 && user_input >= 2 && user_input < 25 ) {
		System.out.println("Output: " + "Even and less than 25");
	}
	else if (user_input%2 == 0 && user_input >= 2 && user_input <= 60) {
		System.out.println("Output: " + user_input + " and Even");
	}
	else if (user_input%2 == 0 && user_input > 60) {
		System.out.println("Output: " + user_input + " and Even");
	}
	else if (user_input%2 == 0 && user_input < 60) {
		System.out.println("Output: " + user_input + " and Odd");
	}
	
	System.out.println("Continue? (y/n): ");
	
	choice = scrn.next().charAt(0);
		}
	}
}
