//平均、合計値
import java.util.Scanner;

class Sample6_8{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("要素数："); final int n = scan.nextInt();
		
		double[] a = new double[n];
		
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "]：");
			a[i] = scan.nextDouble();
		}
		
		double sum = 0; //合計
		for(double i : a)
			sum += i;
		
		System.out.println("合計：" + sum + " 平均：" + (sum / n ));
	}
}