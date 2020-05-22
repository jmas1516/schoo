//配列の全要素表示
import java.util.Random;

class Sample7_33{
	static void printArray(int[] x){
		for(int i = 0; i < x.length; i++){
			System.out.print(x[i]);
			if(i == x.length - 1){
				System.out.println(); break;
			}
			System.out.print(" ");
		}
	}
	
	static void printArray(int[][] x){
		int n = 0; //最大列数
		for(int i = 0; i < x.length; i++)
			if(n < x[i].length) n = x[i].length;
		
		int[] maxN = new int[n]; //列ごとの最大桁数
		int nn;                  //要素の桁数
		for(int i = 0; i < x.length; i++){
			for(int j = 0; j < x[i].length; j++){
				if(x[i][j] >= 0){ //正の数の桁数
					nn = 0;
					for(int k = x[i][j]; k >= 1; k /= 10){
						nn++;
					}
				}else{           //負の数の桁数
					nn = 1;
					for(int k = x[i][j]; k <= -1; k /= 10){
						nn++;
					}
				}
				if(maxN[j] < nn) maxN[j] = nn;
			}
		}
		
		for(int i = 0; i < x.length; i++){
			for(int j = 0; j < x[i].length; j++){
				if(maxN[j] == 0) System.out.print(x[i][j] + " ");
				else System.out.printf("%"+ maxN[j] + "d ",x[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Random rand = new Random();
		
		//1次元配列
		int[] a = new int[rand.nextInt(10) + 1];
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(10001) - 5000;
		}
		System.out.println("配列a"); printArray(a);
		System.out.println("-------------");
		
		//2次元配列
		int[][] b = new int[rand.nextInt(10) + 1][];
		for(int i = 0; i < b.length; i++){
			b[i] = new int[rand.nextInt(5) + 1];
			for(int j = 0; j < b[i].length; j++){
				b[i][j] = rand.nextInt(10001) - 5000;
			}
		}
		System.out.println("配列b"); printArray(b);
	}
}