package ex05method;

import java.util.Scanner;

public class E05MethodType04_2a 
{
/*
 시나리오] 여러개의 숫자를 입력받은 후 최대값을 구하는 메소드를
 	정의하시오. 단, 숫자의 갯수는 매개변수로 전달받고
 	숫자의 갯수만큼 Scanner 클래스를 통해 입력받는다.
 	입력받은 숫자 중 최대값을 찾아서 반환하도록 정의한다.
 */
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자의 개수는?");
		int count = scan.nextInt();
		System.out.printf("%d개의 숫자중 최대값은 %d이다.", 
				count, maxValue(count));
	}
	
	static int maxValue(int cnt)
	{
		Scanner scan = new Scanner(System.in);
		int maxVal =0;
		for(int i =1; i <=cnt; i++)
		{
			System.out.printf("숫자를 입력하세요 %d/%d", i, cnt);
			int inputNum = scan.nextInt();
			
			if(i==1)
				maxVal =inputNum;
			else
				if(maxVal <inputNum)
					maxVal =inputNum;
		}	
		return maxVal;
	}
}
