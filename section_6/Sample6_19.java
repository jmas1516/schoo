//合計・平均表作成
import java.util.Scanner;

class Sample6_19{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int noClass;    //クラス数
		int[][] point;  //得点
		int[] sum;      //各クラスの合計得点
		int sumAll = 0; //学年の合計得点
		int n = 0;      //人数
		
		//クラス数決定
		System.out.println("学年で行ったテストの合計点・平均点を計算する");
		System.out.print("クラス数："); noClass = scan.nextInt();
		
		//クラスごとの人数
		point = new int[noClass][];
		for(int i = 0; i < noClass; i++){
			System.out.print((i + 1) + "組の人数：");
			point[i] = new int[scan.nextInt()];
		}
		
		//点数代入
		for(int i = 0; i < noClass; i++){
			for(int j = 0; j < point[i].length; j++){
				System.out.print((i + 1) + "組" + (j + 1) + "番の点数 : ");
				point[i][j] = scan.nextInt();
			}
		}
		
		//合計得点
		sum = new int[noClass];
		for(int i = 0; i < noClass; i++){
			for(int j = 0; j < point[i].length; j++){
				sum[i] += point[i][j]; //クラスごと
				sumAll += point[i][j]; //学年
				n      += 1;           //学年全体の人数
			}
		}
		
		//出力
		System.out.printf("  組 |%6s%6s\n","合計","平均");
		System.out.println("----------------------");
		for(int i = 0; i < noClass; i++){
			System.out.printf("%2d組 |%8d%8.1f\n", (i + 1), sum[i],((double)sum[i] / point[i].length));
		}
		System.out.println("----------------------");
		System.out.printf("  計 |%8d%8.1f\n", sumAll, ( (double)sumAll / n));
	}
}