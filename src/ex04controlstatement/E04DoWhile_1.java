package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class E04DoWhile_1 
{
	public static void main(String[] args) throws IOException
	{
		
//시나리오] E03 예제의 1~10까지 더하는 수열문제를 do~while문으로
//	변경하여 구현하시오.
		int i=1;
		int sum=0;
		do
		{
			sum+=i;
			i++;
		}
		while(i<=10);
		System.out.println("1부터 10까지 더하면 "+sum);
		System.out.println();
		
//시나리오] 1부터 1000까지의 정수 중 4의 배수이거나
//7의 배수인 수의 합을 구하여 출력하는 프로그램을 작성하시오.
//단, do~while문을 사용해야 한다.
		int total=0;
		int j = 1;
		do
		{
			if(j%4==0 || j%7==0)
			{
				total+=j;
			}
			j++;
		}
		while(j<=1000);
		System.out.println("1부터 1000까지 4의배수이거나 "
				+ "7의배수인 수의 합 "+total);
		System.out.println();
		
//시나리오] 국어, 영어, 수학점수를 사용자로부터 입력받은 후
//평균을 구해 A~F학점을 판단하여 출력하는 프로그램을 작성하시오.
//단, 사용자가 X,x(대소문자 구분없음)를 입력하면 프로그램이 
//종료되어야 하며 do~while문으로 구현해야 한다.
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, avg;
		int exitCode;
		do
		{
			System.out.print("국어점수:");
			kor = scanner.nextInt();
			System.out.print("영어점수:");
			eng = scanner.nextInt();
			System.out.print("수학점수:");
			math = scanner.nextInt();
			avg = (kor+eng+math)/(3*10);
			
			switch(avg)
			{
				case 10: case 9:
					System.out.println("A학점");break;
				case 8:
					System.out.println("B학점");break;
				case 7:
					System.out.println("C학점");break;
				case 6:
					System.out.println("D학점");break;
				default:
					System.out.println("F학점");break;
					
			}
			System.out.println("종료하려면 x(X)를 입력하세요.");
			System.out.println("계속하려면 아무키나 입력하세요.");
			exitCode = System.in.read();
		}
		while(!(exitCode=='x' || exitCode=='X'));
	}
}
