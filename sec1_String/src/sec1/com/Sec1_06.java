package sec1.com;

import java.util.Scanner;

//중복 문자 제거 
//소문자로 된 한개의 문자열이 입력되면 
//중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
//ksekkset
public class Sec1_06 {
	
	private String solution(String str) {
		String answer = "";
		
		char[] charArray = str.toCharArray();
		for(int i=0; i<str.length(); i++) {	
			//str의 i번째 char의 인덱스가  i번째랑 같으면 처음나온 것
			if(str.indexOf(str.charAt(i))==i) {
				answer += str.charAt(i);
			}
			
		}
		
		return answer;
	}

	
	public static void main(String[] args) {
		Sec1_06 T = new Sec1_06();
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		System.out.print(T.solution(str));

	}



}
