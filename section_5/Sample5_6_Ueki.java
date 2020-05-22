//•‚“®¬”“_‚Ì¸“x

class Sample5_6{
	public static void main(String[] args){
		float sumf = 0.0f;
		int   sumi = 0;
		
		System.out.printf("%9s   %9s\n","float","int");
		System.out.println("---------------------");
		for(int i = 1; i <= 1000; i++){
			
			sumf += 0.001;
			sumi += 1;
			
			System.out.printf("%8.7f   %8.7f\n", sumf, (sumi/1000.0));
		}
	}
}