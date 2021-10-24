package quiz;

import java.util.Random;

public class Selectionsort {

	public static void main(String[] args) {
		
		int[] select = new int [10];
		int small;
		int tmp;
		Random random = new Random();
		//배열에 난수 담기 후 첫배열 출력
		for(int i=0; i<select.length; i++) {
			select[i] = random.nextInt(100)+1;
			System.out.printf("%d ", select[i]);
		}
		System.out.printf("\n\n");
		
		
		
		for(int i=0; i<select.length-1; i++) {
			small=i;	//시작값을 제일 작은인덱스로 지정
			
			for(int k=0; k<i+1; k++)	//단순히 과정을 보여주기위해 앞부분출력
				System.out.printf("%d ",select[k]);
			
			for(int j=i+1; j<select.length; j++) {
				
				if(select[j]<select[small])	//작은인덱스보다 작은값 찾기
					small = j;
			
				System.out.printf("%d ",select[j]);
			}
			
			tmp=select[i];				//자리바꾸기
			select[i]=select[small];
			select[small]=tmp;
		
			System.out.println();
		}
		
		for(int i=0; i<select.length; i++) //자리바꾸기후마지막 과정 안보여서 출력
			System.out.printf("%d ", select[i]);
	}
}
