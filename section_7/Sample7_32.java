//�r�b�g�\��
class Sample7_32{
	//--- byte�^��bit�\����\�� ---//
	static void printBits(byte x){
		for(int i = 7; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		System.out.println();
	}
	
	//--- short�^��bit�\����\�� ---//
	static void printBits(short x){
		for(int i = 15; i >= 0; i--)
				System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		System.out.println();
	}
	
	//--- int�^��bit�\����\�� ---//
	static void printBits(int x){
		for(int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		System.out.println();
	}
	
	//--- long�^��bit�\����\�� ---//
	static void printBits(long x){
		for(int i = 61; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		System.out.println();
	}
	
	public static void main(String[] args){
		int x = 3;
		System.out.println("(byte) x = " + (byte)x );
		System.out.print("bit�\���F"); printBits((byte)x);
		
		System.out.println("(short) x = " + (short)x );
		System.out.print("bit�\���F"); printBits((short)x);
		
		System.out.println("(int) x = " + x );
		System.out.print("bit�\���F"); printBits(x);
		
		System.out.println("(long) x = " + (long)x );
		System.out.print("bit�\���F"); printBits((long)x);
	}
}