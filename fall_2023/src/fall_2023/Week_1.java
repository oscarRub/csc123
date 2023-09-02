package fall_2023;
import java.util.Scanner;
import java.util.Random;

public class Week_1 {

	public static void main(String[]args) {
		
		System.out.println("Hello World!");
		
		
	}
	
	
	
	public static void ch3() {
		int base_fee = 10, checks;
		double total;
		
		
		System.out.println("How many checks have been deposited: ");
		Scanner keyboard = new Scanner(System.in);
		checks = keyboard.nextInt();
		
		if (checks < 20) {
		total = (checks * .10) + base_fee;
		System.out.println("Total is: $" + total);
			
		}else if(checks >= 20 && checks < 39) {
			total = (checks * .08) + base_fee;
			System.out.println("Total is: $" + total);
		}else if(checks >= 40 && checks < 59) {
			total = (checks * .06) + base_fee;
			System.out.println("Total is: $" + total);
		}else {
			total = (checks * .04) + base_fee;
			System.out.println("Total is: $" + total);
		}
	}
	public static void ch4() {
		Random rand = new Random();
		int value = rand.nextInt(2);
	
		System.out.println("Random integer: "+value);
		
		if (value == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	
	
	
}


