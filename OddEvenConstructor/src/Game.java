import java.util.Scanner;
public class Game {
	public static void main (String args []){
		Number generate = new Number();
		System.out.printf("Welcome to the Odd/Even Game.\n");
		System.out.printf("Try to guess if the number given by the computer is ''Even'' or ''Odd''.\n");
			int win = 0;
			int loss = 0;
		for (int i = 1; i < 10; i--) {
			int pc = generate.game();
			Scanner input = new Scanner ( System.in );
			String user = input.nextLine();
			
			
			if ((pc == 2 || pc == 4 || pc == 6 || pc == 8 || pc == 10) && user.equals("Even")) {
				System.out.printf("\tThe number was %d.You have guessed %s. You win.\n\n", pc , user);
				win++;
				}
			else if ((pc == 1 || pc == 3 || pc == 5 || pc == 7 || pc == 9) && user.equals("Odd")) {
				System.out.printf("\tThe number was %d.You have guessed %s. You win.\n\n", pc , user );
				win++;
			}
			else {
				System.out.printf("\tThe number was %d.You have guessed %s. You lose.\n\n", pc , user );
				loss++;
			}
				System.out.printf("Do you wish to continue?\nType 'Yes' or 'No'.\nYour score will be shown when you type 'No'\n");
			String cont = input.nextLine();
			
			if (cont.equals("No")) {
				System.out.printf("You have won %d time(s). You have lost %d time(s).\n", win , loss);
				i = 1000;
			}
			if (cont.equals("Yes")) {
				System.out.printf("Try to guess again if the number given by the computer is ''Even'' or ''Odd''.\n");
			}
		}
	}

	private static Number newNumber() {
		// TODO Auto-generated method stub
		return null;
	}
}
