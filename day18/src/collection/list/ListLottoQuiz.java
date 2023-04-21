package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListLottoQuiz {

	public static void main(String[] args) {
		
/*
		1. Lotto복권은 1~45범위의 숫자중 6개를 뽑아 추첨하는 복권입니다.
		List<Integer> 타입 변수에 구현체를 대입해주시고
		해당 변수에 ((중복 없이)) 6개의 번호가 들어가도록 해 주세요.  

		2. 당첨될 때까지 다시 번호를 무작위로 계속 뽑는 코드를 작성해서 몇 번 만에 로또복권이 당첨되는지 확인하는 시뮬레이션 코드를 만들어주세요.
		hint : .equals()로 배열끼리 비교할 때는 배열 내부 요소의 순서와 자료 모두를 비교합니다
		ex) [1, 2, 3] 과 [1, 2, 3]은 true로 비교되지만
		[1, 2, 3]과 [1, 3, 2]는 false로 비교됩니다.
*/
		
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>(6);
		List<Integer> list2 = new ArrayList<>(6);
		Random ra = new Random();
		
		int lottoNumber = -1;
		int chooseNumber = -1;
		
		for(int i = 0; i < 6; i++) {
			lottoNumber = ra.nextInt(45) + 1;
			list.add(lottoNumber);
		}
		Collections.sort(list);
		System.out.println(list);

		for(int j = 0; j < 6; j++) {
			chooseNumber = ra.nextInt(45) + 1;
			list2.add(chooseNumber);
		}
		Collections.sort(list2);
		System.out.println(list2);
		
		while(true) {
		if(list.equals(list2)) {
			System.out.println("모두 맞췄습니다. 당첨번호는 " + list);
		}else{
			System.out.println("틀렸습니다. 다음 기회에... 선택한 번호는 " + list2 + "였습니다.");
		}
	}
}
}


/*
 * 
 * list2.add(0, chooseNumber1);
		list2.add(1, chooseNumber2);
		list2.add(2, chooseNumber3);
		list2.add(3, chooseNumber4);
		list2.add(4, chooseNumber5);
		list2.add(5, chooseNumber6);
 * 
int chooseNumber1 = 0;
int chooseNumber2 = 0;
int chooseNumber3 = 0;
int chooseNumber4 = 0;
int chooseNumber5 = 0;
int chooseNumber6 = 0;

int lottoNumber1 = ra.nextInt(45) + 1;
int lottoNumber2 = ra.nextInt(45) + 1;
int lottoNumber3 = ra.nextInt(45) + 1;
int lottoNumber4 = ra.nextInt(45) + 1;
int lottoNumber5 = ra.nextInt(45) + 1;
int lottoNumber6 = ra.nextInt(45) + 1;

list.add(0, lottoNumber1);
list.add(1, lottoNumber2);
list.add(2, lottoNumber3);
list.add(3, lottoNumber4);
list.add(4, lottoNumber5);
list.add(5, lottoNumber6);
		
System.out.println(list);

System.out.println("1번째 번호 입력");
	chooseNumber = scan.nextInt();
	System.out.println("2번째 번호 입력");
	chooseNumber2 = scan.nextInt();
	System.out.println("3번째 번호 입력");
	chooseNumber3 = scan.nextInt();
	System.out.println("4번째 번호 입력");
	chooseNumber4 = scan.nextInt();
	System.out.println("5번째 번호 입력");
	chooseNumber5 = scan.nextInt();
	System.out.println("6번째 번호 입력");
	chooseNumber6 = scan.nextInt();
		
*/




