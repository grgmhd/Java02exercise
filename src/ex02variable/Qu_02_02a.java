package ex02variable;

public class Qu_02_02a 
{

	public static void main(String[] args) 
	{
//국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
//평균점수를 구해서 출력하는 프로그램을 작성하시오.
		int kor, eng, math;
		kor =99; eng =80; math =96;
		double avg =(kor + eng + math)/3.0;
		System.out.printf("국어점수는 %d, 영어점수는 %d, "
				+ "수학점수는 %d, 평균점수는 %.2f", kor, eng, math, avg);
	}

}
