package ex05method;

import java.util.Scanner;

public class E05MethodType04_1a 
{
/*
 시나리오] 인원수를 매개변수로 전달받아 인원수만큼 나이를 입력받아서
 그 나이의 합을 반환하는 메소드를 작성하시오.
 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("인원수는?");
		int headCnt = scan.nextInt();
		System.out.printf("%d명의 나이 합은 %d 이다."
				, headCnt, Census(headCnt));
	}
	
	static int Census(int hC)
	{
		Scanner scan = new Scanner(System.in);
		int sum =0;
		for(int i=1; i <=hC; i++)
		{
			System.out.printf("%d/%d번째 사람의 나이를 입력하세요", 
					i, hC);
			int scanAge = scan.nextInt();
			sum += scanAge;
		}
		return sum;
	}
}
