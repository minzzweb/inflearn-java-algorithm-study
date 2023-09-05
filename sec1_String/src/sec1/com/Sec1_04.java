package sec1.com;

import java.util.ArrayList;
import java.util.Scanner;

//n개의 단어가 주어지면 각 단어를 뒤집어라 

public class Sec1_04 {
	
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		ArrayList<String> answer2 = new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			
			answer.add(tmp);
		}
		//return answer; //배열
		
		//직접 뒤집기
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt =0, rt=x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			
			String tmp=String.valueOf(s);
			answer2.add(tmp);
		}
		return answer2; //배열
	}

	public static void main(String[] args) {
		Sec1_04 T = new Sec1_04();
		
		Scanner scanner = new Scanner(System.in);
	
		
		//첫줄에 N개의 단어 
		int n = scanner.nextInt();	
		
		String[] str = new String[n];
		
		for(int i=0; i<n;i++) {
			str[i] = scanner.next();
		}
		
		for(String x : T.solution(n,str)) {
			System.out.println(x);
		}
	}

}
