//最小値
import java.util.Scanner;

class Sample7_30{
	static int min(int a, int b){
		return a <= b ? a : b;
	}
	
	static int min(int a, int b, int c){
		int min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		return min;
	}
	
	static int min(int[] a){
		int min = a[0];
		for(int i = 0; i < a.length; i++)
			if(min > a[i]) min = a[i];
		return min;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a = "); int a = scan.nextInt();
		System.out.print("b = "); int b = scan.nextInt();
		System.out.print("c = "); int c = scan.nextInt();
		int[] x = {a, b, c};
		System.out.println("x[0] = " + x[0] + ", x[1] = " + x[1] + ", x[2] = " + x[2]);
		
		System.out.println("a,bの最小値  ：" + min(a, b));
		System.out.println("a,b,cの最小値：" + min(a, b, c));
		System.out.println("x[]の最小値  ：" + min(x));
	}
}
		