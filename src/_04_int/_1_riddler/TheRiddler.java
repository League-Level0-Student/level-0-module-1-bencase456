package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		int arraySize = 9;

		String[] riddles = new String[arraySize];

		riddles[0] = "Look in my face, I am somebody; Look in my back, I am nobody. What am I?";
		riddles[1] = "What 5 letter word typed in all capital letters can be read the same upside down?";
		riddles[2] = "How can you leave a room with two legs and return with six legs?";
		riddles[3] = "If you were running a race, and you passed the person in 2nd place, what place would you be in now?";
		riddles[4] = "Can you write down eight eights so that they add up to one thousand? (start with highest number)";
		riddles[5] = "I'm white, and used for cutting and grinding. When I'm damaged, humans usually remove me or fill me. For most animals I am a useful tool. What am I?";
		riddles[6] = "What weighs more? A pound of feathers or a pound of stones?";
		riddles[7] = "Railroad Crossing, look out for the cars. Can you spell that without any R's?";
		riddles[8] = "You use a knife to slice my head and weep beside me when I am dead. What am I?";
		String[] answers = new String[arraySize];
		answers[0] = "A Mirror";
		answers[1] = "SWIMS";
		answers[2] = "Bring A Chair";
		answers[3] = "Second";
		answers[4] = "888 + 88 + 8 + 8 + 8";
		answers[5] = "A tooth";
		answers[6] = "Neither";
		answers[7] = "That";
		answers[8] = "An Onion";

		Random rand = new Random();

		ArrayList<Integer> usedRiddles = new ArrayList<Integer>();

		int randomChoice = rand.nextInt(arraySize);

		while (usedRiddles.size() < riddles.length) {

			if (!usedRiddles.contains(randomChoice)) {

			usedRiddles.add(randomChoice);

			String answer = JOptionPane.showInputDialog(riddles[randomChoice]);

			if (answer.equalsIgnoreCase(answers[randomChoice])) {
				score++;
				JOptionPane.showMessageDialog(null, "Correct!");

			} else {
				JOptionPane.showMessageDialog(null, answers[randomChoice]);
				JOptionPane.showMessageDialog(null, "Your Final Score Was: " + score);
				break;
			}
			}
			
			randomChoice = rand.nextInt(arraySize);
		}

		if(score==riddles.length) {
			JOptionPane.showMessageDialog(null, "You Won! (Somehow?)");
		}
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.

	}
}
