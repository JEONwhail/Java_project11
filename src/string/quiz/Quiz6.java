package string.quiz;

import java.util.*;


public class Quiz6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//while(true)
		while (true) {
			
			System.out.print("문장 입력:");
			String line = sc.nextLine(); 
			
			if (line.toLowerCase().equals("end")) { 
				break;
			}
			
			if (line.equalsIgnoreCase("end")) {
				break;
			}
			
			if (line.equals("end") || line.equals("END")) {
				break;
			}
			

			
		}
		
	}
}