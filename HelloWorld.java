package ch.fukuyau.helloworld;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("The ultimate question of Life, The Universe, and Everything is: " + computeUltimateQuestion());
	}
	public static String computeUltimateQuestion() {
		return "still searching...";
		System.out.println("The answer to the ultimate question of Life, The Universe, and Everything is: " + computeUltimateAnswer());
	}
	
	public static int computeUltimateAnswer() {
		return 6 * 7;
	}

}
