package object;

/*
 * <다운캐스팅 복습>
 * 
 * 1. 3번째 예제에서 작성한 Student클래스를 재사용하세요.
 * 2. Object형 변수를 선언하고 Student객체를 대입하세요.
 * 3. Object형 변수를 사용해서 학번과 이름을 출력하세요.
 * */

public class Quiz2 {

	public static void main(String[] args) {

		Object obj = new Student(1001, "둘리"); 
		
		if (obj instanceof Student) { 
			Student student = (Student)obj; 
			System.out.println("학번: " + student.id);
			System.out.println("이름: " + student.name);
		}		
		
	}
}
