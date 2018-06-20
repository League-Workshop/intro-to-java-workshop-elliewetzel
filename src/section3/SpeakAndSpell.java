package section3;

import javax.swing.JOptionPane;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("Spell madlebrot");
		// 2. Catch the user's answer in a String
		String answer = JOptionPane.showInputDialog("Type the last word of the sentence fragemt?");
		// 3. If the user spelled the word correctly, speak "correct"
		if(answer.equals("madlebrot")) {
		JOptionPane.showMessageDialog(null, "Correct");}
		// 4. Otherwise say "wrong"
		else {
			JOptionPane.showMessageDialog(null, "You are wrong");
		}
		// 5. repeat the process for other words
		speak("Spell melancholy");
		String written = JOptionPane.showInputDialog("Type the word spoken");
		if(written.equals("melancholy")) {
			JOptionPane.showMessageDialog(null, "Correct");}
		else {JOptionPane.showMessageDialog(null, "The answer is incorrect.");
		}
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


