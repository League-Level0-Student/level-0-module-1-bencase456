package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	
	String bday = JOptionPane.showInputDialog("when is your birthday? (mm/dd)");
	
	if(bday.equalsIgnoreCase("06/29")) {
		JOptionPane.showMessageDialog(null, "Aww, well Merry Early Unbirthday to you!");
	}else {
		JOptionPane.showMessageDialog(null, "What a coincidence, Merry Unbirthday!");
	}
	
	
	
	
}
}
