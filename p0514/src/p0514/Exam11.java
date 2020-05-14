package p0514;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1;
		double sum=0;
		System.out.print("요소 수 : ");
		n1=s.nextInt();
		
		double[]a=new double[n1];
	
		for(int i=0;i<n1;i++){
			System.out.printf("a[%d]=",i);
			double n2;
			n2=s.nextDouble();
			a[i] = n2;
			sum=sum+a[i];
		}
		System.out.printf("모든 요소의 합은 %.1f입니다.\n",sum);
		System.out.printf("모든 요소의 평균은 %.2f입니다 ",sum/a.length);
		s.close();
	}

}
