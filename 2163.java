*** 2163 : 초콜릿 자르기 ***

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = n-1 + n*(m-1);  
		
		System.out.println(ans);
	}
}
