//–_ƒOƒ‰ƒtc
import java.util.Scanner;
import java.util.Random;

class Sample6_4{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		System.out.print("—v‘f” : "); int n = scan.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(10);
		}
		
		int max = 0;
		for(int i = 0; i < a.length; i++){
			if(max < a[i]) max = a[i];
		}
		
		for(int i = 0; i < max; i++){
			for(int j = 0; j < a.length; j++){
				if(a[j] >= (max - i)) System.out.print("* ");
				else                  System.out.print("  ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < a.length; i++){
			System.out.print("--");
		}
		System.out.println();
		
		for(int i = 0; i < a.length; i++){
			System.out.print(i%10 + " ");
		}
		System.out.println();
	}
}