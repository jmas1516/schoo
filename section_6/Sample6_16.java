//s—ñ‚ÌÏ
import java.util.Scanner;

class Sample6_16{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		int[][] c = new int[4][4];
		
		//a[][]‚Ì—v‘f‚É‘ã“ü
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				System.out.print("a[" + i + "][" + j +"] = ");
				a[i][j] = scan.nextInt();
			}
		}
		//b[][]‚Ì—v‘f‚É‘ã“ü
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				System.out.print("b[" + i + "][" + j +"] = ");
				b[i][j] = scan.nextInt();
			}
		}
		
		//a*b‚ÌŒvZ
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++)
				for(int k = 0; k < 3; k++)
					c[i][j] += a[i][k] * b[k][j];
		
		System.out.println("a ~ b = ");
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				System.out.printf("%3d",c[i][j]);
			}
			System.out.println();
		}
	}
}