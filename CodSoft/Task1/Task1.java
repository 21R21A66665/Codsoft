import java.util.*;
class Main{
	public static void main(String[] args) {
		int r1=(int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		boolean g1=false;
		int n= 0;
		System.out.println("Guess a number between 1 and 100: ");
		System.out.println("NOTE: You have only 5 guesses to win..!");
		while (!g1 && n< 5){
		    int G1=sc.nextInt();
		    if (G1== r1){
		        g1= true;
		    } 
		    else{
		        n++;
		        if(G1> r1){
		            System.out.println("Your guess is too high.");
		        }
				else{
		            System.out.println("Your guess is too low.");
		        }
		    }
		}

		if (g1){
		    System.out.println("Congratulations!...Your guess is correct! The number was " + r1);
		}
		else{
		    System.out.println("Sorry, you ran out of guesses. The System generated number was " + r1);
		}
		sc.close();

	}
}