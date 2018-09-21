import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int s = (int)Math.sqrt(m);
		int e = (int)Math.sqrt(n);
		int min = 0;
		int sum = 0;
		
		boolean nothing = true;
		
		for(int i=s; i<=e; i++){
			int num = i*i;
			if(num>=m && num<=n){
				if(nothing){
					min = num;
					nothing = false;
				}
				sum+=num;
			}
		}
		
		if(nothing) System.out.println(-1);
		else{
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
