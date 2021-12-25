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
		choiceTree[2] = "You ghost them back! What kind of jerk only texts you back to brag about being at a TSO concert anyways?"
				+ "\n\nWhat is your choice?\n1: Spend time practicing witchcraft instead of finding a partner. \n2: Go back on Tinder.";
		choiceTree[3] = "You choose to be patient and give them the benefit of the doubt. And they show up! The date goes\n"
				+ "well and you go on many more dates! You've been dating for about 8 months when they tell you that they're\n"
				+ "transgender! \n\nWhat is your choice?\n1: Tell them that you still accept them, and find ways to continue the relationship."
				+ "\n2: Come out to them as transphobic and dump them on the spot!";
		choiceTree[4] = "You leave the date because they shouldn't have been that late! You go home and your sister asks what happened."
				+ "\n\nWhat is your choice?\n1: Tell her the truth about how you got stood up! \n2: Lie and tell her the date happened, but you just didn't click.";
		choiceTree[5] = "You decide to start practicing witchcraft. What is the first spell you learn?"
				+ "\n\nWhat is your choice?\n1: Transfiguration.\n2: Summoning.";
		choiceTree[6] = "You match with \"Oh'BeeWan Ken Oh'bee\" and he says he is from a galaxy far far away. He loves you."
				+ "\n\nWhat is your choice?\n1: Convince him to live out his life here on Earth with you.\n2: Travel with him to his home galaxy.";
		choiceTree[7] = "You accept her with open arms and she begins her transition. Her parents don't accept her though."
				+ "\n\nWhat is your choice?\n1: Be her strongest supporter and be there any time she needs someone to talk to about the topic."
				+ "\n2: Have a Joker moment.";
		choiceTree[8] = "You reject her and move on with your life. (This story line is going to be petty, just a heads up!) :)"
				+ "\n\nWhat is your choice?\n1: Join Tinder again to find someone else. \n2: Dedicate your life to celibacy.";
		choiceTree[9] = "Your sister feels so bad that you got stood up. She decides to take you on a trip to make up for it. She asks where you want to go."
				+ "\n\nWhat is your choice?\n1: Tell her you want to go to New York. \n2: Tell her you want to go to Portland.";
		choiceTree[10] = "You lie to her and tell her that it just didn't work out. You decide to pour your heartbreak into a hobby."
				+ "\n\nWhat is your choice?\n1: Pour your heart into writing. \n2: Pour your heart into crocheting.";
		choiceTree[11] = "You decide to learn transfiguration first. What should you do with this spell?"
				+ "\n\nWhat is your choice?\n1: Turn yourself into a dragon!\n2: Turn yourself into an animal to sneak into the zoo for free!";
		choiceTree[12] = "You decide to learn summoning first. You are able to summon any creature or object you desire. What do you summon first?"
				+ "\n\nWhat is your choice?\n1: $1,000,000,000 \n2: Another Percy.";
		choiceTree[13] = "You convince him to find a place to live with you in Boise. Life is wonderful. He comes home from work and says \"Hello there\" every time he walks in the door."
				+ "\n\nWhat is your choice?\n1: Break up with him.\n2: Ask him to marry you on the spot.";
		choiceTree[14] = "You travel with him to some strange planet in a galaxy that is far far away. You find out that you are what people call a Jedi."
				+ "\n\nWhat is your choice?\n1: Reject the path and turn to the dark side. Oh'BeeWan Ken Oh'bee is too important to leave for some religion. \n2: Embrace the force and learn the path of the Jedi. This means leaving Oh'BeeWan Ken Oh'bee";
		choiceTree[15] = "You support her and help her through a lot. Around comes Christmas of 2021. She just started a new internship as a programmer, and she gives you a choose your own"
				+ "\nadventure game because she can't afford much for Christmas. It's kinda lame, or kinda cute depending on how you look at it."
				+ "\n\nWhat is your choice?\n1: Accept the gift and tell her you love it! (Even if you don't). \n2: Tell her this is the worst present you have ever received.";
		choiceTree[16] = "You did some unspeakable things to some people, and you wind up in federal prison."
				+ "\n\nWhat is your choice?\n1: Join a prison gang. \n2: Serve your sentence as you usually would.";
		choiceTree[17] = "You join Tinder again and you find a really cute girl. You chat for a bit. You two want to meet up and go on a date!"
				+ "\n\nWhat is your choice?\n1: Dress very nicely for the date to try to make a good impression. \n2: Don't overthink it, just show up in casual clothes.";
		choiceTree[18] = "You dedicate your life to celibacy. How do you go about this?"
				+ "\n\nWhat is your choice?\n1: You get REALLY into D&D. \n2: You join a monestary and live your life as a nun.";
		choiceTree[19] = "You get on a plane and fly to New York for Christmas! Where do you go to spend Christmas Eve?"
				+ "\n\nWhat is your choice?\n1: Central Park. \n2: Times Square.";
		choiceTree[20] = "You drive to Portland! Along the way you get pulled over!"
				+ "\n\nWhat is your choice?\n1: Cooperate with the police officer. \n2: Tell your sister to step on it!";
		choiceTree[21] = "You spend the next 4 years pouring your soul into your first novel."
				+ "\n\nWhat is your choice?\n1: Post the novel on AO3. \n2: Publish it!";
		choiceTree[22] = "You pour your heart into crocheting and your dad suggests you open a business by selling your craft!"
				+ "\n\nWhat is your choice?\n1: Open a brick and mortar store somewhere in Boise. \n2: Open an etsy store!";
		choiceTree[23] = "You turn yourself into a dragon!"
				+ "\n\nWhat is your choice?\n1: Make a travelling tourist attraction and profit off of your abilities.\n2: Go on a rampage and burn down everything you see!";
		choiceTree[24] = "You turn yourself into a mouse and sneak into the Boise City Zoo. But you forgot that zoo animals LOVE to eat mice! A tiger is approaching!"
				+ "\n\nWhat is your choice?\n1: Scurry away into the Gorilla pit. \n2: Turn into a BIGGER tiger!";
		choiceTree[25] = "You summon $1,000,000,000 and now have the ability to purchase anything you want in the world. What do you buy first?"
				+ "\n\nWhat is your choice?\n1: The Boise City Library!\n2: A mansion in the North End.";
		choiceTree[26] = "You summon another Percy! But you messed up the spell on accident! This is an ANTI-Percy! He's evil!"
				+ "\n\nWhat is your choice?\n1: Summon ANOTHER even BIGGER Percy!\n2: Let Percy hang out with his other self. They really do get along well.";
		choiceTree[27] = "You break up with Oh'BeeWan Ken Oh'bee. You are both heartbroken and he moves out. 3 years pass and you go to a restaraunt that you two used to eat at. You see him."
				+ "\n\nWhat is your choice?\n1: Pretend you don't see him. \n2: Approach him.";
		choiceTree[28] = "It is your wedding day. But he has something to tell you. He say's \"I have to tell you, I am what is called a Jedi, which means I can do really cool party tricks.\""
				+ "\n\nWhat is your choice?\n1: Tell him that it's okay and you accept him now matter how weird he is. \n2: Call him a weirdo and dump him.";
		choiceTree[29] = "You two rule over the galaxy with an iron fist. No one can stand up to your power. You are gods as far as everyone else is concerned. But a strange furry creature challenges you to a duel."
				+ "\n\nWhat is your choice?\n1: Order the guards to execute the creature on the spot. \n2: Accept the duel.";
		choiceTree[30] = "You embrace the force and become a powerful Jedi. But you hear a voice calling out to you from the force."
				+ "\n\nWhat is your choice?\n1: Ignore the voice. \n2: Follow the voice and learn of it's origins.";
		choiceTree[31] = "You accept the gift and you two have a wonderful Christmas together, enjoying the gift of each other's company."
				+ "\nYou got the good ending :). I love you so much baby, thank you for a wonderful Christmas and for always being my biggest support <3";
		choiceTree[32] = "You refuse the gift and she is heartbroken. She runs away crying. What are you? Heartless?";
		choiceTree[33] = "You join a prison gang and you end up taking down a broken system. You didn't deserve prison, you just made a couple bad chocies."
				+ "\nAmerica rejoices as you have sparked a revolution. Life really does take you to crazy places.";
		choiceTree[34] = "You serve your sentence by keeping your head low and serve all 20 years of your sentence. They release you on good behavior."
				+ "\nYou go and build your own life and live on happy as can be.";
		choiceTree[35] = "You end up overdressing for the date and she feels weird. She dumps you on the spot!";
		choiceTree[36] = "She is dressed in what might as well be a prom dress. She stomps off away from the date as she is flabbergasted about your attire.";
		choiceTree[37] = "You get REALLY into D&D and never end up with anyone, but you make lots of friends and have a good life living as a total nerd :)";
		choiceTree[38] = "You join a monestary and live the rest of your days dedicated to god. Nothing too exciting ever happens again tbh.";
		choiceTree[39] = "You go to Central Park for Christmas and go ice skating with your sister! All is good in the world and you enjoy the time you get to spend with her :)";
		choiceTree[40] = "You go to Times Square and take in every advertisement you can. You eat at the famous McDonald's there. It's pretty chill, just kinda lame tbh";
		choiceTree[41] = "You cooperate with the officer, but he ended up not even being a cop. He steals your car and leaves you two stranded on the highway. You now live the life of a hobo.";
		choiceTree[42] = "Your sister steps on the gas! You two speed off and live out the rest of your days as vigilante's on the run! Real Bonnie and Clyde type shit. It's cool.";
		choiceTree[43] = "You post your book on AO3 with great acclaim! You become one of the most popular writers on the site, and people regularly keep up with your writings!";
		choiceTree[44] = "You publish your book and it ends up on the New York Times best sellers list! This is a dream come true! Congratulations :)";
		choiceTree[45] = "You open a brick and mortar store to mild success, but it's just enough to get by. You live your life and end up becoming known as the \"yarn lady\". Congratulations?";
		choiceTree[46] = "You open an etsy store and people LOVE your crafts! You make enough to expand your business to other areas and eventually build a fortune doing something you love :)";
		choiceTree[47] = "You turn yourself into a travelling tourist attraction and become a national treasure. You are loved all over the country and you are a household name :)";
		choiceTree[48] = "You burn down everything in sight. Nothing is left when you are finished. You showed your true power and everyone paid for it. You are death. You are the eater of worlds. You won.";
		choiceTree[49] = "You sneak away into the Gorillapit. And suprisingly enough they adore you! You hang out with some monkeys, hand out with some Gorillas, life is good.";
		choiceTree[50] = "You fight the tiger and you win. You killed it. Are you proud? They're an endangered species, and some kid has trauma now. Are you really proud of what you've done here today?";
		choiceTree[51] = "You buy the Boise City Library! That's it. Idk what else you expected. Kinda a lame ending, I know.";
		choiceTree[52] = "You buy a mansion in the North End. You live your days as your mansion slowly gets worn down over time. Kids are afraid to step on your lawn. Your house has gotten so run down"
				+ "\nthat it literally eats childrens toys that land on your lawn. What I'm trying to say is that your house is now the house from Monster House. Congratulations.";
		choiceTree[53] = "You summon another even larger percy. You expected it to take down the evil percy, but the three of them actually end up forming a cat gang that roams the alley's of downtown Boise."
				+ "\nYou still see him from time to time and are reminded of the good times you had together. Like an old aquaintance that you've grown distant from.";
		choiceTree[54] = "They form a bond. A blood pact even. They're brothers now and Percy has turned to the dark side. Percy ended up taking over the government and Evil Percy is his right hand mand"
				+ "\nAnd yes, they are fascists. This is your fault.";
		choiceTree[55] = "You pretended not to see him. He assumes you wanted to be left alone and leaves once again. The love of your life is gone forever. You die alone.";
		choiceTree[56] = "You approach him and he confesses his undying love for you. He tells you he's sorry and begs for you to come back to him. You agree and you spend the rest of "
				+ "\nyour days together locked in a loving embrace.";
		choiceTree[57] = "You spend the rest of your days together locked in a loving embrace. Life is good. Nothing can be better than being married to Oh'BeeWan Ken Oh'bee";
		choiceTree[58] = "You break up with him because you're heartless. I hope you're happy with this choice.";
		choiceTree[59] = "The guards execute the creature. For some reason you can't help but feel heartbroken. The creature felt familiar, but you choose to ignore the consequences.";
		choiceTree[60] = "You accept the duel. After a long fight the creature comes out victorious. You lie dying on the ground when he approaches you."
				+ "\nHe says \"I'm sorry I had to do this. I wish you remembered me, Percy.\" And he leaves.";
		choiceTree[61] = "You choose to ignore the voice. But it calls you a jerk and doesn't talk to you again for a week. She is petty. It's me, Bree. Yes, I'm the voice. I'm also all-powerful. And a part of the dark side >:)";
		choiceTree[62] = "You follow the voice and find it is a powerful Sith named Darth Bree. But after many battles you choose to put your differences behind you and end up falling in love. You two love each other and rule over the"
				+ "\n galaxy in a perfect balance between dark and light.";
		
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
					+ "you to go back in time by one major event."
					+ "\nAnd listen, I know this premise isn't good, but you get the point. You're the story writer, not me.");
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
					System.out.println("\nThis is the end of this story line! Press 'b' to go back in time, or 'q' to quit!\nThanks for playing!!");
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
