//ビット確認
class Sample7_11{
	public static void main(String[] args){
		System.out.println("8 << 1  : "  + (8 << 1));
		System.out.println("8 >> 1  : "  + (8 >> 1));
		System.out.println("8 >>> 1 : "  + (8 >>> 1));
		System.out.println();
		
		System.out.println("8 << 2  : "  + (8 << 1));
		System.out.println("8 >> 2  : "  + (8 >> 1));
		System.out.println("8 >>> 2 : "  + (8 >>> 1));
		System.out.println();
		
		System.out.println("-8 << 1  : " + (-8 << 1));
		System.out.println("-8 >> 1  : " + (-8 >> 1));
		System.out.println("-8 >>> 1 : " + (-8 >>> 1));
		System.out.println("~(-8 >>> 1) + 1 : " + (~(-8 >>> 1) + 1));
	}
}