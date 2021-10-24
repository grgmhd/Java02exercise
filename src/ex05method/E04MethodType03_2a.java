package ex05method;

import java.util.Scanner;

public class E04MethodType03_2a 
{
/*
연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
무조건 첫번째 입력받는수가 작아야한다.
입력예]
	첫번째숫자 : 3
	두번째숫자 : 12
	3*1=3 3*2=6........
	........
	...................12*9=108
메소드명 : inputGugudan(int sNum, int eNum)
 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 값을 입력하세요");
		int sN = scan.nextInt();
		System.out.println("두번째 값을 입력하세요");
		int eN = scan.nextInt();
		inputGugudan(sN, eN);
	}
	
	static void inputGugudan(int sNum, int eNum)
	{
		for(int y =sNum; y <=eNum; y++)
		{
			for(int x =1; x <=9; x++)
			{
				System.out.printf("%2d*%2d=%3d   ", y, x, x*y);
			}
			System.out.println();
		}
	}
	

}
