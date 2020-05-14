package p0514;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1, n2, i, sum = 0;
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요? : ");
		n1 = s.nextInt();

		for (i = 1; i <= n1; i++) {
			System.out.print("정수 입력(0입력시 종료): ");
			n2 = s.nextInt();
			
			sum = sum + n2;

			if (sum >= 1000) {
				System.out.println("합계가 1,000을 넘었습니다.");
				sum=sum-n2;
				break;
			}
		}
		System.out.printf("합계는 %d입니다.\n", sum);
		System.out.printf("평균는 %.1f입니다.\n", (float) sum / (i-1));

		s.close();

	}

}
