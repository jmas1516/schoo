//要素数、要素の値が同じ配列を生成
import java.util.Random;

class Sample7_22{
	//--- 同じ配列を生成 ---//
	static int[] arrayClone(int[] a){
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++){
			b[i] = a[i];
		}
		return b;
	}
	
	public static void main(String[] args){
		Random rand = new Random();
		
		int n = rand.nextInt(19) + 1;
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = rand.nextInt(99) + 1;
		}
		
		int[] b = arrayClone(a);
		System.out.println(" i | a[i]   b[i]");
		for(int i = 0; i < n; i++){
			System.out.printf("%2d | %4d   %4d",i, a[i], b[i]);
			System.out.println();
		}
	}
}