//�ŏ��l
import java.util.Random;

class Sample7_2{
	static int min(int a, int b, int c){
		int min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		return min;
	}
	
	public static void main(String[] args){
		Random rand = new Random();
		
		int a = rand.nextInt(101) - 50;
		int b = rand.nextInt(101) - 50;
		int c = rand.nextInt(101) - 50;
		
		System.out.println("�ϐ�a, b, c��-50�ȏ�50�ȉ��������_���ɑ��");
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + " �ŏ��l��" + min(a, b, c));
	}
}