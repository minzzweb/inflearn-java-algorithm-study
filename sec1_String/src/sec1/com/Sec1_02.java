package sec1.com;

import java.util.Scanner;

//문제 :
//문자열을 입력받아 대문자는 소문자로
//소문자는 대문자로 변환하여 출력
//StuDY
//sTUdy
public class Sec1_02 {
	
    public void solution(String str1) {
    	String answer ="";
    	for(char c : str1.toCharArray()) {
    		if(Character.isLowerCase(c)){
    			answer += Character.toUpperCase(c);
    		}else if(Character.isUpperCase(c)) {
    			answer += Character.toLowerCase(c);
    		}
    	}
    	
    	System.out.print("answer : " + answer);
    }

	public static void main(String[] args) {
		Sec1_02 sec = new Sec1_02();
		
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		sec.solution(str1);
	}

}
