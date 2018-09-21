import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long sum = 0;
		int MAX = 100000;
		long n = 0;
		
		for(long i=1; i<=MAX; i++){
			sum = i*(i+1)/2;
			if(sum==s){
				System.out.println(i);
				return;
			}
			else if(sum>s){
				n = i;
				break;
			}
		}
		
		while(true){
			n--;
			sum = n*(n+1)/2;
			if(s-sum>n){
				n++;
				break;
			}
		}
		System.out.println(n);
	}
}
