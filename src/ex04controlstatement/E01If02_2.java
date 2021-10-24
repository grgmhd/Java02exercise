package ex04controlstatement;

public class E01If02_2 
{

	public static void main(String[] args) 
	{
//시나리오] 숫자를 홀/짝인지 먼저 판단한 후 100 이상인지를
//판단하는 프로그램을 if~else문으로 작성하시오.
		int i =2;
		if(i%2==0)
		{
			System.out.printf("%d는 짝수입니다%n",i);
			if(i >=100)
			{
				System.out.printf("%d는 100 이상입니다%n",i);
			}
			else
			{
				System.out.printf("%d는 100 미만입니다%n",i);
			}
		}
		else
		{
			System.out.printf("%d는 홀수입니다%n",i);
			if(i >=100)
			{
				System.out.printf("%d는 100 이상입니다%n",i);
			}
			else
			{
				System.out.printf("%d는 100 미만입니다%n",i);
			}
		}
	}

}
