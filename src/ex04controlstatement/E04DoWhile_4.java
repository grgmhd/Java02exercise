package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class E04DoWhile_4 
{

	public static void main(String[] args) throws IOException
	{
//시나리오] E03 예제의 1~10까지 더하는 수열문제를 do~while문으로
//		변경하여 구현하시오.
		int sum =0;
		int i =1;
		do
		{
			sum +=i;
			i++;
		}
		while(i<=10);
		System.out.println("1~10의 합은 "+ sum);
		
//시나리오] 1부터 1000까지의 정수 중 4의 배수이거나
//7의 배수인 수의 합을 구하여 출력하는 프로그램을 작성하시오.
//단, do~while문을 사용해야 한다.
		int total =0;
		int j =1;
		do
		{
			if(j%4==0 || j%7==0)
			{
				total +=j;
			}
			j++;
		}
		while(j<=1000);
		System.out.println("1~1000까지 4나 7의 배수인 정수의 합은 "+ total);
		
//시나리오] 국어, 영어, 수학점수를 사용자로부터 입력받은 후
//평균을 구해 A~F학점을 판단하여 출력하는 프로그램을 작성하시오.
//단, 사용자가 X,x(대소문자 구분없음)를 입력하면 프로그램이 
//종료되어야 하며 do~while문으로 구현해야 한다.
		int kor, eng, math;
		double avg;
		int exit;
		
		do
		{
			Scanner scan =new Scanner(System.in);
			System.out.println("국어점수는?");
			kor =scan.nextInt();
			System.out.println("영어점수는?");
			eng =scan.nextInt();
			System.out.println("수학점수는?");
			math =scan.nextInt();
			avg =(kor+eng+math)/3.0;
			System.out.println("평균점수는 "+ avg);
			
			if(avg >=90)
			{
				System.out.println("A학점");
			}
			else if(avg >=80)
			{
				System.out.println("B학점");
			}
			else if(avg >=70)
			{
				System.out.println("C학점");
			}
			else if(avg >=60)
			{
				System.out.println("D학점");
			}
			else
			{
				System.out.println("F학점");
			}
			System.out.println("종료하고 싶다면 x(X)를 누르세요");
			System.out.println("계속하고 싶다면 아무키나 누르세요");
			exit =System.in.read();
		}
		while(!(exit=='x' || exit=='X'));
	}

}
