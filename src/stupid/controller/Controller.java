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
		myName = "Geran.Kunz";
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
		System.out.println("Oh, you said: "+input+" about your day.");
		System.out.println("its random time" + (rand.nextInt(10)+1));
				
	}

}
