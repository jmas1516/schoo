import java.util.Scanner;

class Sample2_5{
	public static void main(String[] arg){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("x�̒l�F");
		double x = stdIn.nextDouble();
		
		System.out.print("y�̒l");
		double y = stdIn.nextDouble();
		
		System.out.println("���v�́F" + (x+y));
		System.out.println("���ς́F" + (x+y)/2);
	}
}
