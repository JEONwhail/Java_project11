package object;

// 연도,월,일을 멤버로 가지는 Date클래스를 만드세여
// 다음과 같이 인스턴트를 2개 생성하세요
// MyDate date1 = new MyDate(2024, 4, 16)
// MyDate date2 = new MyDate(2024, 4, 16)

public class Quiz1 {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(2024, 4, 16);
		MyDate date2 = new MyDate(2024, 4, 16);
//		MyDate date2 = new MyDate(2024, 4, 26);

		if (date1.equals(date2)) {
			System.out.println("date1와 date2는 같은 날짜입니다.");
		} else {
			System.out.println("date1와 date2는 같은 날짜가 아닙니다.");
		}
	}
}

class MyDate {
	int year;
	int month;
	int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof MyDate) {
			MyDate date = (MyDate) obj;
			
			return (this.day == date.day && this.month == date.month && this.year == date.year);
		}

		return false;
	}

}
