//�P��e�X�g�u���v
import java.util.Scanner;
import java.util.Random;

class Sample6_14{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		String[] month = { "Janualy", "Februaly", "March", "April", "May", "June",
		                "July", "August", "September", "October", "November", "December"};
		
		System.out.println("�p��̌�������͂��Ă��������B");
		System.out.println("�Ȃ��擪�͑啶���ŁA2�����ڈȍ~�͏������Ƃ��܂��B");
		
		int[] x = {-1, 0}; //��(rand)
		String y;             //��(scan)
		int retry;            //retry
		do{
			
			x[1] = rand.nextInt(12);
			if(x[0] == x[1]){
				retry = 1; continue;
			}
			x[0] = x[1];
			
			System.out.print((x[0] + 1) + "��:");
			y = scan.next();
			
			if(month[x[0]].equals(y)) System.out.println("Excellent!!");
			else                      System.out.println("Wrong...");
			
			System.out.print("Retry ? Yes...1, No...0 : ");
			retry = scan.nextInt();
		}while(retry == 1);
	}
}