import java.util.Scanner;

class Guesser{
	int Guessednumber;
	int Chances;
	int GuessNum() {
		System.out.println("WELCOME TO THE GUESSERGAME");
		Scanner sc = new Scanner(System.in);
		System.out.println("HI GUESSER . HOW MANY CHANCES SHOULD BE GIVEN TO THE PLAYER");
		Chances=sc.nextInt();
		System.out.println("Hi Guesser Please enter the number you have guessed");
		Guessednumber= sc.nextInt();
		return Guessednumber;
	}
}
class Player {
	int Playernumber;
	int Playersturn() {
		System.out.println("HI PLAYER PLEASE TRY TO READ THE MIND OF THE GUESSER");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number  in your mind");
		Playernumber= sc.nextInt();
		return Playernumber;
	}
	
}
class Umpire{
	int NumberfromGuesser;
	int NumberfromPlayer;
	int flag=0;
	void Umpirechecking() {
		Guesser g = new Guesser();
		NumberfromGuesser=g.GuessNum();
		Player p = new Player ();
		for (int i=0;i<g.Chances;i++) {
		NumberfromPlayer= p.Playersturn(); 
		if(NumberfromGuesser==NumberfromPlayer) {
			System.out.println("Player won Congratulations");
			flag=1;
			break;
			
		}
		else {
			System.out.println("Chance lost! Try again");
		}
		
	}
		if(flag==0) {
		System.out.println("ALL YOUR CHANCES WASTED . GOOD LUCK NEXT TIME");
		}
	}
	
}

public class Tester {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.Umpirechecking();
		
		

	}

}
