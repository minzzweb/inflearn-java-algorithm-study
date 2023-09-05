package sec1.com;

import java.util.Arrays;
import java.util.Scanner;

//문제
//유효한 팬린드롬 
//앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팬린드롬이라고 한다. 
//알파벳만 가지고 회문 검사 , 대소문자 구분하지 않음 
//알파벳 이외의 문자들은 무시 
//found7, time: study; Yduts; emit, 7Dnuof
public class Sec1_08 {

	
	private String solution(String str) {
		String answer = "NO";

		str = str.toUpperCase().replaceAll("[^A-Z]","");
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp))answer="YES";
	    
			return answer;
			
	}

	
	public static void main(String[] args) {
		Sec1_08 T = new Sec1_08();
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine(); 
		

		System.out.print(T.solution(str));

	}

}
