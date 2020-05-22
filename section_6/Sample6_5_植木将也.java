//”z—ñ “ü—Í
import java.util.Scanner;

class Sample6_5{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("—v‘f”F"); final int n = scan.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print("a[ " + i + " ] = ");
			a[i] = scan.nextInt();
		}
		
		System.out.print("a = {");
		for(int i = 0; i < n; i++){
			System.out.print(a[i]);
			if(i == (n-1)) break;
			System.out.print(", ");
		}
		System.out.println("}");
	}
}	