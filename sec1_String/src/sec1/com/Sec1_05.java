package sec1.com;

import java.util.Scanner;

//영어 알파벳만 뒤집고 
//특수 문자는 자기 자리 그대로
//a#b!GE*T@S
//S#T!EG*b@a
public class Sec1_05 {
	
	public String solution (String str) {
		String answer = "";
		char[] strArray = str.toCharArray();
		int lt = 0;
		int rt = str.length()-1;
		
		while(lt<rt) {
			if(!Character.isAlphabetic(strArray[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(strArray[rt])) {
				rt--;
			}else {
				char tmp = strArray[lt];
				strArray[lt] = strArray[rt];
				strArray[rt] = tmp;
				lt++;
				rt--;
				
			}
		}
		answer = String.valueOf(strArray);
		
		return answer;
		
	}
	

	public static void main(String[] args) {
		Sec1_05 T = new Sec1_05();
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		System.out.print(T.solution(str));
		
	}

}
