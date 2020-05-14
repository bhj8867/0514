package p0514;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, i, sum = 0,n1,c=0;
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요? : ");
		n = s.nextInt();

		for (i = 1; i <= n; i++) {
			System.out.print("정수 입력 : ");
			n1 = s.nextInt();

			if (n1 < 0) {
				System.out.println("음수는 더하지 않습니다.");
	
			}else{
				c=c+1;
			sum = sum + n1;}
		}
		System.out.printf("합계는 %d입니다.\n", sum);
		System.out.printf("평균는 %.1f입니다.\n", (float) sum / c);

		s.close();
	}

}
