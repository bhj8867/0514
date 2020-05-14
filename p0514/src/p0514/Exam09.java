package p0514;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n1,sum=0,max=0,min=0;
		System.out.print("사람 수 : ");
		n1=s.nextInt();
		System.out.println("점수를 입력하세요.");
		
		int[]a=new int[n1];
		for(int i=0;i<a.length;i++){
			System.out.printf("%d번의 점수 : ",i+1);
			a[i]=s.nextInt();
			sum=sum+a[i];
			
			
			if(max<a[i]){
				max=a[i];
			}
			if(i==0){//배열의 첫번째 값은 최소값으로 설정
				min=a[i];
			}
			if(min>a[i]){
				min=a[i];
			}
		}
		System.out.printf("합계는 %d점 입니다.\n",sum);
		System.out.printf("평균는 %.1f점 입니다.\n",(float)sum/n1);
		
		System.out.printf("최고점은 %d점 입니다.\n",max);
		System.out.printf("최저점은 %d점 입니다.\n",min);
		
		s.close();
	}

}
