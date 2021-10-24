package ex05method;

import java.util.Scanner;

public class E04MethodType03_1a 
{

	public static void main(String[] args) 
	{
//시나리오] 사용자가 입력한 2개의 시작값과 끝값 사이에 있는
//	수를 모두 더하여 출력하는 프로그램을 작성하시오.
// 	출력결과]
// 		시작값 : 5
// 		종료값 : 9
// 		결과 : 5+6+7+8+9=???
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 값을 입력하세요");
		int startN = scan.nextInt();
		System.out.println("두번째 값을 입력하세요");
		int endN = scan.nextInt();
		sequen(startN, endN);
	}

	static void sequen(int sN, int eN)
	{
		int sum =0;
		for(int i= sN; i <=eN; i++)
		{
			sum +=i;
		}
		System.out.printf("%d부터 %d 사이에 있는 정수를 모두 더하면 %d",
				sN, eN, sum);
	}
}
