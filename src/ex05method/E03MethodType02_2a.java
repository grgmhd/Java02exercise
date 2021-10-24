package ex05method;

import java.util.Scanner;

public class E03MethodType02_2a 
{
/*
 시나리오] 사용자로부터 국,영,수 점수를 입력받아 평균을
 구한후 학점을 반환하는 메소드를 정의하시오.
 */
	public static void main(String[] args) 
	{
		System.out.println("학점은 "+ hakjeom());
	}
	
	static String hakjeom()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수는? ");
		int kor = scan.nextInt();
		System.out.println("영어점수는? ");
		int eng = scan.nextInt();
		System.out.println("수학점수는? ");
		int math = scan.nextInt();
		int result = (int)(kor + eng + math) / (3 * 10);
		String grade;
		switch(result)
		{
		case 10: case 9:
			grade ="A학점"; break;
		case 8:
			grade ="B학점"; break;
		case 7:
			grade ="C학점"; break;
		case 6:
			grade ="D학점"; break;
		default:
			grade ="F학점"; 
		}
		return grade;
	}

}
