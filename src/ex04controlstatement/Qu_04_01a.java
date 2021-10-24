package ex04controlstatement;

import java.io.IOException;

public class Qu_04_01a 
{

	public static void main(String[] args) throws IOException
	{
//하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 
//삼항연산자를 이용하여 구현하시오.
		System.out.println("문자를 입력하세요");
		int ascii =System.in.read();
		System.out.println("입력한 문자는 "+ (char)ascii);
		String asciiresult =(ascii >='0' && ascii <='9') ? "숫자이다":"숫자가 아니다";
		System.out.println("입력한 "+(char)ascii+"는 "+ asciiresult);
		
	}

}
