//ビット表示
class Sample7_32{
	//--- byte型のbit構成を表示 ---//
	static void printBits(byte x){
		for(int i = 7; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		System.out.println();
	}
	
	//--- short型のbit構成を表示 ---//
	static void printBits(short x){
		for(int i = 15; i >= 0; i--)
				System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		System.out.println();
	}
	
	//--- int型のbit構成を表示 ---//
	static void printBits(int x){
		for(int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		System.out.println();
	}
	
	//--- long型のbit構成を表示 ---//
	static void printBits(long x){
		for(int i = 61; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		System.out.println();
	}
	
	public static void main(String[] args){
		int x = 3;
		System.out.println("(byte) x = " + (byte)x );
		System.out.print("bit構成："); printBits((byte)x);
		
		System.out.println("(short) x = " + (short)x );
		System.out.print("bit構成："); printBits((short)x);
		
		System.out.println("(int) x = " + x );
		System.out.print("bit構成："); printBits(x);
		
		System.out.println("(long) x = " + (long)x );
		System.out.print("bit構成："); printBits((long)x);
	}
}