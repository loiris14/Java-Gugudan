import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		while(true) {
		System.out.println("출력하고 싶은 단을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number < 2){
			System.out.println("2 이상 값을 입력하세요.");
		} else if(number > 9) {
			System.out.println("9 이하 값을 입력하세요");
		}
		else {
			System.out.println(number + "단");
			for(int i = 1; i<10; i++) {
				System.out.println(number * i);
			}
		}
		}
	}
}
