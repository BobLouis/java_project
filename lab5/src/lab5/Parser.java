package lab5;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Parser {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter a sentence and I'll display each word you entered:  ");
		String sentence = keyboard.nextLine();
		StringTokenizer tk = new StringTokenizer(sentence," ");
		System.out.println("here are the tokens");
		while(tk.hasMoreTokens()) {
			System.out.println(tk.nextToken());
		}
		
		
	}
}
