//—”“ü—Í
import java.util.Scanner;
import java.util.Random;
class Sample6_11{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		int n;
		do{
			System.out.print("—v‘f”(1ˆÈã10ˆÈ‰º)F"); 
			n = scan.nextInt();
		}while(n < 0 || n > 10);
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
			do{
				a[i] = 1 + rand.nextInt(10);
				
				for(int j = 0; j < i; j++)
					if(a[i] == a[j]) a[i] = -1;
				
			}while(i > 0 && a[i] == -1);
			
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}