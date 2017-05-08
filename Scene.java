
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
					"You eat a wonderful breakfast, but it comes at a cost of being groggy and cranky because you missed that important snooze button beauty rest");
			Counter.WellbeingDown();
			Counter.HungerDown();
		} else {
			System.out.println("That was an invalid input");
		}
	}

	public static void CS112() {

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
				"As you leave class, and are going up the sketchy staircase, a shadowy voice offers you their code for the current pset, do you take it?");
		System.out.println(
				"You think to yourself that there is a 50% chance you get ex-commed for cheating and a 50% chance you finish the PSET and relieve youself of stress awarding you 2 wellbeing points.");
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
		System.out.println(
				"After a wonderful and informative lecture by your favorite CS professor you head to your favorite lunch spot out of Commons(1), Durfees(2) and your personal residential college dining hall(3)");
		Scanner console = new Scanner(System.in);
		int LunchAnswer = console.nextInt();

		if (LunchAnswer == 1) {
			System.out.println(
					"You head to commons and go to town on the stir fry fried rice with a little touch of sriracha on top, there's nothing like it and it makes you very happy.");
			Counter.WellbeingUp();
			Counter.HungerDown();
		} else if (LunchAnswer == 2) {
			System.out.println(
					"You head to Durfees spend your eight dollars efficiently and get some studying in for section later rather than getting caught in conversation in a big dining hall.");
			Counter.HungerDown();
			HasStudied = true;
		} else {
			System.out.println(
					"You head to your personal residential college, but the food today is awful. You can either choose to eat and damage your wellbeing(1), or not eat and go hungry(2)");
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
		Scanner console = new Scanner(System.in);
		System.out.println(
				"You finished your meal and decide that it is time to get some dedicated studying done, but where do you go?  Sterling Memorial Library(1), Your suite(2), Cross Campus(3).");
		int StudyAnswer = console.nextInt();
		if (StudyAnswer == 1) {
			System.out.println("A trip to the good-old-fashioned library");
			if (HasStudied == true) {
				System.out.println(
						"Nerd! you study so often, but you know it's good for you. You feel even less anxious about your classes.");
				Counter.WellbeingUp();
			} else {
				HasStudied = true;
			}
		} else if (StudyAnswer == 2) {
			System.out.println(
					"You decide to go to your suite, but you're suitemates are playing 3-player super smash brothers, and you can't help but be their 4th player.");
			Counter.WellbeingUp();
		} else if (StudyAnswer == 3) {
			System.out.println(
					"You go out onto the warm expanse of Cross Campus with the intent to study...But it begins to rain, and you lose all drive to study.");
			Counter.WellbeingDown();
		}
	}

	public static void Section() {
		double SectionAnswer1 = Math.round((Math.random() * 4));
		double SectionAnswer2 = Math.round((Math.random() * 4));
		System.out.println(
				"After your \"Productive Study Session\" you decide to go to discussion section for your token humanities credit");
		Scanner console = new Scanner(System.in);
		System.out.println("Is there a section A**hole in this discussion(1/0)");

		int AHoleAnswer = console.nextInt();
		if (AHoleAnswer == 1) {
			System.out.println(
					"He really is annoying, but at least he dominates the discussion and you only have to answer one question");
			System.out.println(
					"If you studied earlier you get the question right automatically, if not pick a number between 0 and 4 and hope you're right");
			if (HasStudied == true) {
				Counter.WellbeingUp();
			}
			int SectionGuess = console.nextInt();
			if (SectionGuess == SectionAnswer1) {
				System.out.println("Improvising on the spot, not too bad.");
				Counter.WellbeingUp();
			} else{
				System.out.println("Yea good try, but you embaress yourself in front of the entire discussion section.");
			Counter.WellbeingDown();
		}
		if (AHoleAnswer == 0) {
			System.out.println("Since you think there is no section A**hole, you must be the culprit yourself!");
			System.out.println(
					"Now you have to answer two questions because you talk too much, If you studied earlier you get the question right automatically, if not pick two numbers between 0 and 4 and hope you're right");
			if (HasStudied == true) {
				Counter.Wellbeing2Up();
				System.out.println("Too smart for your own good");
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
	}
	public static void Dinner() {
		System.out.println();
		System.out.println("Now you're off to dinner in your residential colleges dining hall");
			if (DinnerSecond == 0){
			System.out.println("Going to dinner after a bout of procrastination allows you to time your hunger perfectly, but all that is left is cape shark, and you hate cape shark!");
			Counter.WellbeingDown();
			Counter.HungerDown();
		}
		else{
			System.out.println("Going to dinner so early is a bold move, you see your best friends there but you know you will be hungry later, you leave happy but your stomach is dissatisfied");
			Counter.WellbeingUp();	
		}
	}

	public static void Procrastinate() {
		DinnerSecond = 0;
		System.out.println("Procrastination is essential for being a productive member of society: Netflix(1), Yale Memes for Special Snowflake Teens(2), A run to East Rock(3). Pick your Poison");
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
				System.out.println("You take a run and feel that nice runners afterglow and feel confident about your health, but it makes you even more hungry than you usually are");
				Counter.Wellbeing2Up();
				Counter.HungerUp();	
			}	
	}

	public static void Extracurricular() {

	}

	public static void Buttery() {

	}

	public static void Nighttime() {
		System.out.println("The night air is chilly but alive with the warmth of bustling bodies and alcohol. But you know you shouldn't go out tonight. Your unfinished pset fills you with guilt. Do you go to office hours (1) or bite the bullet and go to WOADS(2)?");
		Scanner console = new Scanner(System.in);
		int ProcrastinateAns = console.nextInt();
			if (ProcrastinateAns == 1){
				System.out.println("You drag yourself through the cold to a tiny room full of panicking students and jovial TAs. Of course, there are a few students who are completely chill because they finished the pset the hour it was posted and only came here to laugh at plebs like you. One of them points out that pizza was promised at office hours. You could second his request for nourishment (1) or focus on your pset (2). Note that the pizza will be Papa Johns.");
				int pizzaChoice = console.nextInt();
				if (pizzaChoice == 1){
					System.out.println("You wail frantically for pizza, praying to Steve Jobs' ghost for a large Papa Johns. You receive it, and take a big gooey bite while your peers gorge themselves on the garlic sauce. However, the promise of the great Johns distracted you from work."
							   Counter.HungerDown();
							   Counter.WellbeingDown();
				}
				else {
					System.out.println("You bite your lips, resisting the allure of pizza and let the overly enthusiastic pizza-wanter drown under the combined pressure of the death glares your peers heap on him. That puts you in a happy mood and the gods of the computing take pity on you at last, fixing your code in an inexplicable way!")
						Counter.WellbeingUp();
				}
			}
			else {
				System.out.println("You bite the bullet, throwing caution to the wind. Speaking of wind, it's cold out. Did you bring your jacket? Yes (1) No (2).");
				int jacket = console.nextInt();
				if (jacket == 1){
					System.out.println("Of course you did, doing otherwise would be irresponsible! You join the seething mass of bodies inside Toads, and get puked out at 1am, sans jacket.");
					Counter.WellbeingDown();
				}
				else {
					System.out.println("Well, whatever. Hopefully the dancing will warm you up! You jump into the swirling whirpool of dancers and leave the club at 1.");
				}
			}	
	}
}
