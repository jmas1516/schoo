//�j���̉p��

import java.util.Scanner;
import java.util.Random;

class Sample6_15{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		String[] week   = {"sunday", "monday", "tuesday", "ednesday", "thursday", "friday", "saturday"};
		String[] weekJp = {"��", "��", "��", "��", "��", "��", "�y"};
		
		int    x = -1    ; //�A������, ���͕�����
		int    n         ; //�����_��0~6
		String y = ""    ; //����
		int    retry = 0 ; //retry����
		
		System.out.println("�p��̗j�������������œ��͂��Ă�������");
		do{
			n = rand.nextInt(7);
			if(n == x) continue;
			x = n;
			
			System.out.print(weekJp[n] + "�j��:");
			y = scan.next();
			
			if(y.equals(week[n])) System.out.println("Excellemt!!");
			else             System.out.println("The correct answer is " + week[n]);
			
			System.out.print("Retry? Yes...1, No...0 : ");
			retry = scan.nextInt();
			
		}while(retry == 1);
	}
}