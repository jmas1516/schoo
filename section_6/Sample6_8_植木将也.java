//���ρA���v�l
import java.util.Scanner;

class Sample6_8{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�v�f���F"); final int n = scan.nextInt();
		
		double[] a = new double[n];
		
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "]�F");
			a[i] = scan.nextDouble();
		}
		
		double sum = 0; //���v
		for(double i : a)
			sum += i;
		
		System.out.println("���v�F" + sum + " ���ρF" + (sum / n ));
	}
}