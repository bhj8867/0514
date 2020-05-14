package p0514;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, i, prd = 1;
		System.out.print("정숫값 : ");
		n = s.nextInt();

		for (i = 1; i <= n; i++) {

			prd = i * i;
			System.out.printf("%d의 제곱은 %d입니다.\n", i, prd);

		}
		s.close();
	}
}
