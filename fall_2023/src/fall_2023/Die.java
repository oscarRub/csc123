package fall_2023;
import java.util.Random;

public class Die {

	private int value;
	
	public Die(int NumVal) {
		
		Random rand = new Random();
		value = rand.nextInt(11)+1;
		
	}
	public int getDie() {
		return value;
	}
	
	

}
