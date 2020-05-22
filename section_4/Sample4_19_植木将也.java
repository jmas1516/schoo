//入力された月の表示

import java.util.Scanner;
class Sample4_19{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int retry;
		
		do {
			int month;
			do{
				System.out.print("季節を求めます。\n何月ですか？：");
				month = scanner.nextInt();
			}while(month <= 0 || month >= 13);
			
			if (month >= 3 && month <= 5)
				System.out.println("春");
			else if (month >= 6 && month <= 8)
				System.out.println("夏");
			else if (month >= 9 && month <= 11)
				System.out.println("秋");
			else if (month == 12 || month == 1 || month == 2)
				System.out.println("冬");
			
			System.out.print("もう一度？ 1...Yes/ 2...No");
			retry = scanner.nextInt();
		}while (retry == 1);
	}
}