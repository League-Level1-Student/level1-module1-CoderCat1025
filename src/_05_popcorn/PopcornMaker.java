package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Microwave microwave = new Microwave();
	String flavor = JOptionPane.showInputDialog("What flavor of popcorn would you like?");
	Popcorn popcorn = new Popcorn(flavor);
	microwave.putInMicrowave(popcorn);
	String time = JOptionPane.showInputDialog("How many minutes would you like to cook the popcorn for?");
int cookTime = Integer.parseInt(time);
microwave.setTime(cookTime);
microwave.startMicrowave();
popcorn.eat();
}
}
