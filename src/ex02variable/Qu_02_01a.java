package ex02variable;

public class Qu_02_01a 
{

	public static void main(String[] args) 
	{
//1.국어, 영어, 수학점수 및 과목의 총점을 저장할수 있는 변수를 선언하시오.
//2.국어 89점, 영어 99점, 수학 78점을 대입한다.
//3.국영수 총합을 구해서 총점을 저장할 변수에 대입한다.
//4.총합점수를 출력한다.
		int kor, eng, math, total;
		kor =89; eng =99; math =78;
		total =kor + eng + math;
		System.out.printf("국어점수는 %d, 영어점수는 %d, "
				+ "수학점수는 %d, 총점은 %d",kor,eng,math,total);
	}

}
