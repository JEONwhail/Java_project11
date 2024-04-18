package wrapper.quiz;

import java.util.Scanner;

/*
 * Scanner 클래스의 nextLine 메소드를 사용하여 정수 두개를 입력받으세요.
 * 
 * 그리고 두 정수를 더한 결과를 출력하세요.
 * 
 * ex) 10, 5 => 15
 * 
 * */

public class Quiz5 {
	
	public static void main(String[] args) {
		
		Scanner hab = new Scanner(System.in);
		
		String num1 = hab.nextLine(); 
		
		String num2 = hab.nextLine(); 
		
		int habFull = Integer.parseInt(num1) + Integer.parseInt(num2); 
		
		System.out.println("두 정수를 더한 결과: " + habFull);
		
	}
	
}
