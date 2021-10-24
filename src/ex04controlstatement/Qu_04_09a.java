package ex04controlstatement;

public class Qu_04_09a 
{
//구구단을 이중 for문을 이용해서 다음과 같이 출력하시오
	public static void main(String[] args) 
	{
		for(int row =1; row <=9; row++)
		{
			for(int col =2; col <=9; col++)
			{
				System.out.printf("%d*%d=%2d",col,row,col*row);
				System.out.print("  ");
			}
			System.out.println();
		}
	}

}
