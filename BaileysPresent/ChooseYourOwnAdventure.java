import java.util.*;


public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		char choice = '\0';
		//Scanner for user input
		Scanner input = new Scanner(System.in);
		Stack<Integer> previousChoices = new Stack<Integer>();
		int MAX_TREE_SIZE = 63;
		String[] choiceTree = new String[MAX_TREE_SIZE];
		
		
		System.out.println("Launching...");
		choiceTree[0] = "It's November 2019. You match with someone on Tinder, but they ghost you for a week and the\n"
				+ "only time they message you back is when they're at a TSO concert. You start talking and eventually\n"
				+ "they ask you on a date! \n\nWhat is your choice?\n1: Say yes and go on the date.\n2: Say no and ghost them back!";
		choiceTree[1] = "You go to the Village for the date! You find a very nice place to meet up, but they're gonna be 30 minutes late!"
				+ "\n\nWhat is your choice?\n1: Wait for them, maybe they're just at a Christmas tree lighting! \n2: Leave and don't look back!";
		choiceTree[2] = "2";
		choiceTree[3] = "You choose to be patient and give them the benefit of the doubt. And they show up! The date goes\n"
				+ "well and you go on many more dates! You've been dating for about 8 months when they tell you that they're\n"
				+ "transgender! \n\nWhat is your choice?\n1: Tell them that you still accept them, and find ways to continue the relationship."
				+ "\n2: Come out to them as transphobic and dump them on the spot!";
		choiceTree[4] = "4";
		choiceTree[5] = "5";
		choiceTree[6] = "6";
		choiceTree[7] = "You accept her with open arms and she begins her transition. Her parents don't accept her though."
				+ "\n\nWhat is your choice?\n1: Be her strongest supporter and be there any time she needs someone to talk to about the topic."
				+ "\n2: Have a Joker moment.";
		choiceTree[8] = "8";
		choiceTree[9] = "9";
		choiceTree[10] = "10";
		choiceTree[11] = "11";
		choiceTree[12] = "12";
		choiceTree[13] = "13";
		choiceTree[14] = "14";
		choiceTree[15] = "Around comes Christmas of 2021. She just started a new internship as a programmer, and she gives you a choose your own"
				+ "\nadventure game because she can't afford much for Christmas. It's kinda lame, or kinda cute depending on how you look at it."
				+ "\n\nWhat is your choice?\n1: Accept the gift and tell her you love it! (Even if you don't). \n2: Tell her this is the worst present you have ever received.";
		choiceTree[16] = "16";
		choiceTree[17] = "17";
		choiceTree[18] = "18";
		choiceTree[19] = "19";
		choiceTree[20] = "20";
		choiceTree[21] = "21";
		choiceTree[22] = "22";
		choiceTree[23] = "23";
		choiceTree[24] = "24";
		choiceTree[25] = "25";
		choiceTree[26] = "26";
		choiceTree[27] = "27";
		choiceTree[28] = "28";
		choiceTree[29] = "29";
		choiceTree[30] = "30";
		choiceTree[31] = "You accept the gift and you two have a wonderful Christmas together, enjoying the gift of each other's company."
				+ "\nYou got the good ending :). I love you so much baby, thank you for a wonderful Christmas and for always being my biggest support <3";
		choiceTree[32] = "32";
		choiceTree[33] = "33";
		choiceTree[34] = "34";
		choiceTree[35] = "35";
		choiceTree[36] = "36";
		choiceTree[37] = "37";
		choiceTree[38] = "38";
		choiceTree[39] = "39";
		choiceTree[40] = "40";
		choiceTree[41] = "41";
		choiceTree[42] = "42";
		choiceTree[43] = "43";
		choiceTree[44] = "44";
		choiceTree[45] = "45";
		choiceTree[46] = "46";
		choiceTree[47] = "47";
		choiceTree[48] = "48";
		choiceTree[49] = "49";
		choiceTree[50] = "50";
		choiceTree[51] = "51";
		choiceTree[52] = "52";
		choiceTree[53] = "53";
		choiceTree[54] = "54";
		choiceTree[55] = "55";
		choiceTree[56] = "56";
		choiceTree[57] = "57";
		choiceTree[58] = "58";
		choiceTree[59] = "59";
		choiceTree[60] = "60";
		choiceTree[61] = "61";
		choiceTree[62] = "62";
		
		try {
			java.util.concurrent.TimeUnit.SECONDS.sleep(4);
			System.out.println("Hello Bailey!");
			System.out.println("I know I didn't get you a lot for Christmas this year, but I wanted to do SOMETHING nice for you,"
					+ " so this is your present!");
			java.util.concurrent.TimeUnit.SECONDS.sleep(5);
			System.out.println("This is a choose your own adventure game! I hope you like it, I spent a lot of time working on it! :)");
			java.util.concurrent.TimeUnit.SECONDS.sleep(5);
			System.out.println("We will start by taking you WAY back to the start of our relationship. Naturally, you've made a lot of choices during that time.");
			java.util.concurrent.TimeUnit.SECONDS.sleep(7);
			System.out.println("This is a fun way of me showing what I think would have happened, had you chosen differently :)");
			java.util.concurrent.TimeUnit.SECONDS.sleep(5);
			System.out.println("I hope you're ready! Give me a few seconds to get the game started :)");
			java.util.concurrent.TimeUnit.SECONDS.sleep(5);
			System.out.println("I love you!!!");
			java.util.concurrent.TimeUnit.SECONDS.sleep(8);
			System.out.println("\n\nWELCOME TO THE CHOOSE YOUR OWN ADVENTURE GAME!!!");
			java.util.concurrent.TimeUnit.SECONDS.sleep(4);
			System.out.println("Let's go over how the game works.");
			java.util.concurrent.TimeUnit.SECONDS.sleep(4);
			System.out.println("Facebook has gotten to be so powerful that they have developed an app on your phone that will allow\n"
					+ "you to go back in time by one major event. But the premise is very specific, it can only be used for major events in romantic"
					+ "\nrelationships. And listen, I know this premise isn't good, but you get the point. You're the story writer, not me.");
			java.util.concurrent.TimeUnit.SECONDS.sleep(15);
			System.out.println("\nYou can go back in time by one major event at any time simply by entering 'b' when you are prompted to make a choice.");
			java.util.concurrent.TimeUnit.SECONDS.sleep(4);
			System.out.println("\nLet's begin.");
			java.util.concurrent.TimeUnit.SECONDS.sleep(2);
			
			int currentIndex = 0;
			String choiceAsString;
			while(choice != 'q') {
				System.out.println("");
				if(currentIndex >= 31) {
					System.out.println(choiceTree[currentIndex]);
					System.out.println("This is the end of this story line! Press 'b' to go back in time, or 'q' to quit!\nThanks for playing!!");
					choiceAsString = input.next();
					choice = choiceAsString.charAt(0);
					while(!(choice == '1'|| choice == '2' || choice == 'b' || choice == 'q')) {
						System.err.println("Invalid input. Please try again");
						choiceAsString = input.next();
						choice = choiceAsString.charAt(0);
					}
					switch(choice) {
					case 'b':
						if(previousChoices.isEmpty()) {
							currentIndex = 0;
						} else {
							currentIndex = previousChoices.pop();	
						}
						break;
					case 'q':
						System.out.println("Exiting in...");
						java.util.concurrent.TimeUnit.SECONDS.sleep(1);
						System.out.println("3...");
						java.util.concurrent.TimeUnit.SECONDS.sleep(1);
						System.out.println("2...");
						java.util.concurrent.TimeUnit.SECONDS.sleep(1);
						System.out.println("1...");
						java.util.concurrent.TimeUnit.SECONDS.sleep(1);
						System.out.println("Goodbye!");
						java.util.concurrent.TimeUnit.SECONDS.sleep(5);
						break;
					default:
						break;
					}
				} else {
					System.out.println(choiceTree[currentIndex]);
					System.out.println(choicePrompt());
					choiceAsString = input.next();
					choice = choiceAsString.charAt(0);
					while(!(choice == '1'|| choice == '2' || choice == 'b' || choice == 'q')) {
						System.err.println("Invalid input. Please try again");
						choiceAsString = input.next();
						choice = choiceAsString.charAt(0);
					}
					switch(choice) {
					case '1':
						previousChoices.push(currentIndex);
						currentIndex = leftNodeChosen(currentIndex);
						break;
					case '2':
						previousChoices.push(currentIndex);
						currentIndex = rightNodeChosen(currentIndex);
						break;
					case 'b':
						if(previousChoices.isEmpty()) {
							currentIndex = 0;
						} else {
							currentIndex = previousChoices.pop();	
						}
						break;
					case 'q':
						System.out.println("Goodbye!");
						break;
					default:
						break;
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.exit(1);
		}
		input.close();
	}
	
	static String choicePrompt() {
		return "Enter '1' for option 1. \nEnter '2' for option 2. \nEnter 'b' to go back by one event. \nEnter 'q' to quit!";
	}
	
	//2n + 1
	public static int leftNodeChosen(int inputIndex) {
		return (2*inputIndex)+1;
	}
	
	//2n+2
	public static int rightNodeChosen(int inputIndex) {
		return (2*inputIndex)+2;
	}
}
