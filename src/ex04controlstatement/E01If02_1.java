package ex04controlstatement;

import java.io.IOException;

/*
시나리오] 숫자를 홀/짝인지 먼저 판단한 후 100 이상인지를
	판단하는 프로그램을 if~else문으로 작성하시오.
*/
public class E01If02_1 
{
	public static void main(String[] args) throws IOException
	{
		int num=44;
		System.out.print(num +" 은 ");
		if(num%2==0)
		{
			if(num>=100)
			{
				System.out.print("짝수이면서 100 이상이다");
			}
			else
			{
				System.out.print("짝수이면서 100 미만이다");
			}
		}
		else
		{
			if(num>=100)
			{
				System.out.print("홀수이면서 100 이상이다");
			}
			else
			{
				System.out.print("홀수이면서 100 미만이다");
			}
		}
	}
}
