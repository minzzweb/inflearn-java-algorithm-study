package sec1.com;

import java.util.Scanner;

//문제
//한 개의 문장이 주어지면 그 문장속에서 가장 긴 단어를 출력하라
//공백으로 구분 -> split(" ")
// 가장 길이가 긴 단어가 여러개이면 문장 속 가장 앞쪽에 위치한 단어를 답으로하라 
//it is time to study 
public class Sec1_03 {
	
	public String solution(String str) {
		
		//방법1
		String answer = "";
		int m = Integer.MIN_VALUE;
//		String[] s = str.split(" ");
//		for(String x : s) {
//			int len = x.length();
//			if(len>m) {
//				m = len;
//				answer = x;
//
//			}
//		}
//		//System.out.println(answer);
//		
		//방법2
		int pos;
		while((pos=str.indexOf(' '))!=-1) {
			String tmp = str.substring(0,pos);	
			int len = tmp.length();
			if(len>m) {
				m=len;
				answer = tmp;
			}
			str = str.substring(pos+1);
			 
		}
	   if(str.length()>m) answer = str;
	 
		return answer;
		
	}

	public static void main(String[] args) {
		
		Sec1_03 sec = new Sec1_03();
		
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); //한줄은 nextLine
        
        System.out.print(sec.solution(str));
        

	}

}
