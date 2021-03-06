//zñÌSvf\¦
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
		int n = 0; //Ååñ
		for(int i = 0; i < x.length; i++)
			if(n < x[i].length) n = x[i].length;
		
		int[] maxN = new int[n]; //ñ²ÆÌÅå
		int nn;                  //vfÌ
		for(int i = 0; i < x.length; i++){
			for(int j = 0; j < x[i].length; j++){
				if(x[i][j] >= 0){ //³ÌÌ
					nn = 0;
					for(int k = x[i][j]; k >= 1; k /= 10){
						nn++;
					}
				}else{           //ÌÌ
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
		
		//1³zñ
		int[] a = new int[rand.nextInt(10) + 1];
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(10001) - 5000;
		}
		System.out.println("zña"); printArray(a);
		System.out.println("-------------");
		
		//2³zñ
		int[][] b = new int[rand.nextInt(10) + 1][];
		for(int i = 0; i < b.length; i++){
			b[i] = new int[rand.nextInt(5) + 1];
			for(int j = 0; j < b[i].length; j++){
				b[i][j] = rand.nextInt(10001) - 5000;
			}
		}
		System.out.println("zñb"); printArray(b);
	}
}