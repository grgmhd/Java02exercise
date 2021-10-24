package ex04controlstatement;

public class E03While_1 
{
	public static void main(String[] args) 
	{
//시나리오] 1~10까지의 합을 구하는 프로그램을 while문으로 작성하시오.
		int i=1;
		int sum=0;
		while(i<=10)
		{
			sum+=i;
			i++;
		}
		System.out.println("1부터 10까지 더하면 "+ sum);
		
//시나리오] 1~100까지의 정수중 3의 배수이거나 4의 배수인
//정수의 합을 구하는 프로그램을 while문을 이용해서 작성하시오.
		int j=1;
		int total=0;
		while(j<=100)
		{
			if(j%3==0 || j%4==0)
			{
				total+= j;
			}
			j++;
		}
		System.out.println("100안에서 3의 배수거나 4의 배수인"
				+ " 정수의 합은 "+ total);
		
//시나리오] 구구단을 출력하는 프로그램을 작성하시오.
//단 while문을 이용하시오.
		
		int col=2;
		
		while(col<=9)
		{
			int row=1;
			while(row<=9)
			{
				System.out.printf("%d*%d=%2d",col,row,col*row);
				System.out.print("  ");
				row++;
			}
			System.out.println();
			col++;
		}
		
//시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오.
//출력결과
//	1 0 0 0
//	0 1 0 0
//	0 0 1 0
//	0 0 0 1
		int x=1;
		while(x<=4)
		{
			int y=1;
			while(y<=4)
			{
				if(x==y)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
				y++;
			}
			System.out.println();
			x++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


