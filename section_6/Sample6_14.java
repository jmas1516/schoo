//単語テスト「月」
import java.util.Scanner;
import java.util.Random;

class Sample6_14{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		String[] month = { "Janualy", "Februaly", "March", "April", "May", "June",
		                "July", "August", "September", "October", "November", "December"};
		
		System.out.println("英語の月名を入力してください。");
		System.out.println("なお先頭は大文字で、2文字目以降は小文字とします。");
		
		int[] x = {-1, 0}; //月(rand)
		String y;             //月(scan)
		int retry;            //retry
		do{
			
			x[1] = rand.nextInt(12);
			if(x[0] == x[1]){
				retry = 1; continue;
			}
			x[0] = x[1];
			
			System.out.print((x[0] + 1) + "月:");
			y = scan.next();
			
			if(month[x[0]].equals(y)) System.out.println("Excellent!!");
			else                      System.out.println("Wrong...");
			
			System.out.print("Retry ? Yes...1, No...0 : ");
			retry = scan.nextInt();
		}while(retry == 1);
	}
}