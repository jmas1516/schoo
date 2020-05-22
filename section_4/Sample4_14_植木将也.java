//‘˜a
import java.util.Scanner;
class Sample4_14{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	int n;
	do{
		System.out.print("©‘R”F");
		n = scanner.nextInt();
	}while(n<=0);
	
	System.out.println("‘˜a");
	int sum = 0;
	for(int i = 1; i <= n; i++){
		sum += i;
		System.out.print(i);
		if ( i < n ) System.out.print(" + ");
	}
	System.out.println(" = " +  sum);
	}
}