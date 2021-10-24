package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class E04DoWhile_5 
{

	public static void main(String[] args) throws IOException
	{
//시나리오] 국어, 영어, 수학점수를 사용자로부터 입력받은 후
//평균을 구해 A~F학점을 판단하여 출력하는 프로그램을 작성하시오.
//단, 사용자가 X,x(대소문자 구분없음)를 입력하면 프로그램이 
//종료되어야 하며 do~while문으로 구현해야 한다.
		int kor, eng, math, avg;
		int exit;
		do
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("국어점수?");
			kor =scan.nextInt();
			System.out.println("영어점수?");
			eng =scan.nextInt();
			System.out.println("수학점수?");
			math =scan.nextInt();
			avg =(kor+eng+math)/(3*10);
			System.out.println("평균점수? "+avg);
			switch(avg)
			{
				case 10: case 9:
					System.out.println("A학점"); break;
				case 8:
					System.out.println("B학점"); break;
				case 7:
					System.out.println("C학점"); break;
				case 6:
					System.out.println("D학점"); break;
				default:
					System.out.println("F학점"); break;
			}
			System.out.println("종료하려면 x(X)");
			System.out.println("계속하려면 아무키");
			exit =System.in.read();
		}
		while(!(exit=='x' || exit=='X'));
	}

}
