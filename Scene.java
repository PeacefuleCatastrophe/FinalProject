
import java.awt.*;

import java.util.Scanner;

public class Scene {
	public static boolean HasStudied = false;
	public static double SectionAnswer1;
	public static int DinnerSecond = 1;

	public static void Morning() {
		Scanner console = new Scanner(System.in);

		System.out.println("Good Morning! Do you want to stay in bed or head off to breakfast? (1 or 2)");
		int AnswerMorning = console.nextInt();
		if (AnswerMorning == 1) {
			System.out.println(
					"You get that much needed snooze button beauty rest and you feel better about the day ahead of you");
			Counter.WellbeingUp();
		} else if (AnswerMorning == 2) {
			System.out.println(
					"You eat a wonderful breakfast, but it comes at a cost of being groggy and cranky because you missed that \nimportant snooze button beauty rest.");
			Counter.WellbeingDown();
			Counter.HungerDown();
		} else {
			System.out.println("That was an invalid input");
		}
	}

	public static void CS112() {
		System.out.println();
		Scanner console = new Scanner(System.in);
		double CorrectAnswer = Math.round((Math.random() * 4));
		System.out.println(
				"After a nice start to your day you trek over to Computer Science 112 with Professor Yang Yang.");
		System.out.println(
				"You get called on in class! input a number from 0 to 4 to see if you got the question right.");
		int AnswerCS112 = console.nextInt();
		if (AnswerCS112 == CorrectAnswer) {
			System.out.println("You're a hotshot coder and you got the answer right!");
			Counter.WellbeingUp();
		} else {
			System.out.println("You got the answer wrong and embaressed yourself in front of the whole lecture.");
			Counter.WellbeingDown();
		}

		System.out.println(
				"As you leave class, and are going up the sketchy staircase, a shadowy voice offers you their code for the current pset, \ndo you take it?");
		System.out.println(
				"You think to yourself that there is a 50% chance you get ex-commed for cheating, \nand a 50% chance you finish the PSET, and relieve youself of stress awarding you 2 wellbeing points.");
		System.out.println("Cheat or No? (1/0)");

		int AnswerCheat = console.nextInt();
		if (AnswerCheat == 1) {
			double FiftyFifty = Math.random();
			if (FiftyFifty >= .5) {
				System.out.println(
						"Congratulations you little rebel, you've cheated yourself, but more importantly the system.");
				Counter.Wellbeing2Up();
				System.out.println("Sneaky Sneaky...");
			} else {
				System.out.println(
						"Yea... Not a good idea, you knew the risks and now you pay for it, enjoy Excom! game over.");
				Counter.Excom();
			}
		} else {
			System.out.println(
					"You're a true star of integrity! You put that shady voice behind you and go about your day.");
		}

	}

	public static void Lunch() {
		System.out.println();
		System.out.println(
				"After a wonderful and informative lecture by your favorite CS professor you head to your favorite lunch spot \nout of Commons(1), Durfees(2) and your personal residential college dining hall(3)");
		Scanner console = new Scanner(System.in);
		int LunchAnswer = console.nextInt();

		if (LunchAnswer == 1) {
			System.out.println(
					"You head to commons and go to town on the stir fry fried rice with a little touch of sriracha on top, \nthere's nothing like it and it makes you very happy.");
			Counter.WellbeingUp();
			Counter.HungerDown();
		} else if (LunchAnswer == 2) {
			System.out.println(
					"You head to Durfees spend your eight dollars efficiently and get some studying in for section later, \nrather than getting caught in conversation in a big dining hall.");
			Counter.HungerDown();
			HasStudied = true;
		} else {
			System.out.println(
					"You head to your personal residential college, but the food today is awful. \nYou can either choose to eat and damage your wellbeing(1), or not eat and go hungry(2)");
			int ResColAnswer = console.nextInt();
			if (ResColAnswer == 1) {
				Counter.HungerDown();
				Counter.WellbeingDown();
			} else {
				System.out.println("Not eating is a pretty bold move");
			}
		}
	}

