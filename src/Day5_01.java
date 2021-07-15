import java.util.Scanner;

public class Day5_01 {

	public static void main(String[] args) {
		System.out.println("===Test1 Start===");
		// 11,20,32
		int num1 = 11;
		int num2 = 20;
		int num3 = 32;
	
		int [] numbers = new int [3];
		
		System.out.println(numbers);
		
		numbers [0]=10;
		numbers [1]=20;
		numbers [2]=30;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[2]);
		
		System.out.println("배열의 크기 : "+numbers.length);
		
		//2.12, 2.3, 4.123,5.0 배열 선언하고 데이터 대입
		
		double [] nums = new double[4];
		nums [0] =2.12;
		nums [1] =2.3;
		nums [2] =4.123;
		nums [3] =5.0;
		
		//문자열을 담을 배열 3칸짜리 생성
		//모두 출력
		
		String [ ] word = new String[3];
		System.out.println(word[0]);
		System.out.println(word[1]);
		System.out.println(word[2]);
		
		
		//스캐너를 담을 배열 2칸짜리 생성
		//모두 출력
		
		Scanner [ ] sc = new Scanner[2];
		System.out.println(sc[0]);
		System.out.println(sc[1]);
		
		
	}

}
