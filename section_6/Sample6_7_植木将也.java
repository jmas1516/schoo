//key
import java.util.Random;
import java.util.Scanner;

class Sample6_7{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		final int n = 12;
		int[] a = new int[n];
		
		for(int j = 0; j  < n; j++)
			a[j] = rand.nextInt(10);
		
		System.out.print("配列aの全要素の値\n{ ");
		for (int j = 0; j < n; j++)
			System.out.print(a[j] + " ");
		System.out.println("}");
		
		System.out.print("探し出す値 : ");
		int key = scan.nextInt();
		
		int i;
		for (i = (n-1); i >= 0 ; i --)
			if(a[i] == key)
				break;
			
		
		if(i < n)
			System.out.println("それはa[" + i + "]にあります");
		else
			System.out.println("それはありません");
	}
}