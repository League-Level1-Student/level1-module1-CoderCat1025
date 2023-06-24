package _07_duck;

public class Cat {
	String bestFriend;
	int numberOfDollars;
	
void friend() {
	System.out.println("My best friend's name is " +bestFriend+ ".");
}

void money() {
	System.out.println("I have " +numberOfDollars+ " dollars in my pocket.");
}

Cat(String bestFriend, int numberOfDollars) {
	this.bestFriend = bestFriend;
	this.numberOfDollars = numberOfDollars;
}
}
