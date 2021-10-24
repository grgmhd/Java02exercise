package ex04controlstatement;

//다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
public class Qu_04_08a 
{
	public static void main(String[] args) 
	{
		for(int y =1; y <=5; y++)
		{
			for(int x =1; x <=5; x++)
			{
				if(y+x<=6)
					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		// *를 출력할 행의 갯수를 상수로 표현
		/*
		 ROW(행의 개수) -x+1
		 	:변수 x가 증가함에 따라 점점 감소하는
		 	y를 표현하기 위한 일반식 정의
		 x가 1일때 : 5 -1 +1 =5
		 ...
		 x가 5일때 : 5 -1 +1 =5
		 */
		final int ROW =5;
		for(int x=1; x<=ROW; x++)
		{
			for(int y=1; y<=(ROW-x+1); y++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
	
