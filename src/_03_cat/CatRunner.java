package _03_cat;

public class CatRunner {
public static void main(String[] args) {
	Cat cat = new Cat ("no name :(");
	cat.meow();
	cat.printName();
	while (cat.getLives() > -1) {
		cat.kill();
	}
}
}
