package ex04controlstatement;

import java.io.IOException;

public class E01If01_4 
{

//시나리오] 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을
//if문을 이용해서 작성하시오.
	public static void main(String[] args) throws IOException
	{
		System.out.println("문자를 입력하세요");
		int ascii =System.in.read();
		if(ascii >='0' && ascii <='9')
		{
			System.out.println("숫자입니다");
		}
		else
		{
			System.out.println("숫자가 아닙니다");
		}
	}

}
