//�R�ϐ��̕���
import java.util.Scanner;

class Sample5_5{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����x:"); int x = scan.nextInt();
		System.out.print("����y:"); int y = scan.nextInt();
		System.out.print("����z:"); int z = scan.nextInt();
		
		double ave = (double)(x + y + z) / 3;
		
		System.out.println("���ρF" + ave);
	}
}