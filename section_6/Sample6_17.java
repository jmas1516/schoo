//英語、数学平均点
import java.util.Scanner;
class Sample6_17{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = 6; //生徒数
		int[][] point = new int[n][2];
		
		//点数入力
		for(int i = 0; i < n; i++){
			System.out.println((i+1) + "人目");
			
			for(int j = 0; j < 2; j++){
				if(j == 0) System.out.print("国語の点数 : ");
				else       System.out.print("数学の点数 : ");
				point[i][j] = scan.nextInt();
			}
		}
		
		//科目の平均点
		int[] sumStu = new int[n]; //学生の合計点
		int sumLan = 0; //国語の合計点
		int sumMat = 0; //数学の合計点
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < 2; j++){
				sumStu[i] += point[i][j];
				if(j == 0) sumLan += point[i][j];
				if(j == 1) sumMat += point[i][j];
			}
		}
		
		//出力
		System.out.println("       平均点 ");
		System.out.printf ("国語   %4.1f\n", (sumLan / 6.0));
		System.out.printf ("数学   %4.1f\n", (sumMat / 6.0));
		System.out.println();
		for(int i = 0; i < n; i++)
			System.out.printf((i+1) + "人目  %4.1f\n", (sumStu[i] / 2.0));
	}
}