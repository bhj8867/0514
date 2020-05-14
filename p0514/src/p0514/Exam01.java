package p0514;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x, y, z;
		System.out.println("정숫값 x,y,z의 평균은 구합니다.");
		System.out.print("x값 : ");
		x = s.nextInt();
		System.out.print("y값 : ");
		y = s.nextInt();
		System.out.print("z값 : ");
		z = s.nextInt();
		System.out.printf("x,y,z의 평균은 %.3f입니다.", (float) (x + y + z) / 3);

		s.close();
	}

}
