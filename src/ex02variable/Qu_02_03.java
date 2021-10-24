package ex02variable;

public class Qu_02_03 
{

	public static void main(String[] args) 
	{
//반지름이 10인 원의 넓이를 구해 출력하시오.
//단, 넓이의 타입을 int, double형 두가지로 선언하여 각각 출력해야한다.
//변수명] 
//	int형 : area_int
//	double형 : area_double
//공식]
//	원의넓이 = 반지름 * 반지름 * 3.14
		final double PIE =3.14;
		int radian =10;
		int area_int =(int)(radian * radian * PIE);
		double area_double =radian * radian * PIE;
		System.out.printf("반지름이 10인 원의 넓이는 %d이다.(int)%n",area_int);
		System.out.printf("반지름이 10인 원의 넓이는 %.1f이다.(double)",area_double);
	}

}
