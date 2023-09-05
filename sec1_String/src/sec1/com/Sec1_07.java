package sec1.com;

import java.util.Scanner;

//회문 문자열 
//대소문자 비교 안함
//gooG
public class Sec1_07 {

	private String solution(String str) {
		String answer = "YES";
//		str = str.toUpperCase();
//		int len = str.length();
//		
//		for(int i=0; i<len/2; i++) {
//			if(str.charAt(i)!=str.charAt(len-i-1)) {
//				answer = "NO";
//			}
        String tmp = new StringBuilder(str).reverse().toString();
        //System.out.print("tmp : " + tmp);
        if(str.equalsIgnoreCase(tmp)) answer ="YES";
	
			return answer;
			
	}

	
	public static void main(String[] args) {
		Sec1_07 T = new Sec1_07();
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		System.out.print(T.solution(str));

	}

}
