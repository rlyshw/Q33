import java.util.Scanner;


public class Q33 {
	static Scanner in = new Scanner(System.in);
	private static int getInput(String promptString){
		System.out.print(promptString);
		
		//This try catch ensures the user only enters a double.
		try{
			return in.nextInt();
		}
		catch(Exception e){
			System.err.print("\nException raised: "+e+"\n");
			in.next(); //for whatever reason the scanner has to advance past the preceding sys.out line
			return getInput(promptString);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TD = getInput("TDs: ");
		int YD = getInput("Yards: ");
		int INT = getInput("Interceptions: ");
		int COMP = getInput("Completions: ");
		int ATT = getInput("Attempts: ");
		Passer passer = new Passer(TD, YD, INT, COMP, ATT);
		System.out.println("Passer Rating: "+passer.passerRating());
	}

}
