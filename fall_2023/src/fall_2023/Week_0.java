package fall_2023;
import java.util.Scanner;

public class Week_0 {

	public static void main(String[]args) {
		
		
		int houses = 0;
		int test;
		
	
	int tootal = pocket();
	int toootal = house();
	
	if (tootal>21) { 
		System.out.println("Busted! You lose.");
	} else if (toootal > 21) {
		System.out.println("Dealer Busted! You win!");
	}else {
		
		System.out.println("totals are: " +tootal+ " and " + toootal);
		
		
		
		if (tootal > toootal) {
			System.out.println("Congrats you win!");
		}else if (tootal < toootal) {
			System.out.println("The house won this time!");
		}else {
			System.out.println("Draw!");
		}
	}
	
	}
	

	public static int pocket() {
		int blackjack = 10;
		int blackjack1 = 10;
		int blackjack2 = 10;
		int pockets=0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to 21! Below are your cards! \n");

		
		Die player = new Die(blackjack);
		Die player1 = new Die(blackjack1);
		pockets += player.getDie() + player1.getDie();
		String a = "hit",b = "stay";
		
		System.out.println("Your first card is: " + player.getDie());
		System.out.println("Your second card is: " + player1.getDie());
		System.out.println("Your total is: " + pockets);
		
		if (pockets == 21) {
			System.out.println("Blackjack!");
		}
		
		for (;pockets<21;) {
			System.out.println("Would you like to HIT or STAY?");
			String choose = keyboard.next();
			if (choose.equals(b)) {
				System.out.println("You stayed on: " + pockets);
				break;
			}
			Die player2 = new Die(blackjack2);
			System.out.println("Your third card is: " + player2.getDie());
			pockets += player2.getDie();
			System.out.println("New total is: " + pockets);
			

		}
		
		if (pockets > 21) {
			System.out.println("You busted!");
			
		}	
		return pockets;
		
	}
	
	public static int house() {
		int dealer = 10, dealer1=10,dealer2=10,total=0;
	
		Die dealer0 = new Die(dealer);
		Die dealer00 = new Die(dealer);
		System.out.println("\nDealers Turn!\nDealer showed a: " + dealer0.getDie());
		System.out.println("Dealer's hidden card is a: " + dealer00.getDie());
		total += dealer0.getDie() + dealer00.getDie();
		System.out.println("Dealer's total is: " + total);
		
		do {
			System.out.println("Dealer Hits!\n");
			Die dealer000 = new Die(dealer);
			total += dealer000.getDie();
			System.out.println("Dealers new total is: " + total + "\nHitting again!");
			
		} while(total <= 16);
	if (total >= 17) {
		System.out.println("Dealer stays on: " + total);
	}
		return total;
	}
	
	
}
