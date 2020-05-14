package p0514;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, i, k;
		System.out.println("왼쪽 아래가 직각인 삼각형을 표시합니다.");
		System.out.print("단수는? : ");
		n = s.nextInt();
		for (i = n; i >= 1; i--) {
			for (k = 1; k <= i; k++) {
				System.out.print("*");

			}
			System.out.println();
		}
		s.close();
	}

}
