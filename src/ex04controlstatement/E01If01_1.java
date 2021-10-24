package ex04controlstatement;

import java.io.IOException;

/*
 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을 
 if 문을 이용해서 작성하자.
 아스키코드는 0=48, 9=57이다.
 */
public class E01If01_1 
{

	public static void main(String[] args) throws IOException
	{
		System.out.println("문자를 하나 입력해");
		int ascii = System.in.read();
		System.out.println("입력한 문자는 "+ (char)ascii);
		
		if(ascii>=48 && ascii<=57)
		{
			System.out.println("숫자 맞음");
		}
		else
		{
			System.out.println("숫자 아님");
		}
		if(ascii>='0' && ascii<='9')
		{
		System.out.println("숫자 맞아");	
		}
		else
		{
			System.out.println("숫자 아니야");
		}
	}

}
