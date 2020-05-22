//”z—ñ‚Ì¶¬

import java.util.Random;
class Sample6_1{
	public static void main(String[] args){
		Random rand = new Random();
		
		int[] a = new int[5];
		
		for(int i = 0; i < 5; i++){
			a[i] = rand.nextInt(100);
			System.out.printf("a[ "+i+" ] = %3d\n",a[i]);
		}
	}
}