	public static void Study() {
		System.out.println();
		Scanner console = new Scanner(System.in);
		System.out.println(
				"You finished your meal and decide that it is time to get some dedicated studying done, \nbut where do you go?  Sterling Memorial Library(1), Your suite(2), Cross Campus(3).");
		int StudyAnswer = console.nextInt();
		if (StudyAnswer == 1) {
			System.out.println("A trip to the good-old-fashioned library");
			if (HasStudied == true) {
				System.out.println(
						"Nerd! you study so often, but you know it's good for you. \nYou feel even less anxious about your classes.");
				Counter.WellbeingUp();
			} else {
				HasStudied = true;
			}
		} else if (StudyAnswer == 2) {
			System.out.println(
					"You decide to go to your suite, but you're suitemates are playing 3-player super smash brothers, \n you just can't help but be their 4th player.");
			Counter.WellbeingUp();
		} else if (StudyAnswer == 3) {
			System.out.println(
					"You go out onto the warm expanse of Cross Campus with the intent to study... \nBut it begins to rain, and you lose all drive to study.");
			Counter.WellbeingDown();
		}
	}

	public static void Section() {
		System.out.println();
		double SectionAnswer1 = Math.round((Math.random() * 4));
		double SectionAnswer2 = Math.round((Math.random() * 4));
		System.out.println(
				"After your \"Productive Study Session\" you decide to go to discussion section for your token humanities credit");
		Scanner console = new Scanner(System.in);
		System.out.println("Is there a section A**hole in this discussion(1/0)");

		int AHoleAnswer = console.nextInt();
		if (AHoleAnswer == 1) {
			System.out.println(
					"He really is annoying, but at least he dominates the discussion so you only have to answer one question");
			System.out.println(
					"If you studied earlier you get the question right automatically, \nif not pick a number between 0 and 4 and hope you're right");
			if (HasStudied == true) {
				System.out.println("You got it right!");
				Counter.WellbeingUp();
			}
			int SectionGuess = console.nextInt();
			if (SectionGuess == SectionAnswer1) {
				System.out.println("Improvising on the spot, not too bad.");
				Counter.WellbeingUp();
			} 
		else{
				System.out.println("Yea good try, but you embaress yourself in front of the entire discussion section.");
			Counter.WellbeingDown();
		}
		}
		if (AHoleAnswer == 0) {
			System.out.println("Since you think there is no section A**hole, you must be the culprit yourself!");
			System.out.println(
					"Now you have to answer two questions because you talk too much, \nIf you studied earlier you get the question right automatically, \nif not pick two numbers between 0 and 4 and hope you're right");
			if (HasStudied == true) {
				System.out.println("You got them both right!");
				Counter.Wellbeing2Up();
				System.out.println("Too smart for your own good\n");
			} else {
				int SectionAGuess1 = console.nextInt();
				if (SectionAGuess1 == SectionAnswer1) {
					System.out.println("Improvising on the spot, not too bad.");
					Counter.WellbeingUp();
				} else {
					System.out.println("Yea good try, but you embaress yourself in front of the entire discussion section");
					Counter.WellbeingDown();
				}
				int SectionAGuess2 = console.nextInt();
				if (SectionAGuess2 == SectionAnswer2) {
					System.out.println("Improvising on the spot, not too bad.");
					Counter.WellbeingUp();
				} else {
					System.out.println(
							"Yea good try, but you embaress yourself in front of the entire discussion section");
					Counter.WellbeingDown();
					}
				}
			}
		}
	
	public static void Dinner() {
		System.out.println();
		System.out.println("Now you're off to dinner in your residential colleges dining hall");
			if (DinnerSecond == 0){
			System.out.println("Going to dinner after a bout of procrastination allows you to time your hunger perfectly, \nbut all that is left is cape shark, and you hate cape shark!");
			Counter.WellbeingDown();
			Counter.HungerDown();
		}
		else{
			System.out.println("Going to dinner so early is a bold move, you see your best friends there but you know you will be hungry later, \nyou leave happy but your stomach is dissatisfied");
			Counter.WellbeingUp();	
		}
	}

