package ex04controlstatement;

public class Qu_04_02a 
{

	public static void main(String[] args) 
	{
//다음 예제는 두개의 if문을 사용하고 있다.이를 하나의 if문으로 변경해보자
		
		int num = 120;
		if (num > 0) 
		{
			if ((num % 2) == 0) 
			{
				System.out.println("양수이면서 짝수");
			}
		}
		
		if (num >0 && num%2==0)
		{
			System.out.println("양수이면서 짝수");
		}
	}

		
}


