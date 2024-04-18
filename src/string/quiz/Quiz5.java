package string.quiz;

import java.util.Scanner;

/*
 * "요세하녕안"
 * */
public class Quiz5 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		StringBuilder builder = new StringBuilder(str);
		builder.reverse(); 
		System.out.println(builder.toString());

	}

}
