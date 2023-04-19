package api.lang.string;

import java.util.Scanner;

public class StringIndexofQuiz {

	public static void main(String[] args) {
			// 1. 특정 문장을 스캐너로 입력받으세요
			Scanner scan = new Scanner(System.in);
			System.out.println("전체 문장을 입력해주세요.");
			String sentence = scan.nextLine();
			
			// 2. 1에서 입력받은 문장에서 조회할 단어를 적으세요.
			System.out.println("찾을 단어를 입력해주세요.");
			String targetVoca = scan.next();
			// 3. 단어가 몇 개 있는지 카운팅하고, 몇 번 인덱스에 각각 있는지
			//    콘솔에 찍어주세요.
			int sum = 0; 
			int nextIdx = 0;
			int lastIdx = 0;
			boolean check = true; 
			
			for(nextIdx = 0; sentence.indexOf(targetVoca, nextIdx) != -1; nextIdx++){
				lastIdx = nextIdx;
				System.out.println("인덱스 번호 : " + lastIdx);
				sum += 1;
			}
			System.out.println("더 이상 검색값이 없습니다.");
			System.out.println("인덱스 개수 : " + sum);
				
			}
}
			
/*
			while(check) {
				lastIdx = sentence.indexOf(targetVoca, nextIdx);
				if(lastIdx == -1) {
					System.out.println("더 이상 검색값이 없습니다.");
					check = false;
				}else {
					System.out.println("인덱스 번호 : " + lastIdx);
					nextIdx = (lastIdx + 1);
					sum += 1;
				}
			}
			System.out.println("인덱스 개수 : " + sum);
	}
}
*/
		






			
/*
			int sum = 0;// 감지 횟수
			int nextIdx = 0;// 다음 조회시 시작 인덱스
			int lastIdx = 0;// 조회 결과 인덱스
			boolean flag = true;// 반복 조회 실행 여부
			System.out.println(sentence + "에서 " + targetVoca + "를 찾습니다.");
			while(flag) {
				
				lastIdx = sentence.indexOf(targetVoca, nextIdx);
						
				if(lastIdx == -1) {
					System.out.println("끝");
					flag = false;
				}else {
					System.out.println("계속" + lastIdx);
					nextIdx = (lastIdx + 1);
				}
		
				
				// 타겟 단어를 마지막으로 감지된 번호로 조회
				lastIdx = sentence.indexOf(targetVoca, nextIdx);
				
				if(lastIdx == -1) {// if문에서 단어 조회 결과 = 인덱스가 -1이면, 탈출
					System.out.println("단어 찾기가 종료되었습니다.");
					flag = false;
				} else {
					System.out.println("단어 감지 인덱스 : " + lastIdx);
					nextIdx = (lastIdx + 1);// 결과 인덱스 다음 번호부터 다시 조회
					sum += 1;// 감지된 단어 개수 반영하기
				}
			}
			System.out.println(targetVoca + "의 개수는 " + sum + "개 입니다.");
			scan.close();
		}
}
*/