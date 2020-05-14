package p0514;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i, n, sum = 0;
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		n = s.nextInt();
		for (i = 1; i <= n; i++) {
			sum += i;

			if (i > 1) {
				System.out.print("+" + i);
			} else if (i == 1) {
				System.out.print(i);
			}
		}
		System.out.printf("=%d", sum);

		s.close();
	}

}
