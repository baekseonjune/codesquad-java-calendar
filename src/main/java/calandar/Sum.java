package calandar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// 입력 : 키보드로 두 수의 입력을 받는다.
		// 출력 : 화면에 두 수의 합을 출력한다.
		int a,b; 
		Scanner scn = new Scanner(System.in);
		String s1,s2;
		System.out.println("두 수를 입력하세요");
		s1 = scn.next();
		s2 = scn.next();
		//System.out.println(s1 + ", " + s2 );
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		//System.out.println(a + ", " + b );
		int c = a + b;
		System.out.println("두 수의 합은 " + c + "입니다.");
		scn.close(); // scanner 종료
	}

}
