//zñÌSvfÌv
import java.util.Scanner;

class Sample7_15{
	//--- zñaÌvfÌa ---//
	static int sumOf(int[] a){
		int sumOf = 0;
		for(int i = 0; i < a.length; i++){
			sumOf += a[i];
		}
		return sumOf;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("zñaÌvfF"); n = scan.nextInt();
		}while(n <= 0);
		
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "] = "); a[i] = scan.nextInt();
		}
		
		System.out.println("zñaÌvfÌaÍ" + sumOf(a));
	}
}