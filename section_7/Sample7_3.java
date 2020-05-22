//中央値
class Sample7_3{
	static int med(int a, int b, int c){
		int med = a;
		if(a <= b && b <= c) med = b;
		if(c <= b && b <= a) med = b;
		if(a <= c && c <= b) med = c;
		if(b <= c && c <= a) med = c;
		return med;
	}
	
	public static void main(String[] args){
		
		System.out.println("1,2,3の中央値 : " + med(1, 2, 3));
		System.out.println("1,3,2の中央値 : " + med(1, 3, 2));
		System.out.println("2,1,3の中央値 : " + med(2, 1, 3));
		System.out.println("2,3,2の中央値 : " + med(2, 3, 2));
		System.out.println("2,2,3の中央値 : " + med(2, 2, 3));
		System.out.println("2,2,2の中央値 : " + med(2, 2, 2));
	}
}