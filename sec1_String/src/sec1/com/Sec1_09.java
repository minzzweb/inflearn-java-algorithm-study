package sec1.com;

import java.util.Scanner;

//숫자만 추출 (48~57)
//tge0a1h205er
//자연수 1205

public class Sec1_09 {

	private int solution(String str) {
		int answer = 0;
		char[] s  = str.toCharArray();
		for(char x :s) {
			if(x>=48 && 57>=x) {
				System.out.print(x);
				answer = answer*10 +(x-48);
				//System.out.println(answer);
				System.out.println("");
			}
		}

			return answer;
			
	}

	
	public static void main(String[] args) {
		Sec1_09 T = new Sec1_09();
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine(); 
		

		System.out.print(T.solution(str));

	}


}
