package projectA03;

public class projectA0328 {
	enum Week {월, 화, 수, 목, 금, 토, 일}

	public static void main(String[] args) {
		for(Week day:Week.values()) {
			System.out.print(day+"요일");
		}

		Week day = '월';
	}

}
