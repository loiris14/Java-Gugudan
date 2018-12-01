import java.util.Scanner;

public class Gugudan {
//	public static void main(String[] args) {
		// for문 사용
/*		while(true) {  
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
		}*/
		
		// 배열 사용
/*		int[] dan = new int[9];
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("출력할 단을 입력하세요.");
			int number = scanner.nextInt();
			if(number < 2) {
				System.out.println("2 이상의 값을 입력하세요.");
			}else if(number > 9) {
				System.out.println("9 이하의 값을 입력하세요.");
			}
			else {
				System.out.println(number + "단");
				for(int i = 0; i < dan.length; i++) {
					dan[i] = (i+1) * number; 
				}
				for(int i = 0; i< dan.length; i++) {
					System.out.println(dan[i]);
				}
			}
		}*/
//	}
	// 메소들를 사용 - 구구단 전체 출력
/*	public static int[] calculate(int times) {
		int dan[] = new int[9];
		for(int i = 0; i< dan.length; i++) {
			dan[i] = (i+1) * times;
		}
		return dan;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		for(int j = 2; j<10; j++) {
			print(calculate(j));
			
		}
	}*/
	public static int[] calculate(int times) {
		int dan[] = new int[9];
		for(int i = 0; i< dan.length; i++) {
			dan[i] = (i+1) * times;
		}
		return dan;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
