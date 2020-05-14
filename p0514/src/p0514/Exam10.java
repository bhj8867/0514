package p0514;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1, n2;

		System.out.print("요소 수 : ");
		n1 = s.nextInt();

		int[] a = new int[n1];

		for (int i = 0; i < n1; i++) {
			System.out.printf("a[%d]=", i);
			a[i] = s.nextInt();
		}
		System.out.print("찾을 숫자 : ");
		n2 = s.nextInt();

		boolean m = true;

		for (int i = 0; i < a.length; i++) {
			if (n2 == a[i]) {
				System.out.printf("그 값은 a[%d]에 있습니다.", i);
				m = true;
				break;
					} 
			else {
				m = false;
			}
		}
		if (m == false) {
			System.out.print("찾을 값이 없습니다.");
		}

		s.close();
	}
}
