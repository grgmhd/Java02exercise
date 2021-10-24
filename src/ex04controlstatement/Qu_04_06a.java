package ex04controlstatement;

public class Qu_04_06a 
{
//다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
	public static void main(String[] args) 
	{
		int y =1;
		while(y <=5)
		{
			int x =1;
			while(x <=5)
			{
				if(y >=x)
				{
					System.out.print("* ");
				}
				x++;
			}
			System.out.println();
			y++;
		}
	}
}
