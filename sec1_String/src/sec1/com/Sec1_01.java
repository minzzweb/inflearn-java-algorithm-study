package sec1.com;

import java.util.Scanner;

// 입력문자 Computercooler
// 첫 줄에 해당 문자의 개수를 출력한다.
public class Sec1_01 {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		System.out.println(str + " " + t);
		
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i)==t)
//				answer ++;
//		}
		
		for(char x : str.toCharArray()){
			if(x==t) 
				answer ++;
		}
		 return answer;
	}

	public static void main(String[] args) {
		Sec1_01 Sec = new Sec1_01();
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next(); //문자열
		
		char c = scanner.next().charAt(0); //특정 문자 (한개)
		
		System.out.print(Sec.solution(str,c));
		
		
		 
	}

}
