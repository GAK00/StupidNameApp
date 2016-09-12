package stupid.controller;

import java.util.Scanner;
import java.util.Random;

public class Controller
{
	private String myName;
	private Scanner inputReader;
	private Random rand;

	public Controller()
	{
		myName = "Geran Kunz";
		inputReader = new Scanner(System.in);
		rand = new Random();
	}

	public void start()
	{
		System.out.println("This app is less stupid");
		System.out.println(myName);
		askQuestions();
	}

	private void askQuestions()
	{
		System.out.println("How is your day?");
		String input = inputReader.nextLine();
		System.out.println("Oh, you said: " + input + " about your day.");
		int decision = rand.nextInt(3) + 1;
		if (input.length() >= 20)
		{
			switch (decision)
			{
			case 1:

				System.out.println("Wow you had a lot to say, it's not giberish is it");
				break;
			case 2:
				System.out.println("calm down");
				break;
			case 3:
				System.out.println(";asjdf;iojasdpoifu there how do you like it when i key mash at you");
				break;
			}

		} else if (input.length() <= 2)
		{
			switch (decision)
			{
			case 1:
				System.out.println("Not very chatty today huh?");
				break;
			case 2:
				System.out.println("Less than 2 words do you know what a sentence is boy");
				break;
			case 3:
				System.out.println("I mean thats not even really a word");
			}
		}

		System.out.println("What is the best type of food?");
		String foodInput = inputReader.next();
		System.out.println("OK, you typed this: " + foodInput);

		System.out.println("Are you calm");


		String usable_answer = inputReader.findInLine("yes");
		if (usable_answer == null)
		{
			usable_answer = "";
		}

		if (usable_answer.equals("yes"))
		{
			System.out.println("good for you");
		} else
		{
			System.out.println("oh dear calm down");
		}
//yo muy bonita
		System.out.println("how annyed do you want to be in the form of an integer");
		inputReader.nextLine();
		if (inputReader.hasNextInt())
		{
			int annoy = inputReader.nextInt();
			for (int counter = 0; annoy >= counter; counter++)
			{
				System.out.println("annoy");
			}
		} else
		{
			System.out.println("are you trying to crash me with improper input well it won't work not today");
			inputReader.nextLine();
		}
		System.out.println("whats your favorite number");
		if (inputReader.hasNextDouble())
		{
			double FavoriteNumber = inputReader.nextDouble();
			System.out.println("fun mine is " + Math.sqrt(FavoriteNumber));
		} else
		{
			System.out.println("are you trying to crash me with improper input well it won't work not today");
			inputReader.nextLine();
		}

		System.out.println("what is your favorite color");
		System.out.println("You said: " + inputReader.nextLine());
		System.out.println("do you have a pet");
		System.out.println("You said: " + inputReader.nextLine());
		System.out.println("do you like snacks");
		System.out.println("You said: " + inputReader.nextLine());
	}
}