	public static void Procrastinate() {
		System.out.println();
		DinnerSecond = 0;
		System.out.println("Procrastination is essential for being a productive member of society: \nNetflix(1), Yale Memes for Special Snowflake Teens(2), A run to East Rock(3). Pick your Poison");
		Scanner console = new Scanner(System.in);
		int ProcrastinateAns = console.nextInt();
			if (ProcrastinateAns == 1){
				System.out.println("You fire up Netflix but you are completly underwhelmed by the two episodes you watched and feel like you wasted time");
				Counter.WellbeingDown();
			}
			else if (ProcrastinateAns == 2){
				System.out.println("You troll around for a couple hours and you finally stumble upon the meme of a lifetime");
				Counter.WellbeingUp();
				// cue Std.Draw Dope ass meme??????
			}
			else {
				System.out.println("You take a run and feel that nice runners afterglow and feel confident about your health, \nbut it makes you even more hungry than you usually are");
				Counter.Wellbeing2Up();
				Counter.HungerUp();	
			}	
	}
	public static void Extracurricular() {
		Scanner console = new Scanner(System.in);
		System.out.println("You check your phone. It's almost time for your extra-curricular activity. First things first, are you the editor of the YDN? Yes(1) No way(2).");
		int dailyNews = console.nextInt();
		if (dailyNews == 1){
			System.out.println("...");
			System.out.println("Why?");
			System.out.println("You spend all day at the office, crawling through first, second, and fifteenth drafts of\n whatever your writers put in front of you before scrapping everything and picking whatever will get you on Overheard.\n You fall asleep atop your coffee at 3am, regretting your life choices.");
			goodnight();
		}
		else if (dailyNews == 2){
		System.out.println("Very well, unimportant person, then what do you do in your free time? A capella(1) Dwight Hall(2) IntraMurals(3)");
		int activity = console.nextInt();
		if (activity == 1){
			aCapella();
			secondExtra(1);
			}
			else if (activity == 2){
			dwight();
			secondExtra(2);
			}
			else if (activity == 3){
			intra();
			secondExtra(3);
			}
			else{
			System.out.println("That was an invalid input");  
			Extracurricular();
			}
		}
	}
	public static void aCapella(){

			int throat = Math.round(Math.random());
			System.out.println("You join your bestest buddies and sing your heart out during rehearsals!"
				if (throat == 0){
					System.out.print("You hit the perfect notes and walk away fine!");
				}
				else{
					System.out.print("You see a cat outside the window and scream in your singing voice.\n Now you have a sore throat!");
					Counter.WellbeingDown();
				}
	}
	public static void dwight(){
		System.out.println("As a member of one of the many honorable societies under Dwight Hall, you are helping make the world a better place.");
		Counter.WellbeingUp;
	}
	public static void intra(){
		System.out.println("Of course you're going to go play an IM, and help your college win everlasting glory (for one semester.) You reach the site of the game and your friend asks you to join them. What do you do? PLAY(1) Cheer from the sidelines(2).");
				int play = nextInt();
						   if (play == 1){
							   System.out.println("You don the colors of your team and charge onto the field, roaring as loud as you can. You give the game your all, but end up messing everything up and making your team lose! You're a CS student, what did you expect?");
							   Counter.WellbeingDown();
						   }
						   else if (play == 2){
							   System.out.println("You join your friends on the sidelines, where you belong, and cheer your team to victory. The players swear it was your loud cries that pushed them all the way.");
							   Counter.WellbeingUp();
						   }
						   else{
							 System.out.println("That was an invalid input");  
							 intra();
						   }
	}
	public static void secondExtra(int beenDone){
		Scanner console = new Scanner(System.in);
		if (beenDone == 1){
			System.out.println("You say goodbye to your posse, and check your phone. Like every yalie, you have another extra curricular planned for the night. What will it be? DwightHall(1) or IMs(2)?");
			int choice = console.nextInt();
				if (choice == 1){
					dwight();
				}
				else if (choice == 2){
					intra();
				}
				else{
					System.out.println("That was an invalid input");  
					secondExtra(1);
				}
		}
		else if (beenDone == 2){
			System.out.println("Enough good deeds for one day. Like every yalie, you have another extra curricular planned for the night. What will it be? a Capella(1) or IMs(2)?");
			int choice = console.nextInt();
				if (choice == 1){
					aCapella();
				}
				else if (choice == 2){
					intra();
				}
				else{
					System.out.println("That was an invalid input");  
					secondExtra(2);
				}
		else if (beenDone == 3){
			System.out.println("Tired from all that physical exertion, you leave your friends and check your phone.\n You still have time for one more activity.\n What will it be? a Capella(1) or DwightHall(2)");
			int choice = console.nextInt();
				if (choice == 1){
					aCapella();
				}
				else if (choice == 2){
					dwight();
				}
				else{
					System.out.println("That was an invalid input");  
					secondExtra(3);
				}
		}
	}

	public static void Buttery() {
		System.out.println();
		System.out.println("Is it a buttery kind of night?(1/0)");
		Scanner console = new Scanner(System.in);
		int ButteryAns = console.nextInt();
			if(ButteryAns == 1){
				System.out.println("You go to the buttery for a late night snack \nand you have a ball playing billiards with your best buds");
				Counter.WellbeingUp();
				Counter.HungerDown();
			}
			else {
				System.out.println("You end up just meandering around accumulating stress about your looming deadlines");
				Counter.WellbeingDown();
				System.out.println("You got this!");
			}	
	}

	public static void Nighttime() {
		System.out.println("The night air is chilly yet alive with the warmth of bustling bodies and alcohol.\n But you know you shouldn't go out tonight. Your unfinished pset fills you with guilt. Do you go to office hours(1) or bite the bullet and go to WOADS(2)?");
		Scanner console = new Scanner(System.in);
		int ProcrastinateAns = console.nextInt();
			if (ProcrastinateAns == 1){
				System.out.println("You drag yourself through the cold to a tiny room full of panicking students and jovial TAs.\n Of course, there are a few students who are completely chill because they finished the pset the hour it was posted and only came here to laugh at plebs like you.\n One of them points out that pizza was promised at office hours. \nYou could second his request for nourishment(1) or focus on your pset(2). Note that the pizza will be Papa Johns.");
				int pizzaChoice = console.nextInt();
				if (pizzaChoice == 1){
					System.out.println("You wail frantically for pizza, praying to Steve Jobs' ghost for a large Papa Johns.\n You receive it, and take a big gooey bite while your peers gorge themselves on the garlic sauce.\n However, the promise of the great John distracted you from work."
							   Counter.HungerDown();
							   Counter.WellbeingDown();
				}
				else {
					System.out.println("You bite your lips, resisting the allure of pizza, and let the overly enthusiastic\n pizza-wanting student drown under the combined pressure of the death glares your peers heap on him. \nThat puts you in a happy mood and the gods of computing take pity on you at last,\n fixing your code inexplicably!")
						Counter.WellbeingUp();
				}
			}
			else {
				System.out.println("You bite the bullet, throwing caution to the wind. Speaking of wind, it's cold out.\n Did you bring your jacket? Yes (1) No (2).");
				int jacket = console.nextInt();
				if (jacket == 1){
					System.out.println("Of course you did, doing otherwise would be irresponsible! \nYou join the seething mass of bodies inside Toads, and get puked out at 1am, sans jacket.");
					Counter.WellbeingDown();
				}
				else {
					System.out.println("Well, whatever. Hopefully the dancing will warm you up! \nYou jump into the swirling whirpool of dancers and leave the club at 1.");
				}
			}	
	}
							   
	public static void goodNight() {
		System.out.println("You walk back, dazed and confused, to your room. You collapse on your bed,\n having made it through a completely ordinary day. Good Night!");
		if (Counter.getHunger() <= 0){
			System.out.println("You wake up as your tummy rumbles, cursing you for not filling it \nduring the day. Thus, you have lost the most important battle and will have a terrible night.")
			Counter.WellbeingDown();
			Counter.WellbeingDown();
		}
		wellbeingDeath();
		Counter.showWellbeing();	
	}
							   
	public static void wellbeingDeath(){
		if (Counter.getWellbeing <= -3){
		System.out.println("Oh no! The weight of all your hopes, dreams, and responsibilities comes\n crashing down on you! You curl up into the fetal position and begin bawling your eyes out.")	
		StdAudio.play( "deathsong_harvard.wav" );
		}
	}
}
