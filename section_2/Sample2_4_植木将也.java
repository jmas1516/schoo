import java.util.Scanner;

class Sample2_4{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int x = stdIn.nextInt();
		
		System.out.println("10���������l�́F" + (10 + x));
		System.out.println("10���������l�́F" + (x - 10));
	}
}
