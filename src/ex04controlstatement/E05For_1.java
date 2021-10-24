package ex04controlstatement;

public class E05For_1 
{

	public static void main(String[] args) 
	{
//시나리오] 1~100까지의 합을 구하는 프로그램을 for문을
//	이용하여 작성하시오.
		int sum =0;
		for(int i =1; i <=100; i++)
		{
			sum += i;
		}
		System.out.println("1~100까지 정수의 합은 "+ sum);
	
//시나리오] for문을 이용하여 1~10사이의 정수 중 2의 배수의 합을
//	구하는 프로그램을 작성하시오.
		int total =0;
		for(int j =1; j<=10; j++)
		{
			if(j%2==0)
			{
				total +=j;
				System.out.println(j);
			}
		}
		System.out.println("1~10까지 정수 중 2의 배수의 합은 "+ total);
		
		total =0;
		for(int j =0; j <=10; j +=2)
		{
			total +=j;
		}
		System.out.println("1~10까지 정수중 2의 배수의 합은(2) "+ total);
		
//연습문제1] 구구단을 출력하는 프로그램을 for문으로 작성하시오.
		for(int col =2; col <=9; col++)
		{
			for(int row =1; row <=9; row++)
			{
				System.out.printf("%d*%d=%2d",col,row,col*row);
				System.out.print("  ");
			}
			System.out.println();
		}
		
//연습문제2] 다음의 출력결과를 보이는 for문을 작성하시오
//출력결과
//	0 0 0 1
//	0 0 1 0
//	0 1 0 0
//	1 0 0 0
		for(int y =1; y <=4; y++)
		{
			for(int x =1; x <=4; x++)
			{
				if(x+y==5)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
