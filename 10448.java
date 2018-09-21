import java.util.*;

public class Main {

	static int[] t = new int[50];
	static int n,k;
	
	static boolean dfs(int sum, int cnt){
		if(cnt==3){
			if(sum==k){
				return true;
			}
			return false;
		}
		
		for(int i=1; i<=n; i++){
			if(dfs(sum+t[i],cnt+1)){
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
	
		for(int i=1; i<50; i++){
			t[i] = i*(i+1)/2;
			if(t[i]>=1000) break;
		}
		
		while(tc-->0){
			boolean possible = false;
			k = sc.nextInt();
			n = 0;
			
			for(int i=1; i<50; i++){
				if(t[i]>=k){
					n = i; 
					break;
				}
			}
			
			for(int i=1; i<=n; i++){
				if(dfs(t[i],1)){
					possible = true;
					break;
				}
			}
			if(possible){
				System.out.println(1);
			}
			else{
				System.out.println(0);
			}
				
		}
		
	}
}
